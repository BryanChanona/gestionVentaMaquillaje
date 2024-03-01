package org.bryan_chanona.proyectomaquillajee.models;


public class SombraOjos extends  Producto{
    private String color;

    public SombraOjos(String nombreProducto, Double precioProducto, String color) {
        super(nombreProducto, precioProducto);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "SombraOjos{" +
                "color='" + color + '\'' +
                '}';
    }

    public String getColor() {
        return color;
    }
}
