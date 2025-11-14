/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miescuela.modelo;

/**
 *
 * @author sebai
 */
public class Materia {

public class Materia {

    private String clave;  
        private String nombre; 

   
    public Materia() {
    }

    
    public Materia(String clave, String nombre) {
        this.clave = clave;
        this.nombre = nombre;
    }

  

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre + " (" + clave + ")";
    }
}
