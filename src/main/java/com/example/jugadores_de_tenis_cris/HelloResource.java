package com.example.jugadores_de_tenis_cris;


import java.util.Scanner;
import java.lang.String;


public class HelloResource {

    public static void main(String[] args) {
        int cantidadJugadores;
        String[] nombre;
        String[] apellido;
        int[] edad;
        int[] codigo;

        Scanner escaner = new Scanner(System.in);
        System.out.println("Defina la cantidad de jugadores de tenis a ingresar");
        cantidadJugadores = escaner.nextInt();
        nombre = new String[cantidadJugadores];
        apellido = new String[cantidadJugadores];
        edad = new int[cantidadJugadores];
        codigo = new int[cantidadJugadores];

        for (int i = 0; i < cantidadJugadores; i++) {

            System.out.println("Digite el nombre del jugador " + (i + 1) + ": ");
            nombre[i] = escaner.next();
            System.out.println("Digite el apellido del jugador " + (i + 1) + ": ");
            apellido[i] = escaner.next();
            System.out.println("Digite la edad del jugador " + (i + 1) + ": ");
            edad[i] = escaner.nextInt();
            System.out.println("Digite el codigo del jugador " + (i + 1) + ": ");
            codigo[i] = escaner.nextInt();
        }

        for (int i = 0; i < cantidadJugadores; i++) {
            System.out.println("Datos del jugador " + (i + 1) + ": ");
            System.out.println("Nombre: " + nombre[i]);
            System.out.println("Apellido: " + apellido[i]);
            System.out.println("Edad: " + edad[i]);
            System.out.println("Codigo: " + codigo[i]);
        }


    }
}