import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creamos variables para pedírsela al usuario
        int primo;
        int capicua;

        // Creamos un escáner para pedir datos
        Scanner key = new Scanner(System.in);

        // Pedimos variables al usuario
        System.out.println("Deme un número y le diré si es primo: ");
        primo = key.nextInt();
        System.out.println("Deme un número y le diré si es capicua: ");
        capicua = key.nextInt();

        // Creamos un objeto de la clase Numeros
        Numeros funciones = new Numeros();

        // Imprimimos el resultado con la función esPrimo y esCapicua
        System.out.println();
        System.out.println(funciones.esPrimo(primo)? "Es primo" : "No es primo");
        System.out.println(funciones.esCapicua(capicua)? "Es capicúa" : "No es capicúa");

        // Cerramos el escáner
        key.close();
    }
}