package com.miescuela.modelo;

public class Inscripcion extends Alumno{

    //Atributos de Asociación y Valor JP
    private materia materia;
    private double calificacion;

    public Inscripcion(materia materia, double calificacion, String id, String nombre, String apellido, String matricula, String semestre) {
        super(id, nombre, apellido, matricula, semestre);
        this.materia = materia;
        this.calificacion = calificacion;
    }
    
    
    public materia getMateria() {
        return materia;
    }

    public void setMateria(materia materia) {
        this.materia = materia;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}