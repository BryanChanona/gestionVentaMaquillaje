package org.bryan_chanona.proyectomaquillajee.models;


public class Corrector extends Producto{
   private String tipoDePunta;

    public Corrector(String nombreProducto, Double precioProducto, String tipoDePunta) {
        super(nombreProducto, precioProducto);
        this.tipoDePunta = tipoDePunta;
    }

    @Override
    public String toString() {
        return  super.toString()+  "Corrector{" +
                "tipoDePunta='" + tipoDePunta + '\'' +
                '}';
    }

    public String getTipoDePunta() {
        return tipoDePunta;
    }
}
