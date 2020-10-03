package com.company.patrones;

public class PedidoContado  extends Pedido{

    public PedidoContado(double importe) {
        super(importe);
    }

    @Override
    public void paga() {
        System.out.println("PedidoContado{" +"importe=" + importe +                '}');    }

    @Override
    public boolean valida() {
        return true;
    }


}
