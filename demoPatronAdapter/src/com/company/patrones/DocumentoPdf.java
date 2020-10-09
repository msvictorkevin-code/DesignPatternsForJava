package com.company.patrones;

public class DocumentoPdf implements Documento{
    protected ComponentePdf componentePdf = new ComponentePdf();

    @Override
    public void setContenido(String contenido) {
        componentePdf.pdfFijaContenido(contenido);
    }

    @Override
    public void dibuja() {
        componentePdf.pdfPreparaVisualizacion();
        componentePdf.pdfRefresca();
        componentePdf.pdfFinalizaVisualizacion();
    }

    @Override
    public void imprime() {
        componentePdf.pdfEnviaImpresora();
    }
}
