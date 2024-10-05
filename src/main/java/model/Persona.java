package model;

/**
 * Clase Persona
 */
public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;

    /**
     * Constructor con parámetros de persona
     *
     * @param nombre nombre de persona
     * @param apellidos apellidos de persona
     * @param edad edad de persona
     */
    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    /**
     * Getter para el nombre de persona
     *
     * @return nombre de persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter para el nombre de persona
     *
     * @param nombre nuevo nombre de persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter para los apellidos de persona
     *
     * @return apellidos de persona
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Setter para los apellidos de persona
     *
     * @param apellidos nuevos apellidos de persona
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Getter para la edad de persona
     *
     * @return edad de persona
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Setter para el edad de persona
     *
     * @param edad nueva edad de persona
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

}
