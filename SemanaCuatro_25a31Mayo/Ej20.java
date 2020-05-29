package SemanaCuatro_25a31Mayo;

import java.util.Scanner;

/**
 * @author rocio del real
 * Fecha: 28/05/20
 */
/*
                    Ejercicio 20
                    Crea las funciones cuyas cabeceras se muestran a continuación, observa
                    que tienen el mismo nombre:
                    public static int ocurrencias(int digito, int n)
                    public static int ocurrencias(int digito, int[] a)
                    La función ocurrencias devuelve el número de veces que aparece un
                    dígito dentro de un número (primera función) o bien el número de veces
                    que aparece un dígito en una serie de números contenidos en un array
                    (segunda función).
                    Ejemplos:
                    ocurrencias(8, 4672) devuelve 0
                    ocurrencias(5, 25153) devuelve 2
                    ocurrencias(2, 123456) devuelve 1
                    Si a = {714, 81, 9, 11}, ocurrencias(1, a) devuelve 4
                    Si a = {42, 13, 12345, 4}, ocurrencias(4, a) devuelve 3
                    Si a = {6, 66, 666}, ocurrencias(6, a) devuelve 6
                    Utiliza estas funciones en un programa para comprobar que funcionan
                    bien.
 */
public class Ej20 {
    public static void main(String[] args) {
        Scanner ro=new Scanner(System.in);
        //Definir variables
        int digito, numero, tam;

        //Entrada de datos
        System.out.println("Función 1. ");
        System.out.println("¿Qué dígito desea encontrar? (Le diré el número de veces que aparece)");
        digito=ro.nextInt();
        System.out.println("Dame un número positivo de varias cifras: ");
        numero=ro.nextInt();

        System.out.println("***Solución 1. Función ocurrencias(int digito, int n)***");
        System.out.println("Su dígito "+digito+" aparece "+ocurrencias(digito,numero)+" veces.");

        System.out.println("Función 2. ");
        System.out.println("¿De qué tamaño quiere el array?");
        tam=ro.nextInt();

        //defino matriz
        int[] matriz=new int[tam];
        //Relleno de la matriz
        for (int i = 0; i < tam; i++) {
            System.out.println((i+1)+"). Dame el valor para la posición '"+i+"'.");
            matriz[i]=ro.nextInt();
        }
        System.out.println("\n¿Qué dígito desea encontrar? (Le diré el número de veces que aparece) ");
        digito=ro.nextInt(); //actualizo el valor en lugar de crear una nueva variable.
        System.out.println("\n***Solución 2. Función ocurrencias(int digito, int[] a)***");

        System.out.println("Su dígito "+digito+" aparece "+ocurrencias(digito,matriz)+" veces.");
    }

    //devuelve el número de veces que aparece un dígito dentro de un número
    public static int ocurrencias(int digito, int n){
        int veces=0;

        //Recorremos el numero pasado por parámetro y buscamos el dígito (en este caso no es necesario crear un auxiliar)
        while(n>0){
            /*Vamos buscando la coincidencia con el digito pasado por parámetro. n%10 recoge la ultima cifra de n
              Ej: n=302 n%10 equivale a n:10=3 con resto 2 (última cifra del n).*/
            if(n%10==digito){
                veces++; //cada vez que encuentre el digito suma 1 el contador.
            }
            //quita la ultima cifra de n
            n/=10;
        }
        return veces;
    }

    //Devuelve el número de veces que aparece un dígito en una serie de números contenidos en un array
    public static int ocurrencias(int digito, int[] a){
        int veces=0;
        //Recorremos el array
        for (int i = 0; i < a.length; i++) {
            //si el elemento de 'a' coincide con el digito, sumamos 1 al contador veces.
            if(a[i]==digito){
                veces++;
            }
        }
        return veces;
    }
}
