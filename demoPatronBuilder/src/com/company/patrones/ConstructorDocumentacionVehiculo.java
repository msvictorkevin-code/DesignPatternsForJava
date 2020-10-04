package com.company.patrones;

public abstract class ConstructorDocumentacionVehiculo {
    protected Documentacion documentacion;

    public abstract void construyeSolicitudPedido(String nombreCliente);
    public abstract void construyeSolicitudMatricula(String nombreSolicitante);
    public Documentacion resultado(){
        return documentacion;
    }
}
