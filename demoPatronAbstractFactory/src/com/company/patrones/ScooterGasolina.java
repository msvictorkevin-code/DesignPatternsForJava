package com.company.patrones;

public class ScooterGasolina extends Scooter {

    public ScooterGasolina(String modelo, String color, int potencia) {
        super(modelo, color, potencia);
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("ScooterGasolina{" + "modelo='" + modelo + '\'' + ", color='" + color + '\'' + ", potencia=" + potencia +'}');
    }
}
