package com.alesandro.ejercicio15b;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * Clase que controla los eventos de la ventana
 */
public class PersonasController {
    @FXML // fx:id="txtNombre"
    private TextField txtNombre; // Value injected by FXMLLoader

    @FXML // fx:id="txtApellidos"
    private TextField txtApellidos; // Value injected by FXMLLoader

    @FXML // fx:id="txtEdad"
    private TextField txtEdad; // Value injected by FXMLLoader

    @FXML // fx:id="tabla"
    private TableView<?> tabla; // Value injected by FXMLLoader

    @FXML
    void agregar(ActionEvent event) {
        //
    }

}
