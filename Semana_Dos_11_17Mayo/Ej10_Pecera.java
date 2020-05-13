package SemanaDos_11a17Mayo;

import java.util.Scanner;
/*
Enunciado: 09/05/20 RRN

Realiza un programa que pinte por pantalla una pecera con un pececito
dentro.
Se debe pedir al usuario el ancho y el alto de la pecera, que como
mínimo serán de 4 unidades. No hay que comprobar que los datos se
introducen correctamente; podemos suponer que el usuario los introduce
bien. Dentro de la pecera hay que colocar de forma aleatoria un
pececito, que puede estar situado en cualquiera de las posiciones que
quedan en el hueco que forma el rectángulo.
Ejemplo:
Por favor, introduzca la altura de la pecera (como mínimo 4): 4
Ahora introduzca la anchura (como mínimo 4): 7
* * * * * * *
*           *
*       &   *
* * * * * * *
 */
public class Ej10_Pecera {
    public static void main(String[] args) {
        Scanner ro=new Scanner(System.in);
        //Definir variables
        int altura, anchura;
        int posicionPezAnchura,posicionPezAltura;

        //Entrada de datos sin comprobar que sean correctos.
        System.out.println("Por favor, introduzca la altura de la pecera (como mínimo 4):");
        altura=ro.nextInt();
        System.out.println("Ahora introduzca la anchura (como mínimo 4):");
        anchura=ro.nextInt();

        //La posicion del pez estara dentro de las restricciones de las variables altura y anchura
        //desde el rango 1 al maximo permitido por la pecera
        posicionPezAltura= (int) (Math.random()*(altura-2)+1); //posicion eje y
        posicionPezAnchura = (int) (Math.random()*(anchura-2)+1); //posicion eje x

        /*Otra forma:
        posicionPezAltura= (int) (Math.random()*(altura-1)); //posicion eje y
        posicionPezAnchura = (int) (Math.random()*(anchura-1)); //posicion eje x

        Utilizo el operador ternario, significa que si la posicion del pez en el eje 'y' es cero
        se le suma a este uno para que no se coloque en el borde, sino se deja como está.
        Lo mismo para el eje 'x'.

          posicionPezAltura = posicionPezAltura == 0 ? posicionPezAltura+1 : posicionPezAltura;
          posicionPezAnchura = posicionPezAnchura == 0 ? posicionPezAnchura+1 : posicionPezAnchura;
         */



        //Dibujar pecera
        //no me debe salir ni cero ni el valor de la altura.
        System.out.println("posicionPezAltura: "+posicionPezAltura);
        //no me debe salir ni cero ni el valor de la anchura.
        System.out.println("posicionPezAnchura: "+posicionPezAnchura);
        for (int i = 0; i <altura ; i++) {
            for (int j = 0; j < anchura; j++) {
                //***Pintar paredes de la pecera***
                if((i==0 || i==altura-1) || (j==0 || j==anchura-1)){
                    System.out.print("*");


                    //***Pintar espacios de la pecera***
                }else if (i == posicionPezAltura && j == posicionPezAnchura){
                    /*Condición para corregir un error:
                    Si el eje de la 'y' (es decir, las filas) y el de la 'x' (columnas)
                    tienen sus valores generados, para evitar que me entrara en el 'else' donde
                    se creaba un espacio extra junto al pez desplazando el asterisco de esa fila.
                    */
                    System.out.print("");
                } else {
                    //Espacios de la pecera
                    System.out.print(" ");
                }

                //Pinto el pez: si tengo los 2 valores generados se coloca el pez.
                if (i == posicionPezAltura && j == posicionPezAnchura) {
                    System.out.print("& ");
                }else {
                    //Se pone para que no meta un espacio extra
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        //cierro teclado
        ro.close();

    }
}
