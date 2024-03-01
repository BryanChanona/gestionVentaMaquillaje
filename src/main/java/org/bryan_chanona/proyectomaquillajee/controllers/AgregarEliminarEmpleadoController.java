package org.bryan_chanona.proyectomaquillajee.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import org.bryan_chanona.proyectomaquillajee.App;
import org.bryan_chanona.proyectomaquillajee.models.Empleado;

public class AgregarEliminarEmpleadoController {

    @FXML
    private Label mostrarNoticiaButtom;
    @FXML
    private TextField emailEmpleado;
    @FXML
    private TextField nombreEmpleado;
    @FXML
    private TextField passwordEmpleado;



    @FXML
    void onMouseClickAgregarEmpleadoButtom(MouseEvent event) {
        String nombreEmpleadoo = nombreEmpleado.getText();
        String emailEmpleadoo = emailEmpleado.getText();
        String passwordEmpleadoo = passwordEmpleado.getText();
        Empleado nuevoEmpleado = new Empleado(nombreEmpleadoo, emailEmpleadoo, passwordEmpleadoo);
        App.getAdministracion().addEmpleado(nuevoEmpleado);
        mostrarNoticiaButtom.setText("Empleado '" + nombreEmpleadoo + "' añadido exitosamente");
    }

}
