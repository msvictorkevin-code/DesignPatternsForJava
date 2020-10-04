package com.company.patrones;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConstructorDocumentacionVehiculo constructor = null;
        System.out.println("Desea generar documentacion HTML (1) o PDF (2) :");
        String seleccion= scanner.next();
        if (seleccion.equals("1")){
            constructor = new ConstructorDocumentacionVehiculoHtml();
        }

        if (seleccion.equals("2")){
            constructor = new ConstructorDocumentacionVehiculoPdf();
        }

        Vendedor vendedor = new Vendedor(constructor);
        Documentacion documentacion = vendedor.construye("Victor Kevin");
        documentacion.imprime();
    }
}
