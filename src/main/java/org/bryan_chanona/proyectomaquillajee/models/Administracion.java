package org.bryan_chanona.proyectomaquillajee.models;

import java.util.ArrayList;

public class Administracion {
    SaleManager saleManager;
    SalesDirector salesDirector;
    private double totalVentas = 0.0;

    public double getTotalVentas() {
        return totalVentas;
    }


    public void sumarPrecioProducto(Double precio) {
        totalVentas += precio;
    }

    private ArrayList<Corrector>  listaCorrector = new ArrayList<>();
    private ArrayList<SombraOjos>listaSombras = new ArrayList<>();
    private ArrayList<BaseMaquillaje> listaBases = new ArrayList<>();
    private ArrayList<Empleado> listaEmpleado = new ArrayList<>();
    public boolean addCorrector (Corrector corrector){
        return listaCorrector.add(corrector);
    }
    public boolean addBase (BaseMaquillaje baseMaquillaje){
        return listaBases.add(baseMaquillaje);
    }
   public boolean addSombraOjos (SombraOjos sombraDeOjos){
        return listaSombras.add(sombraDeOjos);
   }

    public boolean addEmpleado (Empleado empleado){
        return listaEmpleado.add(empleado);
    }

    public ArrayList<BaseMaquillaje> getListaBases() {
        return listaBases;
    }

    public ArrayList<SombraOjos> getListaSombras() {
        return listaSombras;
    }

    public ArrayList<Corrector> getListaCorrector() {
        return listaCorrector;
    }

    public ArrayList<Empleado> getListaEmpleado() {
        return listaEmpleado;
    }


    public boolean removeBase (String nombreBase){
        boolean encontradoBase = false;
        for (int a = 0; a < listaBases.size(); a++) {
            if (listaBases.get(a).getNombreProducto().equals(nombreBase)){
                encontradoBase = true;
                listaBases.remove(a);
            }
        }
        return encontradoBase;
    }
    public boolean removeCorrector (String nombreCorrector){
        boolean encontradoCorrector = false;
        for (int a = 0; a < listaCorrector.size(); a++) {
            if (listaCorrector.get(a).getNombreProducto().equals(nombreCorrector)){
                encontradoCorrector = true;
                listaBases.remove(a);
            }
        }
        return encontradoCorrector;
    }
    public boolean removeSombra (String nombreSombra) {
        boolean encontradoSombra = false;
        for (int a = 0; a < listaSombras.size(); a++) {
            if (listaBases.get(a).getNombreProducto().equals(nombreSombra)) {
                encontradoSombra = true;
                listaBases.remove(a);
            }
        }
        return encontradoSombra;
    }
    public String mostrarCantidad(){
        return "La cantidad es " +String.valueOf(getTotalVentas());

    }

}
