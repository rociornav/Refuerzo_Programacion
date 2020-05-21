package SemanaTres_18a24Mayo;

import java.util.Scanner;
/**
 * Clase 14. String convierteEnMorse(int n)
 * @author Rocío del Real
 */

/*
                Enunciado:  20/05/20

                Crea una función con la siguiente cabecera:
                public String convierteEnMorse(int n)
                Esta función convierte el número n al sistema Morse y lo devuelve en una
                cadena de caracteres. Por ejemplo, el 213 es el . . _ _ _ . _ _ _ _ . . . _ _ en
                Morse. Utiliza esta función en un programa para comprobar que funciona bien.
                Desde la función no se debe mostrar nada por pantalla, solo se debe usar print
                desde el programa principal.
                1 . _ _ _ _ 6 _ . . . .
                2 . . _ _ _ 7 _ _ . . .
                3 . . . _ _ 8 _ _ _ . .
                4 . . . . _ 9 _ _ _ _ .
                5 . . . . . 0 _ _ _ _ _
 */

public class Ej14 {
    public static void main(String[] args) {
        Scanner ro=new Scanner(System.in);
        //Entrada de datos:
        System.out.println("Dame un numero y te lo paso a morse: ");
        int n=ro.nextInt();
        //Probando funcionalidad del método.
        System.out.println("Solución A --> "+ convierteEnMorse(n));
        System.out.println("Solución B --> "+ convierteEnMorseB(n));

    }

    /**
     * convierteEnMorse: convierte el número n al sistema Morse y lo devuelve en una cadena de caracteres.
     * @param n positivo al que hay que convertir en morse
     * @return cadena de caracteres con el código morse correspondiente.
     */
    //Reutilizando función voltea del Ej 11.
    public static String convierteEnMorse(int n){
        //Idea --> Cojo el ultimo digito de n y busco la coincidencia y la adjunto en una variable tipo String
        String res="";
        //le doy la vuelta al numero reusando la funcion voltea(n)
        int aux= (int) Ej11.voltea(n), ultimoDigito=0;
        while(aux>0){
            ultimoDigito=ultimoDigito+aux%10;
            switch (ultimoDigito){
                case 0:
                    res=res+"_ _ _ _ _";
                    break;
                case 1:
                    res=res+". _ _ _ _";
                    break;
                case 2:
                    res=res+". . _ _ _";
                    break;
                case 3:
                    res=res+". . . _ _";
                    break;
                case 4:
                    res=res+". . . . _";
                    break;
                case 5:
                    res=res+". . . . .";
                    break;
                case 6:
                    res=res+"_ . . . .";
                    break;
                case 7:
                    res=res+"_ _ . . .";
                    break;
                case 8:
                    res=res+"_ _ _ . .";
                    break;
                case 9:
                    res=res+"_ _ _ _ .";
                    break;
                default:
            }
            ultimoDigito=0; //actualizo el valor que sino...se acumulan.
            aux/=10; //elimino la ultima cifra
        }
        return res;
    }

    //Sin función voltea.
    public static String convierteEnMorseB(int n){
        //Idea --> Cojo el ultimo digito de n y busco la coincidencia y la adjunto en una variable tipo String
        String res="";
        //creo el aux
        int aux= n, ultimoDigito=0;
        while(aux>0){
            ultimoDigito=ultimoDigito+aux%10;//cojo el ultimo digito y busco la coincidencia
            switch (ultimoDigito){
                case 0:
                    res="_ _ _ _ _"+res; //le concateno el valor delante de la cadena que ya tenia almacenada
                    break;
                case 1:
                    res=". _ _ _ _"+res;
                    break;
                case 2:
                    res=". . _ _ _"+res;
                    break;
                case 3:
                    res=". . . _ _"+res;
                    break;
                case 4:
                    res=". . . . _"+res;
                    break;
                case 5:
                    res=". . . . ."+res;
                    break;
                case 6:
                    res="_ . . . ."+res;
                    break;
                case 7:
                    res="_ _ . . ."+res;
                    break;
                case 8:
                    res="_ _ _ . ."+res;
                    break;
                case 9:
                    res="_ _ _ _ ."+res;
                    break;
                default:
            }
            ultimoDigito=0; //actualizo el valor que sino...se acumulan.
            aux/=10; //elimino la ultima cifra
        }
        return res;
    }


}
