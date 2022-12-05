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
        // Creamos la variable nfibonacci
        int nfibonacci;
        // Creamos escáner para leer datos
        Scanner key = new Scanner(System.in);

        // Pedimos variable num al usuario
        System.out.println("Deme un número: ");
        num = key.nextInt();
        // Llamamos a la función sumatorio
        System.out.println("El resultado del sumatorio es: " + FuncionesRecursivas.sumatorio(num));

        // Pedimos variable a y n al usuario
        System.out.println("Deme un número decimal: ");
        a = key.nextDouble();
        System.out.println("Deme un número para elevar a la potencia: ");
        n = key.nextInt();
        // Llamamos a la función potencia
        System.out.println("El resultado del número exponente es: " + FuncionesRecursivas.potencia(a,n));

        //Pedimos la posición
        System.out.println("Deme un número para calcular fibonacci: ");
        nfibonacci = key.nextInt();

        // Llamamos a la función
        System.out.println("El resultado es: " + FuncionesRecursivas.fibonacci(nfibonacci));

        // Cerramos el escáner
        key.close();
    }
}
