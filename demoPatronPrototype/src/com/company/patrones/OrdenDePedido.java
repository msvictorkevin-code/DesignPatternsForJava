package com.company.patrones;

public class OrdenDePedido  extends Documento{
    public void imprime() {
        System.out.println("Muestra la orden de pedido: "+contenido);
    }

    public void visualiza() {

        System.out.println("Imprime la orden de pedido: "+contenido);
    }
}
