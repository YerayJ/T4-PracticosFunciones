package Ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creamos escáner para leer datos
        Scanner key = new Scanner(System.in);

        // Creamos un objeto para llamar a los objetos de la clase Operaciones
        Operaciones operaciones = new Operaciones();

        // Pedimos variable num1 y num2 al usuario
        System.out.println("Deme dos números: ");
        operaciones.num1 = key.nextInt();
        operaciones.num2 = key.nextInt();

        // Imprimimos el resultado de las funciones llamadas
        System.out.println("-------------MENÚ-------------");
        System.out.println("El resultado de la suma es: " + operaciones.suma());
        System.out.println("El resultado de la resta es: " + operaciones.resta());
        System.out.println("El resultado de la multiplicación es: " + operaciones.multiplicacion());
        System.out.println("El resultado de la división es: " + operaciones.division());

        // Cerramos el escáner
        key.close();

    }
}