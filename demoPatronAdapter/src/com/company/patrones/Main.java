package com.company.patrones;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Documento documento1,documento2;
        documento1 = new DocumentoHtml();
        documento1.setContenido("Hello");
        documento1.dibuja();

        documento2 = new DocumentoPdf();
        documento2.setContenido("Hola");
        documento2.dibuja();
    }
}

