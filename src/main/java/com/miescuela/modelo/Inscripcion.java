package com.miescuela.modelo;

/**
 * Clase de Asociación: Conecta un Alumno con una Materia.
 * Responsable de guardar la calificación.
 * Versión básica.
 */
public class Inscripcion {

   
    private Alumno alumno;
    private Materia materia;
    
    
    private Double calificacion;

    
    public Inscripcion() {
    }

    
    public Inscripcion(Alumno alumno, Materia materia) {
        this.alumno = alumno;
        this.materia = materia;
        this.calificacion = null; 
    }

    

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
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

    @Override
    public String toString() {
        String califStr = (calificacion == null) ? "Sin calificar" : calificacion.toString();
        return "Inscripcion [Alumno: " + alumno.getNombre() + 
               ", Materia: " + materia.getNombreMateria() + 
               ", Calif: " + califStr + "]";
    }
}