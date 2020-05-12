package SemanaDos_11a17Mayo;

import java.util.Scanner;

/*
Enunciado: 08/05/20 RRN
Realiza un programa que pida 10 números por teclado y que los almacene
en un array. A continuación, se mostrará el contenido de ese array
junto al índice (0 – 9) utilizando para ello una tabla. Seguidamente
el programa pasará los primos a las primeras posiciones, desplazando
el resto de números (los que no son primos) de tal forma que no se
pierda ninguno. Al final se debe mostrar el array resultante.
 */
public class Ej8 {
    public static void main(String[] args) {
        Scanner ro=new Scanner(System.in);
        //Definimos variables
        int tam=10;
        int[] arrayPrimos=new int[tam];
        boolean esPrimo;
        int[] primo=new int[tam];
        int[] noPrimo=new int[tam];
        int contPrimos=0, contNoPrimos=0;

        //Entrada de datos, rellenamos la array, comprobamos en este 'for' si son primos
        for (int i = 0; i <tam ; i++) {
            //entrada de datos
            System.out.println("Dame el número en la posición '"+i+"' :");
            //relleno de la array
            arrayPrimos[i]=ro.nextInt();

            //Primos:
            // Comprueba si el número es o no primo.
            esPrimo = true; //se inicia aqui para que se actualice el valor en cada iteracion, sino siempre daria false, despues de la primera iteracion
            for (int j = 2; j < arrayPrimos[i] - 1; j++) {
                if (arrayPrimos[i] % j == 0) {
                    esPrimo = false;
                }
            }

            // Si el número es primo, se almacena en el array 'primo'
            if (esPrimo) {
                primo[contPrimos++] = arrayPrimos[i];

                //si no es primo, en otro array
            } else {
                noPrimo[contNoPrimos++] = arrayPrimos[i];
            }

        }

        System.out.println("***********************Tabla en el orden de inserción*************************");
        System.out.println();
        //Mostramos las posiciones encima de la tabla de arrays de 0 a 9
        System.out.print("Índice: ");
        for (int i = 0; i <tam ; i++) {
            System.out.print("   "+ i+"  ");
        }
        System.out.println();
        System.out.println("        ____________________________________________________________");
        //System.out.println();
        System.out.print("Valor: ");

        //Mostramos los valores de la array desde la posicion 0 a la 9:
        for (int i = 0; i <arrayPrimos.length; i++) {
            //System.out.print("| "+arrayPrimos[i]+" |");
            if(i==0 ){
                System.out.print("|  "+arrayPrimos[i]+"  |");
            }else if(i==arrayPrimos.length){
                System.out.print("  "+arrayPrimos[i]+"  |");
            }else{
                System.out.print("  "+arrayPrimos[i]+"  |");
            }
        }
        System.out.println();
        System.out.print("        ____________________________________________________________");
        System.out.println();
        System.out.println();
        System.out.println("***********************Tabla pasando primos delante*************************");
        System.out.println();

        //*****Colocacion de los primos y no primos********
        // Los primos se meten en las primeras posiciones del array
        for (int i = 0; i < contPrimos; i++) {
            arrayPrimos[i] = primo[i];
        }

        // Los no primos se insertan al final.
        for (int i = contPrimos; i < contPrimos + contNoPrimos; i++) {
            arrayPrimos[i] = noPrimo[i - contPrimos];
        }


        //******Mostramos el array con los primos delante******

        //Mostramos las posiciones encima de la tabla de arrays de 0 a 9
        System.out.print("Índice: ");
        for (int i = 0; i <tam ; i++) {
            System.out.print("   "+ i+"  ");
        }
        System.out.println();
        System.out.println("        ____________________________________________________________");
        //System.out.println();
        System.out.print("Valor: ");

        //Mostramos los valores de la array desde la posicion 0 a la 9:
        for (int i = 0; i <arrayPrimos.length; i++) {
            //System.out.print("| "+arrayPrimos[i]+" |");
            if(i==0 ){
                System.out.print("|  "+arrayPrimos[i]+"  |");
            }else if(i==arrayPrimos.length){
                System.out.print("  "+arrayPrimos[i]+"  |");
            }else{
                System.out.print("  "+arrayPrimos[i]+"  |");
            }
        }
        System.out.println();
        System.out.print("        ____________________________________________________________");


    }
}
