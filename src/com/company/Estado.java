package com.company;

public interface Estado {


    public void cambiar(String nuevaDireccion) throws EstadoErroneoException;
    public void valorar(Double presupuestoInicial) throws EstadoErroneoException;
    public void agregar(Double valorRepuesto) throws EstadoErroneoException;
    public void pasar() throws EstadoErroneoException;
}
