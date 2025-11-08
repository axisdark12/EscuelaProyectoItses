package com.miescuela.modelo;

public class Inscripcion {

    //Atributos de Asociación y Valor JP
    private Alumno alumno;
    private materia materia;
    private double calificacion;

    //Constructor por defecto JP
    public Inscripcion() {
    }

    public Inscripcion(Alumno alumno, materia materia, double calificacion) {
        this.alumno = alumno;
        this.materia = materia;
        this.calificacion = calificacion;
    }

    public Alumno getAlumno() {
        return alumno;
    }
 
    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
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

    //Método toString JP
    @Override
    public String toString() {
        return "Inscripcion{" +
                // Se llama al toString() de Alumno y Materia para ver sus detalles JP
                "alumno=" + (alumno != null ? alumno.toString() : "N/A") +
                ", materia=" + (materia != null ? materia.toString() : "N/A") +
                ", calificacion=" + calificacion +
                '}';
    }
}