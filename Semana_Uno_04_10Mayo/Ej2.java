package SemanaUno_4a10Mayo;

import java.util.Scanner;

/*04/05/20 RRN
Enunciado:
Escribe un programa que, dado un número entero positivo, diga cuáles
son y cuánto suman los dígitos pares. Los dígitos pares se deben
mostrar en orden, de izquierda a derecha. Usa long en lugar de int
donde sea necesario para admitir números largos.

Ejemplo 1:
Por favor, introduzca un número entero positivo: 94026782
Dígitos pares: 4 0 2 6 8 2
Suma de los dígitos pares: 22

Ejemplo 2:
Por favor, introduzca un número entero positivo: 31779
Dígitos pares:
Suma de los dígitos pares: 0

Ejemplo 3:
Por favor, introduzca un número entero positivo: 2404
Dígitos pares: 2 4 0 4
Suma de los dígitos pares: 10
 */
public class Ej2 {
    public static void main(String[] args) {
        //Variables:
        long n; //numero del usuario tipo long
        String numeroUsuario;
        String pares;
        int sumaPares;
        Scanner ro = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número entero positivo: ");
        n = ro.nextLong();

        //Paso 1. Pasamos el número del usuario a String para recorrerla con for.
        //Nota:valueOf me da el valor primitivo del numero que le estamos pasando.
        numeroUsuario = String.valueOf(n);
        pares = new String();
        sumaPares=0;
        //Paso 2. Recorremos la string resultante de numeroUsuario en cada posicion
        for (int i = 0; i < numeroUsuario.length(); i++) {
            /*Si mi cadena del numero del usuario contiene una cifra 'par' en la pos 'i' que estoy mirando
              paso de char a int para poder dividir entre 2 y obtener el resto=0*/
            if (Character.getNumericValue(numeroUsuario.charAt(i))%2==0) {
                //lo añado a la variable'pares', inserto el espacio para separarlos.
                pares = pares + numeroUsuario.charAt(i) + " ";
                /*A la vez, voy sumando la cifra par en una variable nueva 'sumaPares' pasando de char a int la cadena
                numeroUsuario*/
                sumaPares=sumaPares+Character.getNumericValue(numeroUsuario.charAt(i));
            }
        }

        //Solución
        System.out.println("___________________");
        System.out.println("     Solución:");
        System.out.println("___________________");
        System.out.println();
        System.out.println("Solución 1.-Dígitos pares que aparecen en el número " + numeroUsuario + " --> " + pares);
        System.out.println();
        System.out.println("Solución 2.-Suma de las cifras pares que aparecen en el número " + numeroUsuario + " --> "
                + sumaPares);

        //Cierro teclado
        ro.close();



    }
}
