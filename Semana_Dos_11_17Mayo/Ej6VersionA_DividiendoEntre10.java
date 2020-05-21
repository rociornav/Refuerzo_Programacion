package SemanaDos_11a17Mayo;

import java.util.Scanner;

/*
Enunciado: 07/05/20 RRN (actualizado 19/05/20)
Ejercicio 6 VERSION A - SIN USAR FUNCIONES, SOLO DIVIDIENDO ENTRE 10.
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
public class Ej6VersionA_DividiendoEntre10 {
    public static void main(String[] args) {
        Scanner ro=new Scanner(System.in);
        //Definir variables
        long n, aux;
        int posicion,contador=0;
        int digito;
        int longitud;
        long pruebaAlReves=0, resFinal=0;

        //Entrada de datos por consola.
        System.out.println("Por favor, introduzca un número entero positivo: ");
        n = ro.nextLong();

               /*** Cuento las cifras de n ***/

        //contamos las cifras del numero
        longitud=0;
        //Repetir mientras que n sea mayor a cero
        aux=n;
        while (aux > 0){
            //quitamos el ultimo digito dividiendolo entre 10
            aux /= 10;
            //por cada iteracion se suma 1 cifra.
            longitud++;
        }

        //System.out.println("Probando longitud --> "+longitud);

        //Más entrada de datos.
        System.out.print("Introduzca la posición donde quiere insertar de '1 a "+longitud+"' :");
        posicion = ro.nextInt();

        System.out.print("Introduzca el dígito que quiere insertar: ");
        digito = ro.nextInt();

        //Recorremos el numero
        aux=n; //hago una copia del numero. La idea es buscar la posicion e insertar el numero digito
        while(aux>0){
            //Ej: aux=n=1234 posicion=2 digito=9 Solucion-->1934; posicion es 2==4cifras-2iteraciones
            if(posicion==longitud-contador){
                pruebaAlReves=pruebaAlReves*10+digito;
            }else{
                pruebaAlReves=pruebaAlReves*10+aux%10;
            }

            //elimina la ultima cifra
            aux/=10;
            contador++;
        }

        //System.out.println("Prueba numero al reves + digito: "+prueba);Me inserta el numero correctamente, pero esta al reves.

        //***Ponemos el numero al derecho***
        aux=pruebaAlReves;
        while (aux>0){
            resFinal=resFinal*10+aux%10;
            aux/=10;
        }

        System.out.println("Solución --> "+resFinal);

        //cierro teclado
        ro.close();



    }
}
