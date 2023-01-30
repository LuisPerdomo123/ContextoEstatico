/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import domain.Persona;

/**
 *
 * @author lepo9
 */
public class PersonaPrueba {
    
    private int contador;
    
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan");
        //System.out.println("persona1 = " + persona1);
        
        Persona persona2 = new Persona("Karla");
        //System.out.println("persona2 = " + persona2);
        
        imprimir(persona1);//No se incluye this, porque el constexto estatico no puede acceder al contexto dinamico
        imprimir(persona2);
    }
    
    public static void imprimir(Persona persona){//Este metodo debe ser de tipo estatico, dadoq ue se llama o se asocia con otro metodo estatico
    
        System.out.println("persona = " + persona);
    }
    
    public int getContador(){//Los metodo dinamico si pueden acceder al contexto estatico
        imprimir(new Persona("Carlos"));
        return this.contador;
    }
}
