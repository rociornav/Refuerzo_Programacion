package SemanaTres_18a24Mayo;
/**
 * @author Rocío del Real
 * Biblioteca de funciones matemáticas (primera parte de 2).
 */
public class Ej11 {

    /**
     * Método 1. esCapicua.
     * @param n Se le pasa por parametro un número tipo long positivo.
     * @return Devuelve true si el número que se pasa como parámetro es capicúa, y false en caso contrario.
     */
    public static boolean esCapicua(long n) {
        boolean res = false;
        long aux = n;
        long volteado = voltea(aux);
        if (volteado == n) {
            res = true;
        }
        return res;
    }

    /**
     * Método 2. esPrimo.
     * @param n Se le pasa por parametro un número tipo entero positivo.
     * @return Devuelve true si n es primo, y falso si no es primo.
     */

    public static boolean esPrimo(int n) {
        boolean esPrimo = true;
        if (n == 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    esPrimo = false;
                }
            }
        }
        return esPrimo;
    }

    /**
     * Método 3. siguientePrimo.
     * @param n Se le pasa por parámetro un número tipo entero positivo.
     * @return Devuelve el menor primo que es mayor al número Ej: si n=6 (da igual que el numero pasado por parametro
     * no sea primo 'creo'), tiene que devolver 7.
     */
    public static int siguientePrimo(int n) {
        int nextPrimo = n;
        if (esPrimo(n)) {
            nextPrimo = n + 1;
            while (!esPrimo(nextPrimo)) {
                nextPrimo++;
            }
        } else {
            while (!esPrimo(nextPrimo)) {
                nextPrimo++;
            }
        }
        return nextPrimo;
    }

    /**
     * Método 4. potencia.
     * @param base
     * @param exponente
     * @return devuelve la potencia.
     */
    public static double potencia(int base, int exponente) {
        double resPotencia = Math.pow(base, exponente);
        return resPotencia;
    }

    /**
     * Método 5. digitos.
     * @param n Se le pasa por parametro un número tipo long positivo.
     * @return Devuelve la longitud o cantidad de cifras del número que pasamos por parámetro.
     */
    public static int digitos(long n) {
        int longitud = 0;
        long aux = n;
        //En caso de que el numero sea negativo
        if (aux < 0) {
            //Lo paso a positivo actualizando el valor de aux:
            aux = aux - (aux * 2);

            //Si el numero es cero tiene una cifra.
        } else if (aux == 0) {
            longitud = 1;
        }

        //Si el numero es positivo por cada iteracion en el bucle suma 1 la longitud.
        while (aux > 0) {
            //elimina la ultima cifra.
            aux /= 10;
            longitud++;
        }
        return longitud;
    }

    /**
     * Método 6. voltea:  Le da la vuelta a un número.
     * @param n
     * @return devuelve el número al revés.
     */
    public static long voltea(long n) {
        long aux = n;
        long volteado = 0;
        while (aux > 0) {
            volteado = volteado * 10 + aux % 10;
            aux /= 10;
        }
        return volteado;
    }

    /**
     * Método 7. digitoN.
     * @param posicion
     * @param numero
     * @return Devuelve el dígito que está en la posición n de un número entero. Se empieza contando por el 0 y
     * de izquierda a derecha.
     */

    public static int digitoN(int posicion, int numero){
        String elementoCad="";
        String nCad=Integer.toString(numero);
        //Se empieza contando por el 0 y de izquierda a derecha.
        for (int i = 0; i <nCad.length() ; i++) {
            if(i==posicion){
                elementoCad=elementoCad+nCad.charAt(i);
            }
        }
        int elemento=Integer.valueOf(elementoCad);
        return elemento;
    }


}
