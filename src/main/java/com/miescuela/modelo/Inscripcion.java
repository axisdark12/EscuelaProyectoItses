/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miescuela.modelo;

/**
 *
 * @author sebai
 */
public class Inscripcion extends Alumno{
     private Materia materia;
    private Double calificacion;

    
    public Inscripcion() {
    }

    public Inscripcion(Materia materia, Double calificacion) {
        this.materia = materia;
        this.calificacion = calificacion;
    }

    public Inscripcion(Materia materia, Double calificacion, String matricula, String nombre) {
        super(matricula, nombre);
        this.materia = materia;
        this.calificacion = calificacion;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }
}
