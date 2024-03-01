package org.bryan_chanona.proyectomaquillajee.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import org.bryan_chanona.proyectomaquillajee.App;
import org.bryan_chanona.proyectomaquillajee.models.Administracion;

public class CajaController {

    @FXML
    private ListView<String> listCaja;

    @FXML
    void onMouseClickMostrarCajaButton(MouseEvent event) {
        listCaja.getItems().clear();
        Administracion admin = App.getAdministracion();
        listCaja.getItems().add(admin.mostrarCantidad());
    }
}


