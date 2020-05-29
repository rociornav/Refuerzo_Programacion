package SemanaCuatro_25a31Mayo;
/*
Ejercicio 18
Realiza un programa que rellene un array con 10 números aleatorios
comprendidos entre 2 y 100 (ambos incluidos) y que los muestre por
pantalla. A continuación, el programa indicará para cada uno de ellos
si es un número primo y/o un capicúa de la forma que muestra el
ejemplo.
Ejemplos:
Array generado:
19 22 57 11 3 52 32 46 2 14
El 19 es primo y no es capicúa.
El 22 no es primo y es capicúa.
El 57 no es primo y no es capicúa.
El 11 es primo y es capicúa.
El 3 es primo y es capicúa.
El 52 no es primo y no es capicúa.
El 32 no es primo y no es capicúa.
El 46 no es primo y no es capicúa.
El 2 es primo y es capicúa.
14 no es primo y no es capicúa.
 */
public class Ej18 {
    public static void main(String[] args) {
        //Defino el array y reservo espacio para 10
        int [] aleatorio=new int[10];
        boolean esPrimo=true;
        boolean esCapicua=false;
        System.out.println("\n***Array aleatoria de 2 a 100 incluidos: ***\n");
        //Recorremos el array
        for (int i = 0; i < aleatorio.length; i++) {
            //Rellenamos con numeros aleatorios de 2 a 100.
            /*
            ¿Cómo comprobar que me incluye el máximo valor de mi intervalo de aleatorios?:

            elijo que me muestre el array con numeros de 99 a 100 (por recortar el rango),le sumo más 1 para que me incluya 100.
            Le resto 99 a 100 porque o sino el máximo sería 199.

            aleatorio[i]= (int) (Math.random()*(100-99+1)+99); solo da valores de 99 y 100

            Como veo que es correcta la fórmula la establezco para un rango más amplio (de 2 a 100).
             */

            aleatorio[i]= (int) (Math.random()*(100-2+1)+2); //Valores de 2 a 100
            System.out.print(aleatorio[i]+" ");
        }

        System.out.println("\n\n***Soluciones***\n");


        //Recorremos el array aleatoria rellena, y comprobamos si es primo
        for (int i = 0; i <aleatorio.length ; i++) {
            //si el elemento que estoy mirando es primo y capicua
            if(esPrimo(aleatorio[i]) && esCapicua(aleatorio[i])){
                System.out.println("El "+aleatorio[i]+" es primo y es capicúa.");

                //es primo y no capicua
            }else if(esPrimo(aleatorio[i]) && !esCapicua(aleatorio[i])){
                System.out.println("El "+aleatorio[i]+" es primo y no es capicúa.");

                //no es primo y si capicua
            }else if(!esPrimo(aleatorio[i]) && esCapicua(aleatorio[i])){
                System.out.println("El "+aleatorio[i]+" no es primo y es capicúa.");

                //no es ni uno ni otro
            }else{
                System.out.println("El "+aleatorio[i]+" no es primo y no es capicúa.");
            }

        }
    }

    //Utilizo las funciones del ejercicio 11 para optimizar el codigo

    public static boolean esPrimo(int elemento){
        boolean esPrimo = true;
        if (elemento == 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i < elemento; i++) {
                if (elemento % i == 0) {
                    esPrimo = false;
                }
            }
        }
        return esPrimo;
    }

    public static long voltea(long n) {
        long aux = n;
        long volteado = 0;
        while (aux > 0) {
            volteado = volteado * 10 + aux % 10;
            aux /= 10;
        }
        return volteado;
    }

    public static boolean esCapicua(long n) {
        boolean res = false;
        long aux = n;
        long volteado = voltea(aux);
        if (volteado == n) {
            res = true;
        }
        return res;
    }


}
