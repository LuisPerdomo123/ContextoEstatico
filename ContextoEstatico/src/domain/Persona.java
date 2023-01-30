/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author lepo9
 */
public class Persona {

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int aContadorPersonas) {
        contadorPersonas = aContadorPersonas;
    }
    private int idPersona;
    private String nombre;
    private static int contadorPersonas;//Al incluir el valor static, es una variable que se asocia con la clase y no con los objetos

    public Persona(String nombre) {

        this.nombre = nombre;

        //Incrementar el contador por cada objeto nuevo
        Persona.contadorPersonas++;//Es opcional el nombre de la clase Persona. Pero es una practica aecuada incluirla

        //Asignar el nuevo valor a la variable idPersona
        this.idPersona = Persona.contadorPersonas;

    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override //Anotacion, informacion extra. Se esta indicadon sobreescriviendo el metodo toString
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }

    
}
