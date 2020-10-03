package com.company.patrones;

public class ScooterElectricidad extends Scooter {

    public ScooterElectricidad(String modelo, String color, int potencia) {
        super(modelo, color, potencia);
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("ScooterElectricidad{" + "modelo='" + modelo + '\'' + ", color='" + color + '\'' + ", potencia=" + potencia +  '}');
    }

}
