package com.company.patrones;

import java.util.ArrayList;
import java.util.List;

public class DocumentacionCliente extends Documentacion{
    public DocumentacionCliente (String informacion){
        documentos = new ArrayList<Documento>();
        DocumentacionEnBlanco documentacionEnBlanco=  DocumentacionEnBlanco.Instance();
        List<Documento> documentosEnBlanco = documentacionEnBlanco.getDocumentos() ;
        for (Documento documento:documentosEnBlanco){
            Documento copyDocumento = documento.duplica();
            copyDocumento.rellena(informacion);;
            documentos.add(copyDocumento);
        }
    }

    public void visualiza(){
        for (Documento documento:documentos){
            documento.visualiza();
        }
    }

    public void imprime(){
        for (Documento documento:documentos){
            documento.imprime();
        }
    }
}
