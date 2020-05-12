package SemanaDos_11a17Mayo;
/*
Enunciado: 09/05/20 RRN

Realiza un generador de melodía con las siguientes condiciones:

a) Las notas deben estar generadas al azar. Las 7 notas son do, re,
mi, fa, sol, la y si.

b) Una melodía está formada por un número aleatorio de notas mayor o
igual a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8,
12...).

c) Cada grupo de 4 notas será un compás y estará separado del
siguiente compás mediante la barra vertical “|” (Alt + 1). El
final de la melodía se marca con dos barras.

d) La última nota de la melodía debe coincidir con la primera.

Ejemplo 1:
do mi fa mi | si do sol fa | fa re si do | sol mi re do ||
Ejemplo 2:
la re mi sol | fa mi mi si | do la sol fa | fa re si sol | do sol mi
re | fa la do la ||
 */
public class Ej9 {
    public static void main(String[] args) {
        /*Generar un rango de 4 a 28 notas que sean multiplos de 4 (para ello lo multiplico por 4).
        Nota: si pusiese cantidadNotas= (int) (Math.random()*28+4); me da el rango de valores correctos,
        pero no me agrupa en 4 notas cada compás.
         */
        int cantidadNotas= 4*(int) (Math.random()*7+1);
        int notasTodas;//= (int) (Math.random()*7); OJO! fallo de iniciarlo aquí, que siempre salen las notas del mismo tipo

        //Creo las variables para almacenar las notas, e indicar cuál es la primera nota
        String nota="";
        String primeraNota="";


        for (int i = 1; i <= cantidadNotas; i++) {
            //Creo un ***generador aleatorio de todas las notas posibles***
            notasTodas= (int) (Math.random()*7);
            //Nota: 2 opciones posibles a) con switch, b)con if else (mas largo).
            switch (notasTodas){
                case 1:
                    nota= "do";
                    break;
                case 2:
                    nota= "re";
                    break;
                case 3:
                    nota= "mi";
                    break;
                case 4:
                    nota= "fa";
                    break;
                case 5:
                    nota= "sol";
                    break;
                case 6:
                    nota= "la";
                    break;
                case 7:
                    nota= "si";
                    break;

            }

            //Le indico que en la primera iteración está la ***primera nota***.
            if (i == 1) {
                primeraNota = nota;
            }

            /* ***Igualar la ultima nota con la primera nota***
            Cuando esté en la última iteración, debe coincidir con la primera nota.
             */
            if (i == cantidadNotas) {
                nota = primeraNota;
            }

            //***Pinto las notas***.
            System.out.print(nota + " ");

            //***Pinto el formato***:
            // Cuando esté en la última posicion, dibujo la doble barra
            if ( i == cantidadNotas ) {
                System.out.print("||");

                //Por cada grupo de 4 notas poner la barra individual
            } else if ( i % 4 == 0 ) {
                System.out.print("| ");
            }


        }
    }

}
