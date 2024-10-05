package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Clase Persona
 */
public class Persona {
    private StringProperty nombre;
    private StringProperty apellidos;
    private IntegerProperty edad;

    /**
     * Constructor con parámetros de persona
     *
     * @param nombre nombre de persona
     * @param apellidos apellidos de persona
     * @param edad edad de persona
     */
    public Persona(String nombre, String apellidos, int edad) {
        this.setNombre(nombre);
        this.setApellidos(apellidos);
        this.setEdad(edad);
    }

    /**
     * Valor del nombre
     *
     * @return nombre
     */
    public StringProperty nombreProperty() {
        if (nombre == null) nombre = new SimpleStringProperty(this, "nombre");
        return nombre;
    }

    /**
     * Valor de los apellidos
     *
     * @return apellidos
     */
    public StringProperty apellidosProperty() {
        if (apellidos == null) apellidos = new SimpleStringProperty(this, "apellidos");
        return apellidos;
    }

    /**
     * Valor de la edad
     *
     * @return edad
     */
    public IntegerProperty edadProperty() {
        if (edad == null) edad = new SimpleIntegerProperty(this, "edad");
        return edad;
    }

    /**
     * Getter para el nombre de persona
     *
     * @return nombre de persona
     */
    public String getNombre() {
        return nombreProperty().get();
    }

    /**
     * Setter para el nombre de persona
     *
     * @param nombre nuevo nombre de persona
     */
    public void setNombre(String nombre) {
        nombreProperty().set(nombre);
    }

    /**
     * Getter para los apellidos de persona
     *
     * @return apellidos de persona
     */
    public String getApellidos() {
        return apellidosProperty().get();
    }

    /**
     * Setter para los apellidos de persona
     *
     * @param apellidos nuevos apellidos de persona
     */
    public void setApellidos(String apellidos) {
        apellidosProperty().set(apellidos);
    }

    /**
     * Getter para la edad de persona
     *
     * @return edad de persona
     */
    public int getEdad() {
        return edadProperty().get();
    }

    /**
     * Setter para el edad de persona
     *
     * @param edad nueva edad de persona
     */
    public void setEdad(int edad) {
        edadProperty().set(edad);
    }

}
