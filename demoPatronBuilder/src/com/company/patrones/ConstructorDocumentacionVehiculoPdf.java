package com.company.patrones;

public class ConstructorDocumentacionVehiculoPdf extends ConstructorDocumentacionVehiculo {

    public ConstructorDocumentacionVehiculoPdf(){
        documentacion = new DocumentacionPdf();
    }

    @Override
    public void construyeSolicitudPedido(String nombreCliente) {
        String documento;
        documento = "<PDF>Solicitud de pedido Cliente:"+nombreCliente+"</PDF>";
        documentacion.agregarDocumento(documento);
    }

    @Override
    public void construyeSolicitudMatricula(String nombreSolicitante) {
        String documento;
        documento = "<PDF>Solicitud de matriculacion Solicitante:"+nombreSolicitante+"</PDF>";
        documentacion.agregarDocumento(documento);
    }
}
