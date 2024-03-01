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

public class ElegirUsuarioController {

    Stage callGerente = new Stage();
    Stage callManager = new Stage();
    Stage callcliente = new Stage();


    @FXML
    void onMouseClickGerenteButtom(MouseEvent event) {


        try {
            FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("login-view.fxml"));
            Scene scene = null;
            scene = new Scene(fxmlLoader.load());
            scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
            callGerente.setTitle("Login/Gerente");
            callGerente.setScene(scene);
            callGerente.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
@FXML
    public void onMouseClickButtomManager(MouseEvent mouseEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("login-view.fxml"));
            Scene scene = null;
            scene = new Scene(fxmlLoader.load());
            scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
            callManager.setTitle("Login/Manager");
            callManager.setScene(scene);
            callManager.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    @FXML
    void onMouseClickExitButtom(MouseEvent event) {
        System.exit(1);

    }
    @FXML
    void onMouseClickClienteButton(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("vistaCliente-view.fxml"));
            Scene scene = null;
            scene = new Scene(fxmlLoader.load());
            scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
            callcliente.setTitle("Login/Manager");
            callcliente.setScene(scene);
            callcliente.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }


    }

