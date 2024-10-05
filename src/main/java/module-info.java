module com.alesandro.ejercicio15b {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.alesandro.ejercicio15b to javafx.fxml;
    exports com.alesandro.ejercicio15b;
}