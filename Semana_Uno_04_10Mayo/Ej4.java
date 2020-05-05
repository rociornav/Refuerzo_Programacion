package SemanaUno_4a10Mayo;

import java.util.Scanner;

/*
04/05/20 RRN
Enunciado:
Realiza un programa que pinte una X hecha de asteriscos. El programa
debe pedir la altura. Se debe comprobar que la altura sea un número
impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje
de error.
Ejemplo:
Por favor, introduzca la altura de la X: 5
            *   *
             * *
              *
             * *
            *   *
 */
public class Ej4 {
    public static void main(String[] args) {
        Scanner ro=new Scanner(System.in);
        System.out.println("Por favor, introduzca la altura de la X: ");
        int alturaX=ro.nextInt();

        //Paso 1. 2 bucles 'for' anidados que respetan la forma del cuadrado.
        for (int i = 0; i <alturaX ; i++) {
            for (int j = 0; j < alturaX; j++) {
                //Paso 2. Pintar figura
                //Condición1. Primera diagonal i==j (la i coincide con la j)
                /*Condición 2. Segunda diagonal (Patrón--> la suma de la fila y la columna es siempre alturaX-1
                  i+j==alturaX-1*/
                if(i==j || i+j==alturaX-1){
                    System.out.print("* ");
                }else{
                    //Pinto espacios: 2 espacios para que sea proporcional
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

        //Cerramos teclado
        ro.close();

    }
}
