
package com.james.poo;

import java.util.Objects;

/**
 *
 * @author james
 */
public class Persona {
    
    private String nombre;
    private String apellidos;
    private int edad;
    
//    public Persona(){
//        this.nombre = "";
//        this.apellidos = "";
//        this.edad = 0;
//        
//    }
//    
    public Persona() {
        this("","",0);
    }

    public Persona(String nombre) {
        this( nombre,"",0);
    }
    
    
    public Persona(String nombre, String apellidos, int edad) {
        
        if(edad < 0){
            throw new IllegalArgumentException("la edad debe ser postiva");
        }
           
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String nombreCompleto(){
        return this.nombre + " " + this.apellidos;
    }
    
    // sobrecarga de metodos
    public String nombreCompleto(String titulo ){
        return titulo + " " + this.nombre + " " + this.apellidos;
    }
    
    public boolean mayorEdad(){
        return this.edad >= 10;
    }

    @Override
    public String toString() {
        //return  nombre + " " + apellidos + " de " + edad + " años";
        return  this.nombreCompleto() + " de " + edad + " años";
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.nombre);
        hash = 83 * hash + Objects.hashCode(this.apellidos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.apellidos, other.apellidos);
    }
    
    
    
}
 