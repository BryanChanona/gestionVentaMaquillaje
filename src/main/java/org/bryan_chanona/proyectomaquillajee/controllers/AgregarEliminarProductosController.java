package org.bryan_chanona.proyectomaquillajee.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import org.bryan_chanona.proyectomaquillajee.App;
import org.bryan_chanona.proyectomaquillajee.models.Administracion;
import org.bryan_chanona.proyectomaquillajee.models.BaseMaquillaje;
import org.bryan_chanona.proyectomaquillajee.models.Corrector;
import org.bryan_chanona.proyectomaquillajee.models.SombraOjos;

import java.util.ArrayList;

public class AgregarEliminarProductosController {


    @FXML
    private Label mostrarProductoAgregado;
    @FXML
    private Button addProducto;

    @FXML
    private TextField nombreProducto;

    @FXML
    private TextField precioProducto;

    @FXML
    private TextField categoriaProducto;
    @FXML
    private TextField recibirTipoProductoButtn;

    @FXML
    void onMouseClickAddButtom(MouseEvent event) {
        String baseMaquillaaje = "Base de maquillaje";
        String correctores = "Corrector";
        String sombraOjos = "Sombra para ojos";


        String categoriaProduct = categoriaProducto.getText();


        if (categoriaProduct.equals(baseMaquillaaje)) {
            String nombreBase = nombreProducto.getText();
            Double precioBase = Double.parseDouble(precioProducto.getText());
            String tipoBase = recibirTipoProductoButtn.getText();
            BaseMaquillaje productoBaseMaquillaje = new BaseMaquillaje(nombreBase, precioBase, tipoBase);
            App.getAdministracion().addBase(productoBaseMaquillaje);

            mostrarProductoAgregado.setText("Base agregada exitosamente ");


        } else if (categoriaProduct.equals(correctores)) {
            String namePrdoct = nombreProducto.getText();
            Double precioPrdoc = Double.parseDouble(precioProducto.getText());
            String tipoPunta = recibirTipoProductoButtn.getText();
            Corrector productoCorrector = new Corrector(namePrdoct, precioPrdoc, tipoPunta);
            App.getAdministracion().addCorrector(productoCorrector);
            mostrarProductoAgregado.setText("Corrector agregado exitosamente");

        } else if (categoriaProduct.equals(sombraOjos)) {
            String noombreProducto = nombreProducto.getText();
            Double productoPrecio = Double.parseDouble(precioProducto.getText());
            String colorSombra = recibirTipoProductoButtn.getText();
            SombraOjos productoSombraOjos = new SombraOjos(noombreProducto, productoPrecio, colorSombra);
            App.getAdministracion().addSombraOjos(productoSombraOjos);
            mostrarProductoAgregado.setText("Sombra de ojos agregado exitosamente");
        }
    }

    @FXML
    void onMouseClickEliminarproductoButton(MouseEvent event) {
        String baseMaquillaaje = "Base de maquillaje";
        String correctores = "Corrector";
        String sombraOjos = "Sombra para ojos";


        String categoria = categoriaProducto.getText();
        if (categoria.equals(baseMaquillaaje)) {
            String eliminarBase = nombreProducto.getText();
            Administracion admin = App.getAdministracion();
            if (admin.removeBase(eliminarBase)) ;
            mostrarProductoAgregado.setText("Producto base eliminado exitosamente.");
        } else if(categoria.equals(correctores)){
            String eliminarCorrector = nombreProducto.getText();
            Administracion admin = App.getAdministracion();
            if (admin.removeCorrector(eliminarCorrector)) ;
            mostrarProductoAgregado.setText("Producto corrector eliminado exitosamente.");

        } else if (categoria.equals(sombraOjos)) {
            String eliminarSombra = nombreProducto.getText();
            Administracion admin = App.getAdministracion();
            if (admin.removeSombra(eliminarSombra)) ;
            mostrarProductoAgregado.setText("Producto sombra de ojos eliminado exitosamente.");

        }
    }
}