package com.company;

public class Reparacion {

    private String nombreArticulo;
    private Double valorPresupuesto;
    private String direccionEntrega;
    private Estado estado;

    public Reparacion(String nombreArticulo, String direccionEntrega) {
        this.nombreArticulo = nombreArticulo;
        this.valorPresupuesto = 0.0;
        this.direccionEntrega = direccionEntrega;
        this.setEstado(new EstadoEnPresupuesto(this));
    }
    public void cambiarDireccion (String nuevaDireccion) throws EstadoErroneoException{
        try{
        this.estado.cambiar(nuevaDireccion);
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void valorPresupuesto(Double NuevoPresupuesto)throws EstadoErroneoException{
        try{
        this.estado.valorar(NuevoPresupuesto);
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void  agregarRepuesto(Double valorRepuesto) throws EstadoErroneoException{
        try{
        this.estado.agregar(valorRepuesto);
        }catch (Exception e){
        System.out.println(e);
    }
    }
    public void siguientePaso() throws EstadoErroneoException{
        try{
        this.estado.pasar();
        }catch (Exception e){
        System.out.println(e);
        }

    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setValorPresupuesto(Double valorPresupuesto) {
        this.valorPresupuesto = valorPresupuesto;
    }

    public Double getValorPresupuesto() {
        return valorPresupuesto;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }



    @Override
    public String toString() {
        return "Reparacion{" +
                "nombreArticulo='" + nombreArticulo + '\'' +
                ", valorPresupuesto=" + valorPresupuesto +
                ", direccionEntrega='" + direccionEntrega + '\'' +
                ", estado=" + estado +
                '}';
    }
}
