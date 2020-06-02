package ajedrez;
//02/06/20 Rocío del Real
//♕ REINA BLANCA (UNA): Mostrar las posiciones dónde puede moverse partiendo desde la posicion indicada por el usuario.
import java.util.Scanner;

public class Ej5UnaReina {
    public static void main(String[] args) {
        Scanner ro=new Scanner(System.in);
        int posColBlanca, posFilaBlanca;
        do{
            System.out.println("Dame la posicion de la reina blanca: (primero letra y luego numero)");
            String pos=ro.nextLine();
            posColBlanca=pos.charAt(0)-96; //a=97 (97-96=col1) y asi con las demas ...h=104
            //System.out.println(posColBlanca);
            posFilaBlanca=Integer.parseInt(String.valueOf(pos.charAt(1))); //convertimos a int el numero tipo String
            if(!(posColBlanca<=8&&posColBlanca>=1)||!(posFilaBlanca<=8&&posFilaBlanca>=1)){
                System.out.println("Error, ponga una posicion existente dentro del tablero.");
            }
        }while(!(posColBlanca<=8&&posColBlanca>=1)||!(posFilaBlanca<=8&&posFilaBlanca>=1));//validamos que esté la pos dentro del tablero

        System.out.print(" ");
        for (int i = 1; i <=8 ; i++) {
            System.out.print((char)(i+96)+" ");//OJo con los parentesis (char)(i+96)
        }
        System.out.println();
        for (int fila = 8; fila >=1; fila--) {
            System.out.print(fila);
            for (int columna = 1; columna <=8 ; columna++) {
                //Condicion 1: como si fuese una torre
                //condicion 2: como si fuese un alfil
                if((fila==posFilaBlanca||columna==posColBlanca)||(Math.abs(posFilaBlanca - fila) == Math.abs(posColBlanca - columna))
                        && (! ((posFilaBlanca == fila) && (posColBlanca == columna)))){ //patrón mov reina
                    //coloco la reina
                    if(posFilaBlanca==fila&&posColBlanca==columna){
                        System.out.print("♕ ");
                    }else{
                        System.out.print("* ");
                    }

                }else{
                    System.out.print("- ");
                }
            }
            System.out.println();
        }

        //Le indico donde puede moverse quitando su posicion
        System.out.println("\nPosiciones dónde puede mover su Reina Blanca: ");
        for (int fila = 8; fila >=1; fila--) {
            for (int columna = 1; columna <=8 ; columna++) {
                //Condicion 1: como si fuese una torre
                //condicion 2: como si fuese un alfil
                if((fila==posFilaBlanca||columna==posColBlanca)||(Math.abs(posFilaBlanca - fila) == Math.abs(posColBlanca - columna))
                        && (! ((posFilaBlanca == fila) && (posColBlanca == columna)))){ //patrón mov reina
                    //quito la posicion donde se encuentra para que no la muestre
                    if(posFilaBlanca==fila&&posColBlanca==columna){
                        System.out.print("");
                    }else{
                        System.out.print((char)(columna+96)+""+fila+" ");
                    }
                }
            }
        }

    }
}
