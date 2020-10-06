package com.company.patrones;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Comercial comercial = Comercial.Instance();
        comercial.setNombre("Comercial Auto");
        comercial.setDireccion("Madrid");
        comercial.setEmail("comercial@comerciales.com");
        visualiza();

    }

    public static void visualiza(){
        Comercial comercial = Comercial.Instance();
        comercial.visualiza();
    }
}
