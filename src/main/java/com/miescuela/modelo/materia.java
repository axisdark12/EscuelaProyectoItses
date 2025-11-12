package com.miescuela.modelo;

public class Materia{
    private String nombreMateria;
    private String codigo;
    private int creditos;
    
    public Materia(){
        
    }
    public Materia(String nombreMateria, String codigo, int creditos){
        this.nombreMateria = nombreMateria;
        this.codigo = codigo;
        this.creditos = creditos;
        
    }
    public String getNombreMateria(){
        return nombreMateria;
    }
    public void setNombreMateria(String nombreMateria){
        this.nombreMateria = nombreMateria;
    }
    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public int getCreditos(){
        return creditos;
    }
    public void setCreditos(int creditos){
        this.creditos = creditos;
    }
    
    @Override
    public String toString(){
        return "Materia{"+
                "nombreMateria="+nombreMateria+
                ", codigo=" + codigo +
                ", creditos=" + creditos +
                '}';
    }
}