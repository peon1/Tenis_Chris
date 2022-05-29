package com.example.jugadores_de_tenis_cris;

public class Persona {

    int iD;
    int edad;
    String nombre;
    String apellido;

    public  Persona(int iD,int edad,String nombre,String apellido)
    {
        this.iD = iD;
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
    }



    public String toString() {
        return "ID: " + iD + " edad: " + edad + " nombre: " + nombre + " apellido: " + apellido;
    }
}
