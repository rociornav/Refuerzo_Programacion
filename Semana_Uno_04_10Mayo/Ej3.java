package SemanaUno_4a10Mayo;

import java.util.Scanner;

/* 04/05/20 RRN
Enunciado:

Realiza un programa que pinte la letra U por pantalla hecha con
asteriscos. El programa pedirá la altura. Fíjate que el programa
inserta un espacio y pinta dos asteriscos menos en la base para
simular la curvatura de las esquinas inferiores.
Ejemplo 1:
Introduzca la altura de la U: 5
*     *
*     *
*     *
*     *
 * * *
Ejemplo 2:
Introduzca la altura de la U: 4
*   *
*   *
*   *
 * *
 */
public class Ej3 {
    public static void main(String[] args) {
        Scanner ro=new Scanner(System.in);
        System.out.println("Introduzca la altura de la U: ");
        int alturaU=ro.nextInt();

        //Paso 1. Creo la forma del cuadrado con 2 bucles for. Al ser de lados iguales --> alto=ancho.
        for (int i = 0; i < alturaU; i++) { //filas=alto
            for (int j = 0; j < alturaU; j++) { //columnas=ancho
                //Paso 2. Pintar la U y poner las condiciones indicando dónde pintar.
                //Condición 1. ((j==0||j==alturaU-1)&& i<alturaU-1) --> pinta laterales de la U excepto la última fila
                //Condición 2. (i==alturaU-1 && j!=0 && j<alturaU-1) --> pinta la base de la U
                if(((j==0||j==alturaU-1)&& i<alturaU-1) || (i==alturaU-1 && j!=0 && j<alturaU-1)){
                    System.out.print("* ");
                }else{
                    //Paso 3. Pintar espacios. Pongo 2 espacios para que sea proporcional
                    System.out.print("  ");
                }

            }
            System.out.println("");
        }

    }
}
