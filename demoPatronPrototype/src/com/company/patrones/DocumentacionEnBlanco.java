package com.company.patrones;

import java.util.ArrayList;

public class DocumentacionEnBlanco extends Documentacion {
    private static DocumentacionEnBlanco _instance = null;
    public DocumentacionEnBlanco(){
        documentos = new ArrayList<Documento>();
    }
    public static DocumentacionEnBlanco Instance(){
        if (_instance == null)
        _instance = new DocumentacionEnBlanco();
        return _instance;
    }

    public void incluye(Documento documento){
        documentos.add(documento);
    }

    public void excluye(Documento documento){
        documentos.remove(documento);
    }
}
