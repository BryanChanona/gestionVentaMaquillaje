package org.bryan_chanona.proyectomaquillajee.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import org.bryan_chanona.proyectomaquillajee.App;
import org.kordamp.bootstrapfx.BootstrapFX;

import java.io.IOException;

public class SalesDirectorController {

     Stage gestionCategoria = new Stage();
     Stage verCaja = new Stage();
     Stage gestionEmpleado = new Stage();


    @FXML
    void onMouseClickCajaButtom(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("caja-view.fxml"));
            Scene scene = null;
            scene = new Scene(fxmlLoader.load());
            scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
            verCaja.setTitle("Gerente/ caja");
            verCaja.setScene(scene);
            verCaja.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


    @FXML
    void onMouseClickGestionEmpleadoButtom(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("agregar-eliminarEmpleado-view.fxml"));
            Scene scene = null;
            scene = new Scene(fxmlLoader.load());
            scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
            gestionEmpleado.setTitle("Gerente/ gestion de empleados");
            gestionEmpleado.setScene(scene);
            gestionEmpleado.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
