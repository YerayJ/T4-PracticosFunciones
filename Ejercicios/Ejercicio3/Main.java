package Ejercicio3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Variables de tipo int para pedirla al usuario
        int cantidad, minimo, maximo;

        // Creamos escaner para leer datos
        Scanner key = new Scanner(System.in);

        // Pedimos variables al usuario
        System.out.println("Deme la cantidad de veces : ");
        cantidad = key.nextInt();
        System.out.println("Deme el rango mínimo: ");
        minimo = key.nextInt();
        System.out.println("Deme el rango máximo: ");
        maximo = key.nextInt();

        // Imprimimos las funciones
        NumerosAleatorios.numerosAleatorios(cantidad);
        System.out.println("----------------------------");
        NumerosAleatorios.numerosAleatorios(cantidad,maximo);
        System.out.println("----------------------------");
        NumerosAleatorios.numerosAleatorios(cantidad,maximo,minimo);

        // Cerramos escaner
        key.close();
    }

}