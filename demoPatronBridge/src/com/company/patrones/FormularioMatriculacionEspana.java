package com.company.patrones;

public class FormularioMatriculacionEspana  extends FormularioMatriculacion{

    public FormularioMatriculacionEspana(FormularioImpl implementacion) {
        super(implementacion);
    }

    @Override
    protected boolean controlZona(String contenido) {
        return contenido.length() == 7;
    }
}
