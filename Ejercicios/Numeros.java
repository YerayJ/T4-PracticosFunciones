public class Numeros {

    // Precondición num > 0
    boolean esPrimo(int num) {
        // Inicializamos el res en true
        boolean res = true;
        // Creamos un bucle que empiece en 2 ya que uno no es primo y llegamos hasta el
        // número.
        for (int i = 2; i < num; i++) {
            // Si alguno de los números de la i son divisibles entre num significa que no es
            // primo nuestro número
            if (num % i == 0) {
                // Y cambiamos el resultado a false, ya que no es primo
                res = false;
                // Y salimos del bucle, no necesitamos más comprobaciones
                break;
            }
        } // Devolvemos el resultado
        return res;
    }

    // Precondición num > 0
    boolean esCapicua(int num) {
        // Inicializamos el res en false
        boolean res = false;
        // Usamos una variable auxiliar para ir guardando la última cifra
        int cifra;
        // En inverso iremos guardando el número dándole la vuelta
        int inverso = 0;

        // Creamos un bucle que empiece en que la i valga num y por cada vuelta le vamos
        // quitando una cifra
        for (int i = num; i > 0; i = i / 10) {
            // Sacamos la última cifra sacando módulo 10 de i
            cifra = i % 10;
            // Para añadir a inverso le añadimos una cifra más multiplicando por 10, al ser
            // 0 le sumamos la cifra que hemos sacado de nuestro número
            inverso = inverso * 10 + cifra;
        } // Si el número a la inversa es igual al número la variable res será true
        if (inverso == num) {
            res = true;
        }
        // Devolvemos el resultado
        return res;
    }

}