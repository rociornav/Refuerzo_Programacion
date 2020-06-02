package ajedrez;
/*02/06/20 Rocío del Real
En un tablero de 8x8 poner 2 alfil e indicar si pueden matarse.
 */
import java.util.Scanner;

public class Ej4DosAlfil {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Variables alfil blanco
        String pos;
        int columnaAlfil, filaAlfil;

        //Colocamos de forma aleatoria el alfil negro
        int colNegro= (int) (Math.random()*8+1);
        int filaNegro= (int) (Math.random()*8+1);
        System.out.println("Posición del alfil negro: "+((char)(colNegro+96))+filaNegro);//ojo con ((char)(colNegro+96))

        //Entrada de datos alfil blanco.
        do{
            System.out.print("\nIntroduzca la posición del alfil blanco, por ejemplo d5: ");
            pos= sc.nextLine();
            columnaAlfil = (int)(pos.charAt(0)) - 96; //a=97 (97-96=columna 1) h=104 (104-96=columna 8)
            //System.out.println(columnaAlfil);
            filaAlfil=Integer.parseInt(String.valueOf(pos.charAt(1)));//sacamos la fila=5 en el orden del tablero OJO
            if(!(columnaAlfil>=1&&columnaAlfil<=8)||!(filaAlfil>=1&&filaAlfil<=8)){
                System.out.println("Error. Introduzca una posición existente en el tablero.");
            }
            if(colNegro==columnaAlfil&&filaNegro==filaAlfil){
                System.out.println("Error. Introduzca una posición distinta al alfil negro. ");
            }
            //Validamos que esté la posición dentro del tablero y que no pise al alfil negro.
        }while((!(columnaAlfil>=1&&columnaAlfil<=8)||!(filaAlfil>=1&&filaAlfil<=8))||(colNegro==columnaAlfil&&filaNegro==filaAlfil));

        //System.out.println(filaAlfil);
        System.out.print("  ");
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
       //POSICIONES DONDE PUEDE MOVERSE EL ALFIL BLANCO
        System.out.println("El alfil puede moverse a las siguientes posiciones:");

        for(int fila = 8; fila >= 1; fila--) {
            for(int columna = 1; columna <= 8; columna++) {
                if ((Math.abs(filaAlfil - fila) == Math.abs(columnaAlfil - columna))
                        && (! ((filaAlfil == fila) && (columnaAlfil == columna)))) {
                    System.out.print((char)(columna + 96) + "" + fila + " ");
                }
            }
        }


        //OJO, lo que me pide el ejercicio es a partir de aquí, lo de arriba es para hacerlo visual y practicar XD.
        //¿Puede matar a la negra o no?
        boolean estaMuerta=false;
        for(int fila = 8; fila >= 1; fila--) {
            for(int columna = 1; columna <= 8; columna++) {
                if(((Math.abs(filaAlfil - fila) == Math.abs(columnaAlfil - columna))
                        && (! ((filaAlfil == fila) && (columnaAlfil == columna))))){

                    if(((char)(columna + 96)+fila)==((char)(colNegro+96)+filaNegro)){
                        estaMuerta=true;
                    }

                }
            }
        }
        if(estaMuerta){
            System.out.println("Puede matar al alfil negro.");
        }else{
            System.out.println("NO Puede matar al alfil negro");
        }

    }
}
