package Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creamos escaner para leer datos
        Scanner key = new Scanner(System.in);

        // Le damos valor a la variable esfera pidiéndola al usuario
        System.out.println("Deme el valor del radio: ");
        Esfera.radio = key.nextDouble();

        // Llamamos a las funciones sin pasar el parámetro radio, ya que está en la
        // clase Esfera
        System.out.printf("El valor de la superficie es %.2f", Esfera.superficie());
        System.out.println();
        System.out.printf("El valor de la superficie es %.2f", Esfera.volumen());

        // Cerramos el escaner
        key.close();
    }
}