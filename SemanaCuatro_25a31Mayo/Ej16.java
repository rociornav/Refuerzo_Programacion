package SemanaCuatro_25a31Mayo;

import java.util.Scanner;

/**
 * @author rocio del real
 * 28/05/20
 */
/*
                        Ejercicio 16. 28/05/20 RRN (Explicación del algoritmo al final)
                        Realiza un programa que pinte un triángulo hueco tal como se muestra
                        en los ejemplos. El usuario debe introducir la altura de la figura.
                        Utiliza funciones para pintar las líneas.
                        Ejemplo 1:
                        Introduzca la altura de la figura: 8
                        ********
                        *     *
                        *    *
                        *   *
                        *  *
                        * *
                        **
                        *
                        Ejemplo 2:
                        Introduzca la altura de la figura: 5
                        *****
                        *  *
                        * *
                        **
                        *
 */
public class Ej16 {
    public static void main(String[] args) {
        Scanner ro=new Scanner(System.in);
        System.out.println("Dame la altura: ");
        int altura=ro.nextInt();

        for (int i = 0; i <altura ; i++) {
            for (int j = 0; j <altura; j++) {
                if(j==0 || i==0 || i+j==altura-1){
                    System.out.print("*");
                }else{
                    //Dibujo los espacios
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

        /*
        Explicación de cada condición para una altura=5:
        Pinto la figura con sus posiciones.

       i=0 *****
       i=1 *  *
       i=2 * *
       i=3 **
       i=4 *
     j-->  01234

     Paso 1. Pintar lo siguiente: que es donde la posicion de i==0 O j==0
       i=0 *****
           *
           *
           *
           *
     j-->  0

     Paso 2. Pintar la diagonal: necesitamos encontrar el patrón

       i=0 *****   Cuando i=0 j=4   es decir i+j=altura-1
       i=1 *  *    Cuando i=1 j=3
       i=2 * *     Cuando i=2 j=2
       i=3 **      Cuando i=3 j=1
       i=4 *       Cuando i=4 j=0
     j-->  01234

         */
    }
}
