package SemanaTres_18a24Mayo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Clase 13. int[] filtraPrimos(int x[])
 * @author Rocío del Real
 */

/*
                    Enunciado:    20/05/20

                    Crea la función de manejo de arrays que tenga la siguiente cabecera y
                    que haga lo que se especifica en los comentarios (puedes incluirla en
                    tu propia biblioteca de rutinas):
                    public static int[] filtraPrimos(int x[])
                    // Devuelve un array con todos los números primos que se encuentren
                    // en otro array que se pasa como parámetro. Obviamente el tamaño
                    // del array que se devuelve será menor o igual al que se pasa como
                    // parámetro.
                    Utiliza esta función en un programa para comprobar que funcionan bien.
                    Para que el ejercicio resulte más fácil, las repeticiones de primos se
                    conservan; es decir, si en el array x el número 13 se repite 3 veces,
                    en el array devuelto también estará repetido 3 veces. Si no existe
                    ningún número primo en x, se devuelve un array con el número -1 como
                    único elemento.
 */

public class Ej13 {
    public static void main(String[] args) {
        Scanner ro=new Scanner(System.in);
        //Probando la funcionalidad del método.
        System.out.println("*******Probando filtraPrimos******");
        System.out.println("¿Cuántos elementos quiere ingresar en el array unidimensional?: ");
        int tam=ro.nextInt();
        int[] todo=new int[tam];
        System.out.println("|Rellenamos el array con "+tam+" elementos|");
        for (int i = 0; i < todo.length; i++) {
            System.out.println((i+1)+"). Ingrese el elemento: ");
            todo[i]=ro.nextInt();
        }
        System.out.println("\nSolución A (usando función esPrimo) -->"+ Arrays.toString(filtraPrimos(todo)));
        System.out.println("\nSolución B (sin función esPrimo)    -->"+ Arrays.toString(filtraPrimosB(todo)));
    }

    /**
     * filtraPrimos: reutiliza la funcion 'esPrimo' del Ej 11.
     * @param x --> array inicial
     * @return Devuelve un array con todos los números primos del array inicial. De no haber primos retorna -1.
     */

    public static int[] filtraPrimos(int x[]){
        //le adjudico el mismo tamaño (tamaño maximo posible que puede tener) que la matriz original.
        int[] primosConCeros=new int[x.length];
        boolean esPrimo=true;
        int contadorPrimos=0;
        for (int i = 0; i <x.length ; i++) {
            if(Ej11.esPrimo(x[i])){ //si es primo
                //relleno
                primosConCeros[contadorPrimos]=x[i];
                contadorPrimos++;
            }
        }
        if(contadorPrimos==0){//en caso de que no haya primos
            primosConCeros=new int[1];//lo ajustamos a 1 espacio
            primosConCeros[0]=-1;
            return primosConCeros;
        }
        int[] primosSinCeros = new int[contadorPrimos];

        for (int i = 0; i < primosSinCeros.length; i++) {
            primosSinCeros[i] = primosConCeros[i];
        }
        return primosSinCeros;
    }

    //Sin reutilizar la funcion esPrimo del Ej 11.
    public static int[] filtraPrimosB(int x[]){
        //le adjudico el mismo tamaño (tamaño maximo posible que puede tener) que la matriz original.
        int[] primosConCeros=new int[x.length];
        boolean esPrimo=true;
        int contadorPrimos=0;

        //recorro matriz x y compruebo los primos

        for (int i = 0; i <x.length ; i++) {
            if(x[i]==1){
                esPrimo=false;
            }else if(x[i]==2){
                esPrimo=true;
                //relleno: al ser primo=true
                primosConCeros[contadorPrimos]=x[i];
                contadorPrimos++;
            }else{
                esPrimo=true;//agrego esto sino no va como debe
                for (int divisores = 2; divisores < x[i]; divisores++) { //en este for no entra el 2, por eso lo saco fuera.

                    if(x[i]%divisores==0){ //si es divisible ningun elemento desde '2 hasta el (valorDelElemento-1)'
                        esPrimo=false;
                    } else if(esPrimo==true){
                        //relleno: al ser primo=true
                        primosConCeros[contadorPrimos]=x[i];
                        contadorPrimos++;
                        break; //FUNDAMENTAL: le pongo break porque entra más de lo necesario en el bucle...
                    }
                }
            }
        }
        if(contadorPrimos==0){//en caso de que no haya primos
            primosConCeros=new int[1];//lo ajustamos a 1 espacio
            primosConCeros[0]=-1;
            return primosConCeros;
        }
        int[] primosSinCeros=new int[contadorPrimos];
        //relleno
        for (int i = 0; i <primosSinCeros.length ; i++) {
            primosSinCeros[i]=primosConCeros[i];
        }
        return primosSinCeros;
    }
}
