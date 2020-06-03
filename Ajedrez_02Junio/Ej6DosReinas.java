package ajedrez;
//en un tablero de ajedrez 8x8 poner 2 reinas e indicar si puede matar a la otra. 02/06/20 Rocío del Real
import java.util.Scanner;

public class Ej6DosReinas {
    public static void main(String[] args) {
        Scanner ro=new Scanner(System.in);
        //Variables blanca
        int posColBlanca, posFilaBlanca;
        //Variables negra

        int posColNegra= (int) (Math.random()*8+1);
        int posFilaNegra= (int) (Math.random()*8+1);
        /*para probar una posicion elegida por mi: Ej: negra al h1.
        int posColNegra=8;
        int posFilaNegra=1;*/
        System.out.println("Posicion de la Reina Negra: "+(char)(posColNegra+96)+posFilaNegra);
        //ENTRADA DATOS REINA BLANCA.
        do{
            System.out.println("Dame la posicion de la reina blanca: (primero letra y luego numero)");
            String pos=ro.nextLine();
            posColBlanca=pos.charAt(0)-96; //a=97 (97-96=col1) y asi con las demas ...h=104
            //System.out.println(posColBlanca);
            posFilaBlanca=Integer.parseInt(String.valueOf(pos.charAt(1))); //convertimos a int el numero tipo String
            if(!(posColBlanca<=8&&posColBlanca>=1)||!(posFilaBlanca<=8&&posFilaBlanca>=1)){
                System.out.println("Error, ponga una posicion existente dentro del tablero.");
            }
            if(posColNegra==posColBlanca&&posFilaNegra==posFilaBlanca){
                System.out.println("Error, ponga una posicion diferente a la Reina Negra.");
            }
            //validamos que esté la pos dentro del tablero, y que la pos de la negra sea distinta a la blanca
        }while((!(posColBlanca<=8&&posColBlanca>=1)||!(posFilaBlanca<=8&&posFilaBlanca>=1))||(posColNegra==posColBlanca&&posFilaNegra==posFilaBlanca));
        //PINTO TABLERO SOLO CON LA REINA BLANCA.
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

        //Busco la coincidencia y digo si la blanca mata a la negra o no (la parte del ejercicio)
        System.out.println("***SOLUCION***");
        boolean estaMuerta=false;
        for (int fila = 8; fila >=1; fila--) {
            for (int columna = 1; columna <=8 ; columna++) {
                //Condicion 1: como si fuese una torre
                //condicion 2: como si fuese un alfil
                if((fila==posFilaBlanca||columna==posColBlanca)||(Math.abs(posFilaBlanca - fila) == Math.abs(posColBlanca - columna))
                        && (! ((posFilaBlanca == fila) && (posColBlanca == columna)))){ //patrón mov reina
                    //quito la posicion donde se encuentra para que no la muestre
                    if(((char)(columna+96)+fila)==((char)(posColNegra+96)+posFilaNegra)){
                        estaMuerta=true;
                    }else{
                        /*Poner siempre esto: antes salia este fallo:
                         si reina negra=h1 y reina blanca=a7 no puede matarla, pero el programa dice que si (ARREGLADO CON ESTE ELSE)*/
                        estaMuerta=false;
                    }
                }
            }
        }
        System.out.println();
        if(estaMuerta){
            System.out.println("Puede matar a la Reina Negra");
        }else{
            System.out.println("NO puede matar a la Reina Negra");
        }


    }
}
