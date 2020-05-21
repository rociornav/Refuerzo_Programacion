package SemanaTres_18a24Mayo;

import java.util.Arrays;
import java.util.Scanner;
/**
 * Clase 15. filtraCapicuas(intx [])
 * @author Rocío del Real
 */


/*
                    Enunciado:   20/05/20

                    Crea la función de manejo de arrays que tenga la siguiente cabecera y
                    que haga lo que se especifica en los comentarios (puedes incluirla en
                    tu propia biblioteca de rutinas):
                    public int[] filtraCapicuas(int x[])
                    // Devuelve un array con todos los números capicúa que se encuentren
                    // en otro array que se pasa como parámetro. Obviamente el tamaño del
                    // array que se devuelve será menor o igual al que se pasa como
                    //parámetro.
                    Utiliza esta función en un programa para comprobar que funcionan bien.
                    Para que el ejercicio resulte más fácil, las repeticiones de números
                    capicúa se conservan; es decir, si en el array x el número 505 se
                    repite 3 veces, en el array devuelto también estará repetido 3 veces.
                    Si no existe ningún número capicúa en x, se devuelve un array con el
                    número -1 como único elemento.

 */
public class Ej15 {
    public static void main(String[] args) {
        Scanner ro=new Scanner(System.in);
        //Probando la funcionalidad del método.
        System.out.println("*******Probando filtraCapicuas******");
        System.out.println("¿Cuántos elementos quiere ingresar en el array unidimensional?: ");
        int tam=ro.nextInt();
        int[] todo=new int[tam];
        System.out.println("|Rellenamos el array con "+tam+" elementos|");
        for (int i = 0; i < todo.length; i++) {
            System.out.println((i+1)+"). Ingrese el elemento: ");
            todo[i]=ro.nextInt();
        }
        System.out.println("\nSolución -->"+ Arrays.toString(filtraCapicuas(todo)));
    }

    /**
     * filtraCapicuas: encuentra capicúas del array inicial con repeticiones, reutilizando la función esCapicua del Ej 11.
     * @param x array inicial.
     * @return Devuelve un array con todos los números capicúa que se encuentren en el array inicial x.
     */
    public static int[] filtraCapicuas(int x[]){
        int[] capicuasConCeros=new int[x.length];
        boolean esCapicua=false;
        int contadorCapicuas=0;
        //recorro el array que me pasan por parametro y busco si hay algun elemento capicua.
        for (int i = 0; i <x.length ; i++) {
            if(Ej11.esCapicua(x[i])){
                esCapicua=true;
                //relleno array con capicuas
                capicuasConCeros[contadorCapicuas]=x[i];
                contadorCapicuas++;
            }
        }
        int[] capicuasSinCeros=new int[contadorCapicuas];
        for (int i = 0; i <capicuasSinCeros.length ; i++) {
            capicuasSinCeros[i]=capicuasConCeros[i];
        }
        
        return capicuasSinCeros;
    }
}
