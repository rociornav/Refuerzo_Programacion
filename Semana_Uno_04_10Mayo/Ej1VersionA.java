package SemanaUno_4a10Mayo;
//Versión 1 del ejercicio de número a cadena.
import java.util.Scanner;

/*
Escribe un programa que lea un número n e imprima una pirámide de
números con n filas como en la siguiente figura:
   1
  121
 12321
1234321
 */
public class Ej1VersionA {
    public static void main(String[] args) {
        Scanner ro = new Scanner(System.in);
        //Variables
        String cad = "";
        int n;
        int anchoTotal;
        System.out.println("Dame un numero n de filas: ");
        n = ro.nextInt();

        //Paso 1. Conseguir la secuencia de numeros desde '1 a n' y pasarla a String
        for (int i = 1; i <= n; i++) {
            cad = cad + i;
        }
        //Para comprobar si esta bien guardado: System.out.println(cad);


        //Paso 2. Conseguir el cuadrado; luego poner condiciones con if e ir pintando buscando el patron;
        anchoTotal = (cad.length() * 2) - 1; //para n=4 --> anchoTotal=7; anchoTotal=(cad.length()*2)-1=(4*2)-1=7;
        for (int i = 0; i < anchoTotal; i++) {

            if (i < cad.length()) {
                //Pintar espacios
                for (int j = 0; j < cad.length() - i - 1; j++) {
                    System.out.print(" ");
                }

                //Lado izquierdo de la piramide incluyendo la linea central.
                for (int j = 0; j <= i; j++) { //ponemos el incremento
                    System.out.print(cad.charAt(j));
                }

                //Lado derecho: resto de la piramide
                for (int j = i - 1; j >= 0; j--) { //ponemos el decremento
                    System.out.print(cad.charAt(j));
                }
            }
            System.out.println();
        }
        ro.close();

    }
}

