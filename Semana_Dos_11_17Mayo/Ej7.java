package SemanaDos_11a17Mayo;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
Ejercicio 7  07/05/20 RRN
Realiza un programa que muestre por pantalla un array de 10 filas por
10 columnas relleno con números aleatorios entre 200 y 300. A
continuación, el programa debe mostrar los números de la diagonal que
va desde la esquina superior izquierda a la esquina inferior derecha,
así como el máximo, el mínimo y la media de los números que hay en esa
diagonal.
 */
public class Ej7 {

    public static void main(String[] args) {
        //Definimos variables
        int filas=10,col=10;
        int max, min;
        double media;
        int[][] aleatoria;
        //Entrada de datos
        Scanner ro=new Scanner(System.in);
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("  Mostrar array de 10 filas y 10 columnas con numeros aleatorios entre 200 y 300:");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println();

        //Creamos los espacios de la array de 10 * 10
        aleatoria=new int[filas][col];

        //Rellenamos la array con numeros aleatorios
        for (int i = 0; i < aleatoria.length; i++) { //lo mismo da poner i<filas
            for (int j = 0; j <aleatoria[i].length ; j++) {//lo mismo da poner j<col
                /*cuidado con esto si pongo solo esto pinta el array sin rellenarla
                System.out.print(((int)(Math.random()*(300-200))+200)+" ");*/

                //relleno el array
                aleatoria[i][j]=(int)(Math.random()*(300-200))+200;

                //muestro array
                System.out.print(aleatoria[i][j]+" ");

            }
            System.out.println();
        }
        System.out.println();

        //iniciamos las variables max y min al primer elemento que encontramos en el array
        min=max=aleatoria[0][0];

        //iniciamos la variable media a cero
        media=0;

        //Mostrar solo la diagonal esquina superior izquierda a inferior derecha
        for (int i = 0; i < aleatoria.length; i++) {
            for (int j = 0; j <aleatoria[i].length ; j++) {
                //patron para mostrar la diagonal que queremos
                if(i==j){
                    System.out.print(" "+aleatoria[i][j]+" ");
                    //------------PARA ENCONTRAR EL MAX, MIN
                    //así como el máximo, el mínimo y la media de los números que hay en esa diagonal.

                    /*
                    Si el elemento que estoy mirando es mayor al que ocupa max, lo sustituimos por ese nuevo elemento.
                     */
                    if(max<aleatoria[i][j]){
                        max=aleatoria[i][j];
                    }
                    /*
                    Si el elemento que estoy mirando es menor al que ocupa min, lo sustituimos por ese nuevo elemento.
                     */
                    if(min>aleatoria[i][j]){
                        min=aleatoria[i][j];
                    }
                    //---------------------------

                    //Calculamos la media: en este caso la suma de los elementos de la diagonal.
                    media = media + aleatoria[i][j];

                    //Pintamos espacios o guiones.
                }else{
                    System.out.print(" - ");
                }

            }
            System.out.println();
        }
        System.out.println();


        //Mostramos max, min y la media
        System.out.println("Valor mínimo: "+min);
        System.out.println("Valor máximo: "+max);
        //System.out.println("Suma elementos diagonal = "+media);
        media=media/aleatoria.length; //el total de elementos es aleatoria.length = 10 elementos
        System.out.println("Valor de la media con un decimal: "+media);
        System.out.printf("Valor de la media con dos decimales: %.2f",media);



    }
}
