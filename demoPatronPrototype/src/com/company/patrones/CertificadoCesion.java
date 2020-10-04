package com.company.patrones;

public class CertificadoCesion  extends Documento{
    public void imprime() {
        System.out.println("Muestra la certificado de sesion: "+contenido);
    }

    public void visualiza() {
        System.out.println("Imprime la certificado de sesion: "+contenido);
    }
}
