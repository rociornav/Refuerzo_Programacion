package SemanaDos_11a17Mayo;

import java.util.Scanner;

/*
Enunciado: 07/05/20 RRN
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
public class Ej6VersionUno_DividiendoEntre10 {
    public static void main(String[] args) {
        Scanner ro=new Scanner(System.in);
        //Definir variables
        long n, aux;
        int posicion,contador=0;
        int digito;
        int longitud;
        long prueba=0;

        //Entrada de datos por consola.
        System.out.println("Por favor, introduzca un número entero positivo: ");
        n = ro.nextLong();

        System.out.print("Introduzca la posición donde quiere insertar: ");
        posicion = ro.nextInt();

        System.out.print("Introduzca el dígito que quiere insertar: ");
        digito = ro.nextInt();


        //contamos las cifras del numero
        longitud=0;
        //Repetir mientras que n sea mayor a cero
        while (n > 0){
            //quitamos el ultimo digito dividiendolo entre 10
            n /= 10;
            //por cada iteracion se suma 1 cifra.
            longitud++;
        }

        //Esto te da la vuelta al numero: osea de 1234 a 4321
        aux=n;
        while(aux>0){ //uso el aux para que no me machaque el valor del numero original
            /*longitud-posicion ya que al estar el numero al reves... la posicion cambia aqui
             */
            if(contador==longitud-posicion){
                //insertamos el nuevo digito en la posicion indicada por el usuario
                prueba=(prueba*10)+digito;
            }else{
                /*la ultima cifra se guarda en prueba con aux%10, prueba*10 se pone para no pisar
                el resto de cifras almacenadas*/
                prueba=(prueba*10)+(aux%10);
            }

            aux=aux/10;
            contador++;
        }

        // System.out.println("Resultado prueba 1 = "+prueba); esto elimina los ceros del final, pues no hay forma de ponerlos al principio con int

        //System.out.println("Probando rdo al reves: "+ prueba);

        //Como vemos se ha cambiado correctamente pero sigue al reves, asi que le damos la vuelta
        //mi aux ahora vale 0, por lo que puedo reutilizarla para guardar el resultado
        while(contador>0){
            aux=(aux*10)+(prueba%10);
            prueba=prueba/10;
            contador--;
        }

       //Salida de datos: solucion.
        System.out.println("Resultado final = "+aux);




    }
}
