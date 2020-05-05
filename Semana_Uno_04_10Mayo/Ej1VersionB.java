package SemanaUno_4a10Mayo;

import java.util.Scanner;
/* 04/05/20 RRN
Versión 2. Solo usando int n.

Escribe un programa que lea un número n e imprima una pirámide de
números con n filas como en la siguiente figura:
   1
  121
 12321
1234321
 */
public class Ej1VersionB {
    public static void main(String[] args) {
        //FORMA 1.
        Scanner ro = new Scanner(System.in);
        System.out.println("Dame un numero 'n' de filas: ");
        //variables
        int n=ro.nextInt();
        int cantCifrasPorFila=1;
        int numeroAEscribir;

        for (int i = 1; i <=n; i++) { //filas=i columnas=j
            numeroAEscribir=0;


            //Paso 1. Pinto espacios
            /*
            'n - i' es el patrón para dibujar los espacios laterales.
            Ejemplo:
            ---1---    para i=1 n=4 y siguiendo el patrón n-i = 4-1 = 3 espacios
            --121--    para i=2 n=4 y siguiendo el patrón n-i = 4-2 = 2 espacios
            -12321-    para i=3 n=4 y siguiendo el patrón n-i = 4-3 = 1 espacio
            1234321

             */
            for (int j = 1; j <= n - i ; j++) {
                System.out.print(" ");
            }


            //Paso 2. Pinto pirámide para 'n'
            for (int j = 1; j <=cantCifrasPorFila ; j++) {

                /*Concición 1: encontrar el punto medio que es la cifra '3' en la tercera fila de la tercera columna.
                Si la columna está en una posicion menor o igual que la fila, se irá incrementando el numero a escribir
                en la piramide, sino habrá un decremento de dicho número.
                 */
                if(j<=i){
                    //pinta el lado izquierdo de la pirámide, incluyendo la línea central.
                    numeroAEscribir++;
                }else{
                    //pinta el resto de la pirámide (lado derecho).
                    numeroAEscribir--;
                }

                //Escribe el número resultante de acuerdo a la condición.
                System.out.print(numeroAEscribir);
            }
            System.out.println();
            cantCifrasPorFila=cantCifrasPorFila+2; //la longitud de cifras por fila
        }
        ro.close();
    }
}
