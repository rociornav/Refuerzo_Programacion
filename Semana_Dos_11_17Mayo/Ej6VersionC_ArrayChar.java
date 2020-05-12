package SemanaDos_11a17Mayo;

import java.util.Scanner;
/*
Enunciado: 07/05/20 RRN
Ejercicio 6 VERSION C - COMO CADENA DE CARACTERES -
Escribe un programa que cambie un dígito dentro de un número dando la
posición y el valor nuevo. Las posiciones se cuentan de izquierda a
derecha empezando por el 1. Se recomienda usar long en lugar de int ya
que el primero admite números más largos. Suponemos que el usuario
introduce correctamente los datos.
Ejemplo:
Por favor, introduzca un número entero positivo: 406783
Introduzca la posición dentro del número: 3
Introduzca el nuevo dígito: 1
El número resultante es 401783
 */
public class Ej6VersionC_ArrayChar {
    public static void main(String[] args) {
        //Como array de caracteres
        Scanner ro=new Scanner(System.in);
        //Definir variables
        long n;
        int posicion;
        int digito;
        String nCad="";
        char[] aCaracteres;

        //Entrada de datos por consola.
        System.out.println("Por favor, introduzca un número entero positivo: ");
        n = ro.nextLong();

        System.out.print("Introduzca la posición donde quiere insertar (desde 1 a la longitud del numero): ");
        posicion = ro.nextInt();

        System.out.print("Introduzca el dígito que quiere insertar: ");
        digito = ro.nextInt();

        //Convertimos el numero del usuario en String
        nCad=Long.toString(n);
        //Convierto la cadena n2 a un array de caracteres
        aCaracteres = nCad.toCharArray();

        //Convertimos de int a char: la forma correcta es pasar el int digito a string y de ahi a char.

        String nuevoDigito= Integer.toString(digito);
        char nDigito=nuevoDigito.charAt(0);
        /*Comprobamos si nDigito se rellena correctamente-> System.out.println(nDigito);
        Ej: si digito=9; entonces nDigito='9';*/

        System.out.println("_________________________________");
        System.out.println("       RESULTADO FINAL: ");
        System.out.println("_________________________________");

        //******MOSTRAR ARRAY DE CARACTERES******
        //System.out.println(resArray.toString()); //ojooo esto me da la direccion de memoria

        System.out.println("******Mostrar array con numero cambiado.******");
        //sustituyo el valor en la posicion deseada
        aCaracteres[posicion-1]=nDigito;
        //muestro array
        for (int i = 0; i < aCaracteres.length; i++) {
            System.out.print(""+aCaracteres[i]);
        }
        ro.close();

    }
}
