package SemanaTres_18a24Mayo;
//RRN 19/05/20

import java.util.Scanner;

/**
 * @author Rocío del Real
 * Esta clase prueba la funcionalidad de la librería de los Ej 11 y 12, incluye validaciones para cada método.
 */

public class Main_Ej11Y12 {
    public static void main(String[] args) {
        Scanner ro=new Scanner(System.in);
        //Definir variables:
        long nLong;
        int nInt;
                                         /****EJERCICIO 11****/

        //____________________________________________________________________________________

        //Metodo 1.
        do{
        System.out.println("***Probando metodo esCapicua***\n Dame un numero entero positivo: ");
        nLong=ro.nextLong();
            if(nLong<=0){
                System.out.println("Error, introduce un número entero positivo.");
            }
        }while(nLong<=0); //le hago la validacion
        if(Ej11.esCapicua(nLong)){
            System.out.println("El numero "+nLong+" SI es capicua.");
        }else{
            System.out.println("El numero "+nLong+" NO es capicua.");
        }

        //____________________________________________________________________________________

        //Metodo 2.
        do{
        System.out.println("***Probando esPrimo***\n Dame un numero entero positivo: ");
        nInt=ro.nextInt();
            if(nInt<=0){
                System.out.println("Error, introduce un número entero positivo.");
            }
        }while(nInt<=0); //le hago la validacion

        if(Ej11.esPrimo(nInt)){
            System.out.println("El numero "+nInt+" SI es primo.");
        }else{
            System.out.println("El numero "+nInt+" NO es primo.");
        }

        //____________________________________________________________________________________

        //Metodo 3.
        do{
            System.out.println("***Probando siguientePrimo***\n Dame un numero positivo: ");
            nInt=ro.nextInt();
            if(nInt<=0){
                System.out.println("Error, introduce un número entero positivo.");
            }
        }while(nInt<=0); //le hago la validacion
        System.out.println("El siguiente primo de su numero '"+nInt+"' es "+
                Ej11.siguientePrimo(nInt));

        //____________________________________________________________________________________

        //Metodo 4.

        System.out.println("***Probando metodo 'potencia'***\n Dame la base: ");
        int bas=ro.nextInt();
        System.out.println("Dame el exponente: ");
        int exp=ro.nextInt();

        System.out.println("Su potencia es-->"+ Ej11.potencia(bas,exp));


        //____________________________________________________________________________________

        //Metodo 5.

        System.out.println("***Probando metodo 'digitos'***\n Dame un numero long y te diré cuantas " +
                "cifras tiene: ");
        nLong=ro.nextLong();

        System.out.println("Su numero tiene "+ Ej11.digitos(nLong)+" cifras.");

        //____________________________________________________________________________________

        //Metodo 6.
        do{
            System.out.println("***Probando metodo voltea***\n Dame un numero entero positivo: ");
            nLong=ro.nextLong();
            if(nLong<=0){
                System.out.println("Error, dame un numero positivo...");//Validacion...
            }
        }while(nLong<=0);

        System.out.println(Ej11.voltea(nLong));

        //____________________________________________________________________________________

        //Metodo 7.
        do{
            System.out.println("***Probando metodo digitoN***\nDame un numero positivo:");
            nInt=ro.nextInt();
            if(nInt<=0){
                System.out.println("Error, dame un numero positivo...");
            }
        }while(nInt<=0);//Validacion...

        int posicion;
        do{
            System.out.println("Dame la posicion y te muestro el elemento (de 0 a "+(Ej11.digitos(nInt)-1)+" ): ");
            posicion=ro.nextInt();
            if(posicion<0 || posicion>(Ej11.digitos(nInt)-1)){
                System.out.println("Error, introduce una posicion (de 0 a "+(Ej11.digitos(nInt)-1)+" ):");
            }
        }while(posicion<0 || posicion>(Ej11.digitos(nInt)-1)); //le hago la validacion


        System.out.println("Elemento en la posicion '"+posicion+"' --> "+ Ej11.digitoN(posicion,nInt));

        //____________________________________________________________________________________

                                      /****EJERCICIO 12****/
        //Metodo 8.
        do{
            System.out.println("***Probando posicionDeDigito***\n Dame un numero entero: ");
            nLong= ro.nextLong();
            if(nLong<=0){
                System.out.println("Error, dame un numero positivo...");
            }
        }while (nLong<=0); //le hago la validacion


        System.out.println("Dame el dígito que desea encontrar y le paso su posición de '0 a "+(Ej11.digitos(nLong)-1)+
                    "' :");
        posicion=ro.nextInt();


        if(Ej12.posicionDeDigito(nLong,posicion)==-1){//validacion
            System.out.println("No existe el dígito "+posicion+" en su número "+nLong+". ");
        }else{
            System.out.println("La posición del dígito "+posicion+" es --> "+Ej12.posicionDeDigito(nLong,posicion));
        }

        //____________________________________________________________________________________

        //Metodo 9.


        do{
            System.out.println("***Probando quitaPorDetras***\n Dame un numero entero positivo: ");
            nLong=ro.nextLong();
            if(nLong<=0){
                System.out.println("Error, introduce un número entero positivo.");
            }
        }while(nLong<=0); //le hago la validacion

        int digitosDetras;
        do{
            System.out.println("¿Cuántos dígitos por detrás del número '"+nLong+"' quiere eliminar?: ");
            digitosDetras=ro.nextInt();
            if(digitosDetras<=0){
                System.out.println("Error, introduce un número entero positivo.");
            }
        }while(digitosDetras<=0); //le hago la validacion


        System.out.println("Solución: "+Ej12.quitaPorDetras(nLong,digitosDetras));

        //____________________________________________________________________________________

        //Metodo 10.

        do{
            System.out.println("***Probando quitaPorDelante***\n Dame un numero entero positivo: ");
            nLong=ro.nextLong();
            if(nLong<=0){
                System.out.println("Error, introduce un número entero positivo.");
            }
        }while(nLong<=0); //le hago la validacion

        int digitosDelante;
        do{
            System.out.println("¿Cuántos dígitos por delante del número '"+nLong+"' quiere eliminar?: ");
            digitosDelante=ro.nextInt();
            if(digitosDelante<=0){
                System.out.println("Error, introduce un número entero positivo.");
            }
        }while(digitosDelante<=0); //le hago la validacion

        System.out.println("Solución: "+Ej12.quitaPorDelante(nLong,digitosDelante));

        //____________________________________________________________________________________

        //Metodo 11.
        do{
            System.out.println("***Probando pegaPorDetras***\n Dame un numero entero positivo: ");
            nInt=ro.nextInt();
            if(nInt<=0){
                System.out.println("Error, introduce un número entero positivo.");
            }
        }while(nInt<=0); //le hago la validacion

        int digito;
        do{
            System.out.println("Dame un digito y lo concateno al final del numero '"+nInt+"' :");
            digito=ro.nextInt();
            if(digito<0){
                System.out.println("Error, introduce un número entero positivo o igual que cero.");
            }
        }while(digito<0); //le hago la validacion, ojo, quiero que me introduzca el 0


        System.out.println("Solución --> "+Ej12.pegaPorDetras(digito,nInt));

        //____________________________________________________________________________________

        //Metodo 12.

        do{
            System.out.println("***Probando pegaPorDelante***\n Dame un numero entero positivo: ");
            nInt=ro.nextInt();
            if(nInt<=0){
                System.out.println("Error, introduce un número entero positivo.");
            }
        }while(nInt<=0); //le hago la validacion

        do{
            System.out.println("Dame un digito y lo concateno por delante del numero '"+nInt+"' :");
            digito=ro.nextInt();
            if(digito<0){
                System.out.println("Error, introduce un número entero positivo o igual que cero.");
            }
        }while(digito<0); //le hago la validacion, el digito a concatenar puede ser cero


        /*si el digito a insertar por delante es 0 agrego esta condicion.
        Ya que cualquier int elimina el cero al ser la primera cifra*/

        if(digito==0){
            System.out.println("Solución --> 0"+Ej12.pegaPorDelante(digito,nInt));
        }else{ //si es un digito del 1 al 9
            System.out.println("Solución --> "+Ej12.pegaPorDelante(digito,nInt));
        }

        //____________________________________________________________________________________

        //Metodo 13.
        do{
            System.out.println("***Probando trozoDeNumero***\n Dame un numero entero positivo:");
            nInt=ro.nextInt();
            if(nInt<=0){
                System.out.println("Error, dame un numero positivo.");
            }
        }while(nInt<=0); //valido que sea positivo

        int posI;
        do{
            System.out.println("Dame la posicion inicial de '0 a "+(Ej11.digitos(nInt)-1)+"' por donde quiere 'cortar' " +
                    "el numero:");
            posI=ro.nextInt();
            if(posI<0||posI>(Ej11.digitos(nInt)-1)){
                System.out.println("Error, dame un numero en el rango indicado '0 a " +(Ej11.digitos(nInt)-1)+"'");
            }
        }while(posI<0||posI>(Ej11.digitos(nInt)-1));//valido..

        int posF;
        do{
            System.out.println("Dame la posicion final por donde quiere 'cortar' el numero de '"+posI+" a "+
                    (Ej11.digitos(nInt)-1)+"' :");
            posF=ro.nextInt();
            if(posF<posI||posF>(Ej11.digitos(nInt)-1)){
                System.out.println("Error, dame un numero en el rango indicado '" +posI+" a "+
                (Ej11.digitos(nInt)-1)+"' :");
            }
        }while(posF<posI||posF>(Ej11.digitos(nInt)-1));//valido...


        System.out.println("Solución A (dividiendo entre 10) --> "+Ej12.trozoDeNumero(nInt,posI,posF));
        System.out.println("Solución B 'Usando SubString'    --> "+Ej12.trozoDeNumeroB(nInt,posI,posF));
        System.out.println("Solución C 'Usando for'          --> "+Ej12.trozoDeNumeroC(nInt,posI,posF));

        //____________________________________________________________________________________

        //Metodo 14.
        int numUno;

        do{
            System.out.println("***Probando juntaNumeros***\n Dame un numero entero:");
            numUno=ro.nextInt();
            if(numUno<0){
                System.out.println("Error, dame un numero positivo... :");
            }
        }while(numUno<0);//validando...

        int numDos;
        do{
            System.out.println("Dame otro numero entero:");
            numDos=ro.nextInt();
            if(numDos<0){
                System.out.println("Error, dame un numero positivo... :");
            }
        }while (numDos<0);//validando...

        System.out.println("Solución --> "+Ej12.juntaNumeros(numUno,numDos));

        //____________________________________________________________________________________

    }
}
