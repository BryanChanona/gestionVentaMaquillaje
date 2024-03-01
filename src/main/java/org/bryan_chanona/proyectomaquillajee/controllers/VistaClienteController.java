package org.bryan_chanona.proyectomaquillajee.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import org.bryan_chanona.proyectomaquillajee.App;
import org.bryan_chanona.proyectomaquillajee.models.Administracion;
import org.bryan_chanona.proyectomaquillajee.models.BaseMaquillaje;
import org.bryan_chanona.proyectomaquillajee.models.Corrector;
import org.bryan_chanona.proyectomaquillajee.models.SombraOjos;

public class VistaClienteController {

    @FXML
    private ListView<String> listProductos;

    @FXML
    void onMouseClickVerBaseButton(MouseEvent event) {
        listProductos.getItems().clear();
        Administracion admin = App.getAdministracion();
        for (BaseMaquillaje base : admin.getListaBases()){
            listProductos.getItems().add(base.toString());
        }

    }

    @FXML
    void onMouseClickVerCorrectorButton(MouseEvent event) {
        listProductos.getItems().clear();
        Administracion admin = App.getAdministracion();
        for (Corrector corrector: admin.getListaCorrector()){
            listProductos.getItems().add(corrector.toString());
        }


    }

    @FXML
    void onMouseClickVerSombrasButtom(MouseEvent event) {
        listProductos.getItems().clear();
        Administracion admin = App.getAdministracion();
        for (SombraOjos sombraDeOjos: admin.getListaSombras()){
            listProductos.getItems().add(sombraDeOjos.toString());
        }

    }

}
