package com.company.patrones;

public class ConstructorDocumentacionVehiculoHtml extends ConstructorDocumentacionVehiculo {

    public ConstructorDocumentacionVehiculoHtml(){
        documentacion = new DocumentacionHtml();
    }

    @Override
    public void construyeSolicitudPedido(String nombreCliente) {
        String documento;
        documento = "<HTML>Solicitud de pedido Cliente:"+nombreCliente+"</HTML>";
        documentacion.agregarDocumento(documento);
    }

    @Override
    public void construyeSolicitudMatricula(String nombreSolicitante) {
        String documento;
        documento = "<HTML>Solicitud de matriculacion Solicitante:"+nombreSolicitante+"</HTML>";
        documentacion.agregarDocumento(documento);
    }
}
