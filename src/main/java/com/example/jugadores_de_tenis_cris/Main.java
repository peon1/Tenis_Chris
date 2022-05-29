package com.example.jugadores_de_tenis_cris;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  static private int id;
  static private int edad;
   static private String nombre;
   static private String apellido;
    public static void main(String[] args) {

        Scanner escaner = new Scanner(System.in);
        List <Persona> jugadores_Tenis = new ArrayList<Persona>();

        do
        {



            System.out.println("Ingrese el ID del jugador");
            id = escaner.nextInt();
            System.out.println("Ingrese la edad del jugador");
            edad = escaner.nextInt();
            System.out.println("Ingrese el nombre del jugador");
            nombre = escaner.next();
            System.out.println("Ingrese el apellido del jugador");
            apellido = escaner.next();

            Persona jugador = new Persona(id,edad,nombre,apellido);
            jugadores_Tenis.add(jugador);

            System.out.println("¿Deseas seguir agregando jugadores? S/N");





        } while (escaner.next() == "S");
        System.out.println("Cantidad de jugadores registrados: " + jugadores_Tenis.size());
        for(int i = 0; i < jugadores_Tenis.size();i++)
        {
            System.out.println(jugadores_Tenis.get(i));
        }

    }
}