package com.company;

public class Main {

    public static void main(String[] args) throws EstadoErroneoException {
            Reparacion reparacionMesa = new Reparacion("batidora","Cra 1029 - a");
                    reparacionMesa.valorPresupuesto(500.0);
                    System.out.println(reparacionMesa);
                    reparacionMesa.siguientePaso();
                    System.out.println(reparacionMesa);
                    reparacionMesa.agregarRepuesto(600.0);
                    reparacionMesa.siguientePaso();
                    System.out.println(reparacionMesa);
                    reparacionMesa.cambiarDireccion("avenida 133");
                    reparacionMesa.siguientePaso();
                    System.out.println(reparacionMesa);

    }
}
