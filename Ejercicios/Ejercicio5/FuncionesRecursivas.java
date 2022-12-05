package Ejercicio5;

public class FuncionesRecursivas {
    // Precondición num >= 1
    static int sumatorio(int num) {
        // Crear variable res para almacenar el resultado
        int res;
        // Creamos un if cuya condición base sea que si num es igual a 1, res vale 1
        if (num == 0) {
            res = 0;
            // Si no res tomará el valor de el número más el valor que tenga num menos uno al llamar otra vez a la función
        } else {
            res = num + sumatorio(num - 1);
        } // Y devolvemos el resultado
        return res;
    }

    // Precondición a > 1 / n > 1
    static double potencia(double a, int n) {
        // Creamos la variable res de tipo double, ya que necesitamos decimales
        double res;
        // Si num es 0 el res vale 1
        if (n == 0) {
            res = 1;
        } else { // Si no la variable res multiplicará la variable a por n-1 en cada vuelta de la llamada a la variable potencia
            res = a * potencia(a, n - 1);
        } // Devolvemos el resultado
        return res;
    }

    // Precondición num > 0
    static int fibonacci(int num) {
        // Creamos la variable res
        int res;
        // Si el número es igual a 0 o 1 la variable res valdrá uno
        if (num == 0 || num == 1) {
            res = 1;
        } else { // Llamamos a la función en los dos casos, primero en el que fibonacci vale num - 1 y en el de num -2, y se suma a res.
            res = fibonacci(num - 1) + fibonacci(num - 2);
        } // Devolvemos el resultado
        return res;
    }
}
