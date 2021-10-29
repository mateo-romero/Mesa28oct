package com.company;

public class EstadoEnReparacion implements Estado{

    private  Reparacion v;

    public EstadoEnReparacion(Reparacion v)
    {
        this.v = v;
    }

    @Override
    public void cambiar(String nuevaDireccion) throws EstadoErroneoException {
        throw new EstadoErroneoException("No se puede cambiar la direccion en el Estado En Reparacio" );
    }

    @Override
    public void valorar(Double presupuestoInicial) throws EstadoErroneoException {
        throw new EstadoErroneoException("No se puede inidicar el presupuesto inicial en el eEstado En Reparacio");
    }

    @Override
    public void agregar(Double valorRepuesto) throws EstadoErroneoException {
            double presupuesto = v.getValorPresupuesto() + valorRepuesto;
            v.setValorPresupuesto(presupuesto);
    }

    @Override
    public void pasar() throws EstadoErroneoException {
        v.setEstado(new EstadoParaEnvio(v));;
    }
}
