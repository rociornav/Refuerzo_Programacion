package SemanaTres_18a24Mayo;
/**
 * @author Rocío del Real
 * Biblioteca de funciones matemáticas (segunda parte de 2).
 */
public class Ej12 {

    //__________________________________________________________________________________________________________________

    /**
     * Método 8. posicionDeDigito.
     * @param num
     * @param digito
     * @return Da la posición de la primera ocurrencia de un dígito dentro de un número entero.
     * Si no se encuentra, devuelve -1.
     */
    public static int posicionDeDigito(long num, int digito) {
        //Lo voy a hacer dividiendo entre 10
        int pos = 0;
        long aux = num, ultimoDigito = 0, contador = 0;
        //reutilizo la funcion 'digitos(n)' para contar las cifras de num.
        int longitud = Ej11.digitos(num);
        while (aux > 0) { //lo recorre de derecha a izquierda, en otras palabras 'al revés'
            /*guardamos el ultimo digito del numero, y lo vamos comparando con el digito del usuario
              hasta que coincida*/
            ultimoDigito += aux % 10;
            if (ultimoDigito == digito) {
                pos = (int) ((longitud - 1) - contador);
                /*en caso de coincidir, se devuelve su posicion. (longitud-1) es el límite maximo
                de la posicion que puede llegar a tener ese numero, le quitamos lo acumulado en el contador
                para que dé la posicion exacta */
                return pos;
            }
            ultimoDigito = 0; //actualizamos su valor, para que pueda almacenar el digito anterior al último

            aux = aux / 10;//eliminamos la ultima cifra del numero
            contador++;
        }
        //si no existe ese digito, saldrá del bucle while tras comprobarlo y el resultado será -1.
        return pos = -1;
    }

    //__________________________________________________________________________________________________________________

    /**
     * Método 9. quitaPorDetras:  Le quita a un número n dígitos por detrás (por la derecha).
     * @param num
     * @param digitosPorDetras
     * @return devuelve el trozo de número sin los dígitos por detrás.
     */
    public static long quitaPorDetras(long num, int digitosPorDetras) {
        //Lo voy a hacer diviendo entre 10
        long res = num; //hago un auxiliar del numero original
            /*eliminamos digitos por detras, /10 para eliminar uno solo, /100 para eliminar 2, y asi sucesivamente.
            Para ello, uso la potencia y así incremento los ceros del divisor '10'.
            */
        res /= Math.pow(10, digitosPorDetras); //esto es lo mismo que res=res/Math.pow(10,digitosPorDetras)

        //me devuelve el numero sin los digitos por detras.
        return res;
    }

    //__________________________________________________________________________________________________________________

    /**
     * Método 10. quitaPorDelante:  Le quita a un número n dígitos por delante (por la izquierda).
     * @param num
     * @param digitosPorDelante
     * @return devuelve el trozo de número sin los dígitos por delante.
     */

    public static long quitaPorDelante(long num, int digitosPorDelante){
        //lo voy a hacer dividiendo entre 10.
        long aux=num, alReves=0, res=0; //hago una copia del numero original.
        //Le doy la vuelta a num
        while (aux>0){
            alReves=alReves*10+aux%10; //guardo los digitos hasta quedar el numero al reves.
            aux/=10; //elimino la ultima cifra
        }
        /*Elimino la cantidad de digitos indicados por el usuario, repitiendo el proceso que utilicé en el método
        quitaPorDetras(long num, int digitosPorDetras)*/
        alReves /= Math.pow(10, digitosPorDelante);

        //Le doy la vuelta para que quede 'al derecho'
        aux=alReves; //actualizo el valor de aux
        while (aux>0){
            res=res*10+aux%10; //guardo los digitos en una nueva variable.
            aux/=10; //elimino la ultima cifra
        }

        //me devuelve el numero sin los digitos por delante.
        return res;
    }

    //__________________________________________________________________________________________________________________

