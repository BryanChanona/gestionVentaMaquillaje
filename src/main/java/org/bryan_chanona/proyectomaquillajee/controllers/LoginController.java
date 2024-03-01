package org.bryan_chanona.proyectomaquillajee.controllers;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import org.bryan_chanona.proyectomaquillajee.App;
import org.bryan_chanona.proyectomaquillajee.models.SalesDirector;
import org.bryan_chanona.proyectomaquillajee.models.SaleManager;
import org.kordamp.bootstrapfx.BootstrapFX;

import java.io.IOException;

public class LoginController {
    SalesDirector admin = new SalesDirector();
    SaleManager empleado = new SaleManager();


    @FXML
    private PasswordField passwordText;

    @FXML
    private TextField userText;
    Stage stageAdmin= new Stage();

    @FXML
    void onMouseClickSignInButtom(MouseEvent event) {
        String nameUser = userText.getText();
        String passwordUser =  passwordText.getText();
        if (nameUser.equals(admin.getEmail()) && passwordUser.equals(admin.getPassword())){
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("saleDirector-view.fxml"));
                Scene scene = null;
                scene = new Scene(fxmlLoader.load());
                scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
                stageAdmin.setTitle("Gerente");
                stageAdmin.setScene(scene);
                stageAdmin.show();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (nameUser.equals(empleado.getEmail()) && passwordUser.equals(empleado.getPassword())){
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("saleManager-view.fxml"));
                Scene scene = null;
                scene = new Scene(fxmlLoader.load());
                scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
                stageAdmin.setTitle("Manager");
                stageAdmin.setScene(scene);
                stageAdmin.show();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
