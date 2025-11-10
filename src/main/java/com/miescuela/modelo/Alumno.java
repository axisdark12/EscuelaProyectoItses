/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miescuela.modelo;

/**
 *
 * @author ferlo
 */
public class Alumno extends Persona{
    private String matricula;
     private String semestre;


    public Alumno(String id, String nombre, String apellido, String matricula, String semestre) {
        super(id, nombre, apellido);
        this.matricula = matricula;
        this.semestre = semestre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
         return "Alumno{" +
           "datosPersona=" + super.toString() + 
           ", matricula='" + matricula + '\'' +
           ", semestre='" + semestre + '\'' +
           '}';

    }
    
    
        
   
    
     
    
}
    

