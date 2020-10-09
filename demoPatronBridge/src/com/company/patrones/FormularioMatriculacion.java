package com.company.patrones;

public abstract class FormularioMatriculacion {
    protected String contenido;
    protected FormularioImpl implementacion;

    public FormularioMatriculacion(FormularioImpl implementacion){
        this.implementacion = implementacion;
    }

    public void visualiza(){
        implementacion.dibujaTexto("Numero de matricula existente: ");
    }

    public void generaDocumento(){
        implementacion.dibujaTexto("Solicitud de matriculacion");
        implementacion.dibujaTexto("Numero de matricula: "+contenido);
    }

    public boolean administraZona(){
        contenido = implementacion.administraZonaInidicada();
        return this.controlZona(contenido);
    }

    protected abstract boolean controlZona(String contenido);

}
