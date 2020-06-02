package ajedrez;
//Doy por hecho que el usuario introduce una posicion dentro del tablero
/* 02/06/20 Rocío del Real

Enunciado profesor:

Pintar en un tablero de ajedrez de 8x8 dos torres. E indicar si se pueden matar una a otra.

Nota1: con validación para comprobar que el usuario ha introducido una posición dentro del tablero.
Nota2: con validación para comprobar que la torre blanca está en una posicion distinta a la torre negra.
 */
import java.util.Scanner;

public class Ej2DosTorres {
    public static void main(String[] args) {

        Scanner ro = new Scanner(System.in);
        String pos;
        int posFila, posColumna;

        //TABLERO INICIAL
        System.out.println("***Tiene este tablero inicial, con estas posiciones***");
        System.out.println("Tablero:");
        System.out.print("  ");
        for (int i = 1; i <= 8; i++) {
            System.out.print((char) (i + 96) + " ");
        }
        System.out.println();
        for (int i = 8; i >= 1; i--) {
            System.out.print(i + " ");
            for (int j = 1; j <= 8; j++) {
                System.out.print("- ");
            }
            System.out.println();
        }
        System.out.println();

        //COLOCAMOS DE FORMA ALEATORIA LA TORRE NEGRA.
        int posFilaNegra = (int) (Math.random() * (8) + 1); //posicion eje y //de 1 a 8
        int posColumnaNegra = (int) (Math.random() * (8) + 1); //posicion eje x
        System.out.println("***Hemos colocado la Torre Negra, con la posicion " + ((char) (posColumnaNegra + 96)) + posFilaNegra + " ***");
        System.out.println("Tablero:");
        System.out.print("  ");
        for (int i = 1; i <= 8; i++) {
            System.out.print((char) (i + 96) + " ");
        }
        System.out.println();
        for (int i = 8; i >= 1; i--) {
            System.out.print(i + " ");
            for (int j = 1; j <= 8; j++) {
                //indicamos las posiciones hacia donde puede moverse, realmente las dibujo
                if (posColumnaNegra == j || i == posFilaNegra) {
                    //Pinto la torre negra en la pos aleatoria
                    if (posColumnaNegra == j && i == posFilaNegra) {
                        System.out.print("♜ ");
                    } else {
                        System.out.print("- ");//no trazo los movimientos de la negra
                    }

                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
        System.out.println();

        do
        {// Validación 1. comprobar que no se coloca encima de la torre negra (Nota: no compruebo que esté dentro del tablero

            System.out.println("Introduzca la posición de la Torre Blanca (primero la letra y luego el numero):");
            pos = ro.nextLine();
            posFila = Integer.parseInt(String.valueOf(pos.charAt(1)));//sacamos la fila=5 en el orden del tablero OJO
            posColumna = pos.charAt(0) - 96;//letra c=99 en ascii, le resto 96 para que col=3
            //System.out.println(posFila);
            if ((posColumna == posColumnaNegra && posFila == posFilaNegra)) {
                System.out.println("Por favor, introduzca una posicion distinta a la Torre Negra.");
            }
            if(!(posColumna<=8&&posColumna>=1)||!(posFila<=8&&posFila>=1)){
                System.out.println("Por favor, introduzca una posicion dentro del tablero.");
            }
            //si la posicion es igual a la de la pos de la negra se repite el bucle
        } while ((posColumna == posColumnaNegra && posFila == posFilaNegra)||(!(posColumna<=8&&posColumna>=1)||!(posFila<=8&&posFila>=1)));

        System.out.println("Tablero:");
        System.out.print("  ");
        for (int i = 1; i <= 8; i++) {
            System.out.print((char) (i + 96) + " ");
        }
        System.out.println();
        for (int i = 8; i >= 1; i--) {
            System.out.print(i + " ");
            for (int j = 1; j <= 8; j++) {

                //indicamos las posiciones hacia donde puede moverse la blanca, realmente las dibujo
                if (posColumna == j || i == posFila) {
                    //Pinto la torre blanca en la pos del usuario
                    if (posColumna == j && i == posFila) {
                        System.out.print("♖ ");
                    } else if (posColumnaNegra == j && posFilaNegra == i) {
                        //Pinto la torre negra en su sitio.
                        System.out.print("♜ ");

                    } else{
                        //Pinto los movimientos de la torre blanca
                        System.out.print("* ");
                    }

                } else {
                    //Pintar de todas formas la figura negra
                    if (posColumnaNegra == j && i == posFilaNegra) {
                        //torre negra
                        System.out.print("♜ ");
                    }else{
                        //espacios del resto del tablero
                        System.out.print("- ");
                    }
                }
            }
            System.out.println();
        }
        //Escribimos las posiciones dónde puede moverse la torre blanca
        System.out.println();
        System.out.println("Posiciones donde puede mover su Torre Blanca: ");
        for (int i = 8; i >= 1; i--) {
            for (int j = 1; j <= 8; j++) {
                if (posColumna == j || i == posFila) {
                    if (posColumna == j && i == posFila) {//busco evitar escribir la posicion donde ya está la torre blanca
                        System.out.print("");
                    } else {
                        System.out.print((char) (j + 96) + "" + i + " ");
                    }

                } else {

                }
            }
        }
        //Mata o no mata a la torre negra.
        System.out.println();
        if (posColumna == posColumnaNegra || posFila == posFilaNegra) {
            System.out.println("Puede matar a la torre negra.");
        } else {
            System.out.println("No puede matar a la torre negra. ");
        }
    }
}
