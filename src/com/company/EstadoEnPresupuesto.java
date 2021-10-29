package com.company;

public class EstadoEnPresupuesto implements Estado{

    private  Reparacion v;

    public EstadoEnPresupuesto(Reparacion v)
    {
        this.v = v;
    }

    @Override
    public void cambiar(String nuevaDireccion) throws EstadoErroneoException {
        throw new EstadoErroneoException("No se puede cambiar la direccion en el estado en Presupuesto" );
    }

    @Override
    public void valorar(Double presupuestoInicial) throws EstadoErroneoException {
        v.setValorPresupuesto(presupuestoInicial);
    }

    @Override
    public void agregar(Double valorRepuesto) throws EstadoErroneoException {
        throw new EstadoErroneoException("No se puede adicionar  en el estado en Presupuesto" );
    }

    @Override
    public void pasar() throws EstadoErroneoException {
        v.setEstado(new EstadoEnReparacion(v));;
    }
}
