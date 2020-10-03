package com.company.patrones;

public class PedidoCredito extends Pedido {

    public PedidoCredito(double importe) {
        super(importe);
    }

    @Override
    public void paga() {
        System.out.println("PedidoCredito{" + "importe=" + importe + '}');
    }

    @Override
    public boolean valida() {
        return (importe >= 1000) && (importe <= 5000);
    }


}