    /**
     * Método 11. pegaPorDetras: inserta un solo dígito a un número por detrás.
     * @param digito
     * @param num
     * @return número entero con el dígito insertado al final.
     */
    public static int pegaPorDetras(int digito, int num ){
        int res=num;
        //si res=123 y digito=4 mi res=123*10+4; res=1230+4; res=1234
        res=res*10+digito;
        return res;
    }

    //__________________________________________________________________________________________________________________

    /**
     * Método 12. pegaPorDelante:  Añade un dígito a un número por delante.
     * @param digito
     * @param num
     * @return número entero con el dígito insertado por delante.
     */

    public static int pegaPorDelante(int digito, int num){
        //Idea: dar la vuelta al numero, insertar digito, y volver a dar la vuelta
        int aux=num;//hago un aux
        int res1=0, res=0;
        while(aux>0){
            res1=res1*10+aux%10;
            aux/=10;
        }
        //Inserto el digito
        res1=res1*10+digito;
        //Lo pongo 'al derecho'.
        aux=res1;
        while(aux>0){
            res=res*10+aux%10;
            aux/=10;
        }
        return res;
    }

    //__________________________________________________________________________________________________________________


    /**
     * Método 13. trozoDeNumero.
     * @param numCompleto
     * @param posInicial
     * @param posFinal
     * @return devuelve el trozo correspondiente.
     */

    //Dividiendo entre 10.
    public static int trozoDeNumero(int numCompleto, int posInicial, int posFinal){
        int res=0, contador=1;
        int aux=numCompleto;
        int longNum=Ej11.digitos(numCompleto);//cuento las cifras del numero
        while (aux>0){

                /*Esto da fallo... lo dejo para que no se me olvide jamás.
                if(contador==longNum-posFinal||contador<=longNum-posInicial){
                    res=res*10+aux%10;

                }*/
                //Le pido que me coja los numeros en un rango completo
                if(contador<=longNum-posInicial&&contador>=longNum-posFinal){
                    res=res*10+aux%10;
                }

            aux/=10;
            contador++;

        }
        res= (int) Ej11.voltea(res); //lo pongo al derecho
        return res;
    }

    //usando Substring
    public static int trozoDeNumeroB(int numCompleto, int posInicial, int posFinal){
        //Paso el numero en cadena
        String conviertoACadNum=Integer.toString(numCompleto);
        //Retiro el trozo poniendo las posiciones...
        String trozoCad=conviertoACadNum.substring(posInicial,posFinal+1);
        //Convierto el trozo a integer
        int res=Integer.parseInt(trozoCad);
        return res;
    }

    //Usando bucles for...
    public static int trozoDeNumeroC(int numCompleto, int posInicial, int posFinal){
        String resCad="";
        //Paso el numero en cadena
        String conviertoACadNum=Integer.toString(numCompleto);

        for (int i = posInicial; i <conviertoACadNum.length() ; i++) {
            if(i>=posInicial&&i<=posFinal){
                resCad=resCad+conviertoACadNum.charAt(i);
            }
        }
        int res=Integer.parseInt(resCad);
        return res;
    }

    //__________________________________________________________________________________________________________________

    /**
     * Método 14. juntaNumeros: Pega dos números para formar uno.
     * @param n1
     * @param n2
     * @return Devuelve un número int como resultado de concatenar n1 y n2.
     */
    public static int juntaNumeros(int n1, int n2){
        /*
        la idea es multiplicar el primer numero por 10 (con tantos ceros como digitos tenga el segundo numero)
        por eso elevo diez al exponente=longitud usando para ello la funcion de contar cifras del ejercicio 11.
        Luego sumo el segundo numero. Y ya quedaría concatenados ambos numeros.
        */
        int res= (int) ((n1*(Math.pow(10,Ej11.digitos(n2))))+n2);
        return res;
    }

    //__________________________________________________________________________________________________________________
}
