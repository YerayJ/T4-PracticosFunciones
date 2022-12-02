package Ejercicio3;

public class NumerosAleatorios {

    // Precondición cantidad > 0
    static void numerosAleatorios(int cantidad) {
        // Creamos un bucle que vaya hasta la cantidad que le hemos pasado en incremento
        for (int i = 0; i < cantidad; i++) {
            // Creamos un número aleatorio de tipo double del 0 al 1
            double ramdom = (double) (Math.random());
            // Imprimimos la variable en cada bucle
            System.out.printf("%.2f", ramdom);
            System.out.println();
        }
    }

    // Precondición cantidad > 0 / maximo > 0
    static void numerosAleatorios(int cantidad, int maximo) {
        // Creamos un bucle que vaya hasta la cantidad que le hemos pasado en incremento
        for (int i = 0; i < cantidad; i++) {
            // Creamos un número aleatorio de tipo int que el rango sea hasta el número que
            // le hemos pasado más 1.
            int ramdom = (int) (Math.random() * maximo) + 1;
            // Imprimimos el resultado en cada bucle
            System.out.println(ramdom);
        }
    }

    // Precondición cantidad > 0 / maximo > minimo / minimo > 0
    static void numerosAleatorios(int cantidad, int maximo, int minimo) {
        // Creamos un bucle que vaya hasta la cantidad que le hemos pasado en incremento
        for (int i = 0; i < cantidad; i++) {
            // Para crear este número aleatorio creamos un rango en el que restamos el
            // máximo menos el mínimo para que al multiplicarse no de un resultado por
            // encima del máximo, después le sumamos el mínimo para no tener un número menor
            // que nuestro mínino
            int ramdom = (int) (Math.random() * (maximo - minimo + 1) + minimo);
            // Imprimimos resultado
            System.out.println(ramdom);
        }
    }

}