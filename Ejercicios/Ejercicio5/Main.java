package Ejercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creamos variable num para pedírsela al usuario
        int num;
        // Creamos la variable n para la función potencia
        int n;
        // Creamos la variable a de tipo double para la función potencia
        double a;

        // Creamos escáner para leer datos
        Scanner key = new Scanner(System.in);

        // Pedimos datos al usuario
        System.out.println("Deme un número: ");
        num = key.nextInt();
        System.out.println("Deme un número decimal: ");
        a = key.nextDouble();
        System.out.println("Deme un número para elevar a la potencia: ");
        n = key.nextInt();

        // Llamamos a las funciones
        System.out.println(FuncionesRecursivas.sumatorio(num));
        System.out.println(FuncionesRecursivas.potencia(a,n));
    }
}
