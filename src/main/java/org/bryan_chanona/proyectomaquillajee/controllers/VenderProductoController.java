package org.bryan_chanona.proyectomaquillajee.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import org.bryan_chanona.proyectomaquillajee.App;
import org.bryan_chanona.proyectomaquillajee.models.Administracion;

public class VenderProductoController {
    @FXML
    private Label mostrarTextoVenderButton;

    @FXML
    private TextField categoriaProductVentasButton;

    @FXML
    private TextField nameProductVenderButton;

    @FXML
    private TextField productoVentaButton;

    @FXML
    void onMouseClickVenderButtn(MouseEvent event) {
        String baseMaquillaaje = "Base de maquillaje";
        String correctores = "Corrector";
        String sombraOjos = "Sombra para ojos";

        String categoria = categoriaProductVentasButton.getText();

        Administracion producto = App.getAdministracion();


        if (categoria.equals(baseMaquillaaje)) {
            Double precioProductoBase = Double.parseDouble(productoVentaButton.getText());
            producto.sumarPrecioProducto(precioProductoBase);
            String eliminarBase = nameProductVenderButton.getText();
            App.getAdministracion().removeBase(eliminarBase);
            mostrarTextoVenderButton.setText("Producto base vendido exitosamente");
        } else if (categoria.equals(correctores)) {
            Double precioProductoCorrector = Double.parseDouble(productoVentaButton.getText());
            producto.sumarPrecioProducto(precioProductoCorrector);
            String eliminarCorrector = nameProductVenderButton.getText();
            App.getAdministracion().removeCorrector(eliminarCorrector);
            mostrarTextoVenderButton.setText("Producto corrector vendido exitosamente. ");

        } else if (categoria.equals(sombraOjos)) {
            Double precioProductoSombras= Double.parseDouble(productoVentaButton.getText());
            producto.sumarPrecioProducto(precioProductoSombras);
            String eliminarSombra = nameProductVenderButton.getText();
            App.getAdministracion().removeSombra(eliminarSombra);
            mostrarTextoVenderButton.setText("Producto sombra de ojos vendido exitosamente");

        }
    }
}
