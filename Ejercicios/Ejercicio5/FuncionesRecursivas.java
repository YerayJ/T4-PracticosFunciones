package Ejercicio5;

public class FuncionesRecursivas {
    // Precondición num >= 1
    static int sumatorio(int num) {
        // Crear variable res para almacenar el resultado
        int res;
        // Creamos un if cuya condición base sea que si num es igual a 1, res vale 1
        if (num == 1) {
            res = 1;
            // Si no res tomará el valor de el número más el valor que tenga num menos uno al llamar otra vez a la función
        } else {
            res = num + sumatorio(num - 1);
        } // Y devolvemos el resultado
        return res;
    }
    // Precondición a > 1 / n > 1
    static double potencia(double a, int n){
        double res;
        if (n == 1) {
            res = a;
        } else {
            res = potencia(n*n-1);
        }
        return res;
    }
}
