package com.miescuela.modelo;

/**
 * Clase de Asociación: Conecta un Alumno con una Materia.
 * Responsable de guardar la calificación.
 * Versión básica.
 */
public class Inscripcion extends Alumno{

   
    private materia materia;
    private Double calificacion;

    
    public Inscripcion() {
    }

    public Inscripcion(materia materia, Double calificacion) {
        this.materia = materia;
        this.calificacion = calificacion;
    }

    public Inscripcion(materia materia, Double calificacion, String matricula, String nombre) {
        super(matricula, nombre);
        this.materia = materia;
        this.calificacion = calificacion;
    }

    public materia getMateria() {
        return materia;
    }

    public void setMateria(materia materia) {
        this.materia = materia;
    }

    public Double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }

}