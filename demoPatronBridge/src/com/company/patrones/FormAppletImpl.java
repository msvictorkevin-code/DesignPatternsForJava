package com.company.patrones;

import java.util.Scanner;

public class FormAppletImpl implements FormularioImpl{
    Scanner scanner = new Scanner(System.in);

    @Override
    public void dibujaTexto(String texto) {
        System.out.println("Applet: "+texto);
    }

    @Override
    public String administraZonaInidicada() {
        return scanner.next();
    }
}
