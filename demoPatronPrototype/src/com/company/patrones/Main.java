package com.company.patrones;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //INICIALIZACION DE LA DOCUMENTACION EN BLANCO
        DocumentacionEnBlanco documentacionEnBlanco = DocumentacionEnBlanco.Instance();
        documentacionEnBlanco.incluye(new OrdenDePedido());
        documentacionEnBlanco.incluye(new CertificadoCesion());
        documentacionEnBlanco.incluye(new SolicitudMatriculacion());
        //CREACION DE DOCUMENTACION NUEVA PARA DOS CLIENTES
        DocumentacionCliente documentacionCliente1 = new DocumentacionCliente("Martin");
        DocumentacionCliente documentacionCliente2 = new DocumentacionCliente("Simon");
        documentacionCliente1.visualiza();
        documentacionCliente2.visualiza();
    }
}
