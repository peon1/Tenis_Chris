package com.example.jugadores_de_tenis_cris;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
  static private int id;
  static private int edad;
   static private String nombre;
   static private String apellido;
   static private String[] palabrasNo = {"n","N","no","No","NO"};
    public static void main(String[] args) {

        Scanner escaner = new Scanner(System.in);
        List <Persona> jugadoresTenis = new ArrayList<Persona>();

        do {
            System.out.println("Ingrese el ID del jugador");
            id = escaner.nextInt();
            System.out.println("Ingrese la edad del jugador");
            edad = escaner.nextInt();
            System.out.println("Ingrese el nombre del jugador");
            nombre = escaner.next();
            System.out.println("Ingrese el apellido del jugador");
            apellido = escaner.next();

            Persona jugador = new Persona(id,edad,nombre,apellido);
            jugadoresTenis.add(jugador);

            System.out.println("¿Deseas seguir agregando jugadores? S/N");

        } while (!Arrays.asList(palabrasNo).contains(escaner.next()));
        System.out.println("Cantidad de jugadores registrados: " + jugadoresTenis.size());
        for(int i = 0; i < jugadoresTenis.size();i++)
        {
            System.out.println(jugadoresTenis.get(i));
        }

    }
}