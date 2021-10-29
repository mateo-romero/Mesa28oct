package com.company;

public class EstadoParaEnvio implements  Estado{

    private  Reparacion v;

    public EstadoParaEnvio(Reparacion v)
    {
        this.v = v;
    }


    @Override
    public void cambiar(String nuevaDireccion) throws EstadoErroneoException {
        v.setDireccionEntrega(nuevaDireccion);
    }

    @Override
    public void valorar(Double presupuestoInicial) throws EstadoErroneoException {
        throw new EstadoErroneoException("No se puede inidicar el presupuesto inicial en el EstadoParaEnvio");
    }

    @Override
    public void agregar(Double valorRepuesto) throws EstadoErroneoException {
        throw new EstadoErroneoException("No se puede agregar en el estado Pagando");
    }

    @Override
    public void pasar() throws EstadoErroneoException {
        v.setEstado(new EstadoFinalizado(v));
    }
}
