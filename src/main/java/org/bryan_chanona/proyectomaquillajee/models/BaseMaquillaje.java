package org.bryan_chanona.proyectomaquillajee.models;



public class BaseMaquillaje extends Producto{
    private String tipoBase;

    public BaseMaquillaje(String nombreProducto, Double precioProducto, String tipoBase) {
        super(nombreProducto, precioProducto);
        this.tipoBase = tipoBase;
    }

    @Override
    public String toString() {
        return  super.toString() + "BaseMaquillaje{" +
                "tipoBase='" + tipoBase + '\'' +
                '}';
    }


    public String getTipoBase() {
        return tipoBase;
    }
}
