package com.company;

public class EstadoFinalizado implements Estado{

    private  Reparacion v;

    public EstadoFinalizado(Reparacion v)
    {
        this.v = v;
    }


    @Override
    public void cambiar(String nuevaDireccion) throws EstadoErroneoException {
        throw new EstadoErroneoException("No se puede cambiar la direccion ya que el pedido finalizo" );
    }

    @Override
    public void valorar(Double presupuestoInicial) throws EstadoErroneoException {
        throw new EstadoErroneoException("No se puede inidicar el presupuesto por que ya finalizo el pedido ");
    }

    @Override
    public void agregar(Double valorRepuesto) throws EstadoErroneoException {
        throw new EstadoErroneoException("No se puede agregar en con el pedido finalizado");
    }

    @Override
    public void pasar() throws EstadoErroneoException {
        throw new EstadoErroneoException("No se puede cambiar de estado por que ya finalizo el pedido ");
    }
}
