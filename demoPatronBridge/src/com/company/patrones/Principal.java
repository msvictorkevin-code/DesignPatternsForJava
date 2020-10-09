package com.company.patrones;

public class Principal {

    public static void main(String[] args) {
	// write your code here
        FormularioMatriculacionPortugal formulario1 = new FormularioMatriculacionPortugal(new FormHtmlImpl());
        formulario1.visualiza();
        if (formulario1.administraZona()){
            formulario1.generaDocumento();
        }
        FormularioMatriculacionEspana formulario2 = new FormularioMatriculacionEspana(new FormAppletImpl());
        formulario2.visualiza();
        if(formulario2.administraZona()){
            formulario2.generaDocumento();
        }
    }
}
