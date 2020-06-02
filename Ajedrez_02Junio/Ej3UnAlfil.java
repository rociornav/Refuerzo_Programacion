package ajedrez;

import java.util.Scanner;

/* 02/06/20 Rocío del Real
Ejercicio 8 p.132 libro aprende java con ejercicios
Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga
a qué casillas podría saltar un alfil que se encuentra en esa posición. Como se
indica en la figura, el alfil se mueve siempre en diagonal. El tablero cuenta con
64 casillas. Las columnas se indican con las letras de la “a” a la “h” y las filas
se indican del 1 al 8.
 */
public class Ej3UnAlfil {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nIntroduzca la posición del alfil, por ejemplo d5: ");
        String pos= sc.nextLine();
        int columnaAlfil = (int)(pos.charAt(0)) - 96; //a=97 (97-96=columna 1) h=104 (104-96=columna 8)
        //System.out.println(columnaAlfil);
        int filaAlfil=Integer.parseInt(String.valueOf(pos.charAt(1)));//sacamos la fila=5 en el orden del tablero OJO
        //System.out.println(filaAlfil);
        System.out.print(" ");
        for (int i = 1; i <=8 ; i++) {
            System.out.print((char)(i+ 96)+" ");
        }
        System.out.println();
        for(int fila = 8; fila >= 1; fila--) {
            System.out.print(fila+" ");
            for(int columna = 1; columna <= 8; columna++) {
                if ((Math.abs(filaAlfil - fila) == Math.abs(columnaAlfil - columna))
                        && (! ((filaAlfil == fila) && (columnaAlfil == columna)))) {
                    System.out.print("* ");
                }else if(fila==filaAlfil&&columna==columnaAlfil){
                    //Pinto alfil blanco
                    System.out.print("♗ ");
                }else{
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
        //OJO, lo que me pide el ejercicio es a partir de aquí, lo de arriba es para hacerlo visual.
        System.out.println("El alfil puede moverse a las siguientes posiciones:");

        for(int fila = 8; fila >= 1; fila--) {
            for(int columna = 1; columna <= 8; columna++) {
                if ((Math.abs(filaAlfil - fila) == Math.abs(columnaAlfil - columna))
                        && (! ((filaAlfil == fila) && (columnaAlfil == columna)))) {
                    System.out.print((char)(columna + 96) + "" + fila + " ");
                }
            }
        }
    }
}
