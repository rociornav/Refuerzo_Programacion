package SemanaCuatro_25a31Mayo;

import java.util.Scanner;

/**
 * @author rocio del real
 * Fecha: 28/05/20
 */
/*
                    Ejercicio 19
                    Implementa una función con nombre nEsimo que busque el número que hay
                    dentro de un array bidimensional en la posición n-ésima contando de
                    izquierda a derecha y de arriba abajo, como si se estuviera leyendo.
                    El primer elemento es el 0. Si la posición donde se busca no existe en
                    el array, la función debe devolver -1. Se debe entregar tanto el
                    código de la función como el código de prueba que la usa. La cabecera
                    de la función es la siguiente:
                    public static int nEsimo(int[][] n, int posicion)
                    Si el array a es el que se muestra a continuación:
                    35 72 24 45 42 60
                    32 42 64 23 41 39
                    98 45 94 11 18 48
                    12 34 56 78 90 12
                    nEsimo(a, 0) devuelve 35
                    nEsimo(a, 2) devuelve 24
                    nEsimo(a, 5) devuelve 60
                    nEsimo(a, 6) devuelve 32
                    nEsimo(a, 21) devuelve 78
                    nEsimo(a, 23) devuelve 12
                    nEsimo(a, 24) devuelve -1
                    nEsimo(a, 100) devuelve -1
 */
public class Ej19 {
    public static void main(String[] args) {
        Scanner ro=new Scanner(System.in);
        //declaro variable.
        int pos;
        //Defino y relleno el array bidimensional
        int[][] arrayBid=new int[4][6];//4 filas y 6 columnas
        //La relleno, en este caso elegiré rellenarla de forma aleatoria
        System.out.println("Tenemos este array bidimensional: \n");
        for (int i = 0; i <arrayBid.length ; i++) {
            for (int j = 0; j < arrayBid[i].length; j++) {
                //relleno:
                arrayBid[i][j]= (int) (Math.random()*(100)+1); //de 1 a 100 sin incluir el 100
                //muestro por consola:
                System.out.print(arrayBid[i][j]+" ");
            }
            System.out.println();
        }

        int total=(arrayBid.length*arrayBid[0].length)-1;
        System.out.println("\nDame la posición y le muestro el elemento: (desde 0 hasta "+total+")");
        pos=ro.nextInt(); //inicio variable.
        System.out.println("***Solucion***");
        if(nEsimo(arrayBid,pos)==-1){
            System.out.println("No existe esa posición en el array --> -1");
        }else{
            System.out.println("En la posición "+pos+" se encuentra el elemento --> "+nEsimo(arrayBid,pos));
        }

    }

    /*
    Idea, ver el array bidimensional como una sola fila (como una sola dimension), es decir:

    si tengo esta array bidimensional:

    0 1 2 3 4
    5 6 7 8 9

    La quiero ver de esta forma:

    0 1 2 3 4 5 6 7 8 9

    }*/

    public static int nEsimo(int[][] n, int posicion){
        int res=0,cont=0;
        boolean existeResultado=false;
        //recorrer n[][] con doble bucle for
        for (int i = 0; i < n.length; i++) { //4 filas
            for (int j = 0; j <n[i].length ; j++) { //6 columnas
                /*Buscamos la coincidencia con ayuda de un contador para que cuente cada elemento hasta encontrar
                 la posicion acumulada.*/
                if(cont==posicion){
                    res=n[i][j];
                    existeResultado = true; //con esto digo que existe un resultado
                }
                cont++; //por cada elemento encontrado suma 1.
            }
        }

        //Le indicamos que si no existe un resultado que devuelva -1.
        if(!existeResultado){
            res=-1;
        }

        return res;
    }

}
