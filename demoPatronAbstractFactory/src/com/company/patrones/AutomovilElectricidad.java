package com.company.patrones;

public class AutomovilElectricidad extends Automovil {

    public AutomovilElectricidad(String modelo, String color, int potencia, double espacio) {
        super(modelo, color, potencia, espacio);
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("AutomovilElectricidad{" + "modelo='" + modelo + '\'' + ", color='" + color + '\'' + ", potencia=" + potencia + ", espacio=" + espacio + '}');
    }
}
