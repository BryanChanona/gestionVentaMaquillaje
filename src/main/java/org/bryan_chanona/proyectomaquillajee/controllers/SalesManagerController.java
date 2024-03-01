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

public class SalesManagerController {

    @FXML
    private Button gestionProductoButtom;

    @FXML
    private Button reporteButtom;

    @FXML
    private Button venderProducto;
    Stage gestionProducto = new Stage();
    Stage venderProductos= new Stage();
    Stage darReporte = new Stage();


    @FXML
    void onMouseClickGestionProductoButtom(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("agregar-eliminarProductos-view.fxml"));
            Scene scene = null;
            scene = new Scene(fxmlLoader.load());
            scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
            gestionProducto.setTitle("Manager/ gestionar productos");
            gestionProducto.setScene(scene);
            gestionProducto.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    @FXML
    void onMouseClickVenderProductoButtom(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("venderProducto-view.fxml"));
            Scene scene = null;
            scene = new Scene(fxmlLoader.load());
            scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
            venderProductos.setTitle("Manager/ vender producto");
            venderProductos.setScene(scene);
            venderProductos.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
