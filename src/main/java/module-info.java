module org.bryan_chanona.proyectomaquillajee {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens org.bryan_chanona.proyectomaquillajee to javafx.fxml;
    exports org.bryan_chanona.proyectomaquillajee;
    opens org.bryan_chanona.proyectomaquillajee.controllers to javafx.fxml;
    exports org.bryan_chanona.proyectomaquillajee.controllers;

}