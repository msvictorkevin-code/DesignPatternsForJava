package com.company.patrones;

import java.util.Scanner;

public class Main {

    public static int nAutos = 3;
    public static int nScooters = 2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FabricaVehiculo fabricaVehiculo;
        Automovil[] automovils = new Automovil[nAutos];
        Scooter[] scooters = new Scooter[nScooters];
        System.out.println("Desea utilizar " + "vehiculos electricos (1) o a gasolina (2):");
        String eleccion = scanner.next();
        if (eleccion.equals("1")) {
            fabricaVehiculo = new FabricaVehiculoElectricidad();
        } else {
            fabricaVehiculo = new FabricaVehiculoGasolina();
        }

        for (int index = 0; index < nAutos; index++) {
            automovils[index] = fabricaVehiculo.crearAutomovil("Estandar", "Amarillo", 6 + index, 3.2);
        }
        for (int index = 0; index < nScooters; index++) {
            scooters[index] = fabricaVehiculo.crearScooter("Clasico", "Rojo", 2 + index);
        }

        for (Automovil automovil : automovils) {
            automovil.mostrarCaracteristicas();
        }

        for (Scooter scooter : scooters) {
            scooter.mostrarCaracteristicas();
        }

    }
}
