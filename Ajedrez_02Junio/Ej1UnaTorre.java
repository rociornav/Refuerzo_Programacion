package ajedrez;

import java.util.Scanner;

/*
01/06/20 Rocío del Real

Enunciado examen Ev1 (recuperación tema3):
Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga a qué casillas podría saltar una
torre que se encuentra en esa posición. El tablero cuenta con 64 casillas. Las columnas se indican con las letras
 de la “a” a la “h” y las filas se indican del 1 al 8.

Ejemplo:

Introduzca la posición de la torre: c5

La torre puede moverse a las siguientes posiciones: c8,c7,c6,c4,c3,c2,c1,a5,b5,d5,e5,f5,g5,h5

Nota: con validación para comprobar que el usuario ha introducido una posición dentro del tablero.
 */
public class Ej1UnaTorre {
    public static void main(String[] args) {
        //Uso como referencia la posicion del ejemplo c5
        Scanner ro=new Scanner(System.in);
        String pos;
        int posFila, posColumna;
        System.out.println("***Tiene este tablero inicial, con estas posiciones***");
        System.out.println("Tablero:");
        System.out.print("  ");
        for (int i = 1; i <=8 ; i++) {
            System.out.print((char)(i+96)+" ");
        }
        System.out.println();
        for (int i = 8; i >=1 ; i--) {
            System.out.print(i+" ");
            for (int j = 1; j <=8 ; j++) {
                    System.out.print("- ");
            }
            System.out.println();
        }
        System.out.println();

       do{

            System.out.println("Introduzca la posición de la torre (primero la letra y luego el numero):");
            pos=ro.nextLine();
            posFila=Integer.parseInt(String.valueOf(pos.charAt(1)));//sacamos la fila=5 en el orden del tablero OJO
            posColumna=pos.charAt(0)-96;//letra c=99 en ascii, le resto 96 para que col=3
            //System.out.println(posFila);
            //System.out.println(posColumna);
          if(!(posColumna<=8&&posColumna>=1)||!(posFila<=8&&posFila>=1)){
               System.out.println("Por favor, introduzca una posicion dentro del tablero.");
            }

       }while(!(posColumna<=8&&posColumna>=1)||!(posFila<=8&&posFila>=1)); //h=104; a=97

        System.out.println("Tablero:");
        System.out.print("  ");
        for (int i = 1; i <=8 ; i++) {
            System.out.print((char)(i+96)+" ");
        }
        System.out.println();
        for (int i = 8; i >=1 ; i--) {
            System.out.print(i+" ");
            for (int j = 1; j <=8 ; j++) {

                //indicamos las posiciones hacia donde puede moverse, realmente las dibujo
                if(posColumna==j||i==posFila){
                    //Pinto la torre en la pos del usuario, esto es una pijada mia, no es necesaria esta condicion
                    if(posColumna==j&&i==posFila){
                        System.out.print("♖ ");
                    }else{
                        System.out.print("* ");
                    }

                }else{
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Posiciones donde puede mover su torre: ");
        for (int i = 8; i >=1 ; i--) {
            for (int j = 1; j <=8 ; j++) {

                if(posColumna==j||i==posFila){
                    if(posColumna==j&&i==posFila){//busco evitar escribir el c5
                        System.out.print("");
                    }else{
                        System.out.print((char)(j + 96) + "" + i + " ");
                    }

                }else{

                }
            }

        }
    }
}
