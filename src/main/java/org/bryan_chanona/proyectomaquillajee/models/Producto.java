package org.bryan_chanona.proyectomaquillajee.models;


public class Producto {

    protected String nombreProducto;
    protected Double precioProducto;

    public Producto(String nombreProducto, Double precioProducto) {
        this.nombreProducto = nombreProducto;

        this.precioProducto = precioProducto;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombreProducto='" + nombreProducto + '\'' +
                ", precioProducto=" + precioProducto +
                '}';
    }


    public Double getPrecioProducto() {
        return precioProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }
}
