package SemanaDos_11a17Mayo;

import java.util.Scanner;
/*
Enunciado: 07/05/20 RRN

      Ejercicio 6 VERSION B - CON FUNCIONES DE CADENA

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
public class Ej6VersionB_ConFuncionesString {
    public static void main(String[] args) {
        Scanner ro=new Scanner(System.in);
        //Definir variables
        long n;
        int posicion;
        int digito;
        String n2="";
        String res="";

        //Entrada de datos por consola.
        System.out.println("Por favor, introduzca un número entero positivo: ");
        n = ro.nextLong();

        System.out.print("Introduzca la posición donde quiere insertar (desde 1 a la longitud del numero): ");
        posicion = ro.nextInt();

        System.out.print("Introduzca el dígito que quiere insertar: ");
        digito = ro.nextInt();

        //Convertimos el numero del usuario en String
        n2=Long.toString(n);

        //Recorremos numero caracter a caracter:
        for (int i = 0; i <n2.length() ; i++) {
            //Si la i es igual a la posicion del usuario, insertamos el nuevo digito.
            if(i==posicion-1){ //posicion - 1 , ya que el usuario nos da la posicion empezando en 1
                //***Insertar nuevo digito en la posicion indicada***
                /*Nota personal: de haber sido 'res' de tipo 'long' lo multiplicariamos por 10,
                 (res*10) para no machacar el resultado anterior*/
                res=(res)+digito;
            }else{
                /*Tambien funciona si lo hago asi: res=(res)+Character.getNumericValue(n2.charAt(i));
                Pero el metodo getNumericValue me retorna un int, por lo que al ser 'res' de tipo String
                no tiene sentido usarlo.
                 */
                //***Inserto el resto de digitos en el resultado.***
                res=(res)+n2.charAt(i);
            }
        }

        //Resultado:
        System.out.println("Resultado final: "+res);

        //Cerramos teclado
        ro.close();
    }
}
