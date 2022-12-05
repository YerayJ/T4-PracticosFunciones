package Ejercicio4;

public class Operaciones {

    // Creamos variable num1 de tipo int para pedírsela al usuario
    int num1;
    // Creamos variable num2 de tipo int para pedírsela al usuario
    int num2;

    int suma() {
        // Devolvemos un resultado haciendo la operación directamente
        return num1 + num2;
    }

    int resta() {
        // Devolvemos un resultado haciendo la operación directamente
        return num1 - num2;
    }

    int multiplicacion() {
        // Devolvemos un resultado haciendo la operación directamente
        return num1 * num2;
    }

    int division() {
        // Creamos un resultado de tipo int
        int res = 0;
        // Devolvemos un resultado haciendo la operación directamente,
        // teniendo en cuenta que el segundo divisor no sea 0
        if (num2 != 0) {
            res = num1 / num2;
        }
        return res;
    }

}