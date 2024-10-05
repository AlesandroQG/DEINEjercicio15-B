package com.alesandro.ejercicio15b;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import javafx.scene.control.cell.PropertyValueFactory;
import model.Persona;

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
    private TableView<Persona> tabla; // Value injected by FXMLLoader

    @FXML // fx:id="colNombre"
    private TableColumn<Persona, String> colNombre; // Value injected by FXMLLoader

    @FXML // fx:id="colApellidos"
    private TableColumn<Persona, String> colApellidos; // Value injected by FXMLLoader

    @FXML // fx:id="colEdad"
    private TableColumn<Persona, Integer> colEdad; // Value injected by FXMLLoader

    /**
     * Función que se ejecuta cuando se inicia la ventana
     */
    public void initialize() {
        colNombre.setCellValueFactory(new PropertyValueFactory("nombre"));
        colApellidos.setCellValueFactory(new PropertyValueFactory("apellidos"));
        colEdad.setCellValueFactory(new PropertyValueFactory("edad"));

        tabla.getColumns().setAll(colNombre, colApellidos, colEdad);
    }

    /**
     * Función que procesa los datos cuándo se pulsa el botón "Agregar Persona"
     *
     * @param event
     */
    @FXML
    void agregar(ActionEvent event) {
        String error = "";
        if (txtNombre.getText().isEmpty()) {
            error += "El campo nombre es obligatorio";
        }
        if (txtApellidos.getText().isEmpty()) {
            if (!error.isEmpty()) {
                error += "\n";
            }
            error += "El campo apellidos es obligatorio";
        }
        if (txtEdad.getText().isEmpty()) {
            if (!error.isEmpty()) {
                error += "\n";
            }
            error += "El campo edad es obligatorio";
        } else {
            try {
                int edad = Integer.parseInt(txtEdad.getText());
            } catch (NumberFormatException e) {
                if (!error.isEmpty()) {
                    error += "\n";
                }
                error += "El campo edad tiene que ser numérico";
            }
        }
        if (!error.isEmpty()) {
            alerta(error);
        } else {
            Persona p = new Persona(txtNombre.getText(), txtApellidos.getText(), Integer.parseInt(txtEdad.getText()));
            tabla.getItems().addAll(p);
            //confirmacion();
        }
    }

    /**
     * Función que muestra un mensaje de alerta al usuario
     *
     * @param texto contenido de la alerta
     */
    public void alerta(String texto) {
        Alert alerta = new Alert(Alert.AlertType.ERROR);
        alerta.setHeaderText(null);
        alerta.setTitle("ERROR");
        alerta.setContentText(texto);
        alerta.showAndWait();
    }

    /**
     * Función que muestra un mensaje de confirmación al usuario
     */
    public void confirmacion() {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setHeaderText(null);
        alerta.setTitle("Info");
        alerta.setContentText("Persona añadida correctamente");
        alerta.showAndWait();
    }

}
