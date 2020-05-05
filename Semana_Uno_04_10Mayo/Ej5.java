package SemanaUno_4a10Mayo;

import java.util.Scanner;

/*05/05/20 RRN
Enunciado:
Escribe un programa que pida un número entero positivo por teclado y
que muestre a continuación los 5 números consecutivos a partir del
número introducido. Al lado de cada número se debe indicar si se trata
de un primo o no.

Ejemplo:
Por favor, introduzca un número entero positivo: 17
17 es primo
18 no es primo
19 es primo
20 no es primo
21 no es primo

Nota personal: un número primo solo es divisible entre 1 y sí mismo, debe tener unicamente 2 divisores distintos.
Por tanto, el primer multiplo que existe es 2.
 */
public class Ej5 {
    public static void main(String[] args) {
        Scanner ro=new Scanner(System.in);
        int n;
        boolean esPrimo;
        System.out.println("Por favor, introduzca un número entero positivo:");
        n=ro.nextInt();

        //Restriccion para comprobar que n es positivo
        while (n < 0) {
            System.out.println("Por favor, introduzca un número entero positivo:");
            n = ro.nextInt();
        }

        //Bucle for para mostrar los 5 numeros consecutivos incluyendo n
        for (int i = n; i <n+5 ; i++) {
            //Nota: ponerlo a true dentro del primer for, y así se reinicia a true en cada iteracion
            esPrimo=true;
            //Comprobar si tiene mas de un divisor distinto a 1 y a si mismo
            for(int x=2; x<i;x++){
                //Condicion 1. Detectando no primos:
                // Si es divisible entre algun numero de la secuencia de 'x' (desde 2 hasta 'i' sin incluir)
                if(i%x==0){
                    //No es primo.
                    esPrimo=false;
                    //en cuanto encuentro un divisor ya no es primo y no me interesa comprobar el resto de divisores.
                    break;
                }
            }

            //Condicion 2. Si esPrimo==true mostrar mensaje 'es primo'
            if(esPrimo){
                System.out.println(i+" es primo.");
            }else{
                System.out.println(i+" no es primo.");
            }

        }

    }
}
