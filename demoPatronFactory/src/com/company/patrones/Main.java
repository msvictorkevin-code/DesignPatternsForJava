package com.company.patrones;

public class Main {

    public static void main(String[] args) {
        Cliente cliente;
        cliente = new ClienteContado();
        cliente.nuevoPedido(2000);
        cliente.nuevoPedido(1000);
        cliente = new ClienteCredito();
        cliente.nuevoPedido(5000);
        cliente.nuevoPedido(3000);
    }
}
