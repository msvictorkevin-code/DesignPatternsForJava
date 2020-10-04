package com.company.patrones;


public class Vendedor {
    protected ConstructorDocumentacionVehiculo constructor;

    public Vendedor(ConstructorDocumentacionVehiculo constructor) {
        this.constructor = constructor;
    }

    public Documentacion construye(String nombreCliente){
        constructor.construyeSolicitudPedido(nombreCliente);
        constructor.construyeSolicitudMatricula(nombreCliente);
        Documentacion documentacion = constructor.resultado();
        return documentacion;
    }
}
