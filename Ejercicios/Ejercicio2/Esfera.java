package Ejercicio2;

public class Esfera {

    // Creamos la variable radio estática
    static double radio;

    // Precondición radio > 0
    static double superficie() {
        // Fórmula de la superficie, usamos el Math.PI
        double res = 4*Math.PI*(radio*radio);
        // Devolvemos resultado
        return res;
    }
    // Precondición radio > 0
    static double volumen() {
        // Fórmula del volumen, usamos el Math.PI
        double res = (4*Math.PI/3)*(radio*radio*radio);
        // Devolvemos resultado
        return res;
    }
}