// App.java
package org.bryan_chanona.proyectomaquillajee;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import org.bryan_chanona.proyectomaquillajee.models.Administracion;
import org.kordamp.bootstrapfx.BootstrapFX;
import java.io.IOException;


public class App extends Application {
    private static Administracion administracion = new Administracion();

    public static Administracion getAdministracion() {
        return administracion;
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("elegirUsuario-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
        stage.setTitle("Venta de maquillaje");
        stage.setScene(scene);
        stage.initStyle(StageStyle.TRANSPARENT);
        scene.setFill(Color.TRANSPARENT);
        stage.show();
    }

}