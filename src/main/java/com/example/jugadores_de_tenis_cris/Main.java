package com.example.jugadores_de_tenis_cris;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean bandera = true;
        Scanner escaner = new Scanner(System.in);
        List <Persona> jugadores_Tenis = new ArrayList<Persona>();
        while (bandera)
        {


            int id;
            int edad;
            String nombre = "";
            String apellido = "";
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

            System.out.println("¿Deseas seguir agregando jugadores? 1 para si, otro numero para no");

            if (escaner.nextInt() != 1)
            {
                bandera = false;
            }



        }
        System.out.println("Cantidad de jugadores registrados: " + jugadores_Tenis.size());
        for(int i = 0; i < jugadores_Tenis.size();i++)
        {
            System.out.println(jugadores_Tenis.get(i));
        }

    }
}