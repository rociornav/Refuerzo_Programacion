package SemanaCuatro_25a31Mayo;

/**
 * @author rocio del real
 * 28/05/20
 */
/*
                        Ejercicio 17
                        Define la función convierteArrayEnString con la siguiente cabecera:
                        public static String convierteArrayEnString(int[] a)
                        Esta función toma como parámetro un array que contiene números y
                        devuelve una cadena de caracteres con esos números. Por ejemplo, si a
                        = { }, convierteArrayEnString(a) devuelve “”; si a = { 8 },
                        convierteArrayEnString(a) devuelve “8”; si a = { 6, 2, 5, 0, 1 },
                        convierteArrayEnString(a) devuelve “62501”.
 */
public class Ej17 {
    public static void main(String[] args) {
        //Defino e inicio diferentes posibilidades de array de acuerdo a los ejemplos del enunciado
        //1).Array con un espacio
        int[] array=new int[1];
        array[0]=8;
        //2). Sin elementos
        int[] arrayVacia=new int[0];
        //3). 5 elementos iniciados
        int[] arrayMuchos=new int[5];
        arrayMuchos[0]=6;
        arrayMuchos[1]=2;
        arrayMuchos[2]=5;
        arrayMuchos[3]=0;
        arrayMuchos[4]=1;
        //4). Y qué ocurriría si le paso un array de tamaño 5 sin rellenar: sale 00000
        int[] arraySin=new int[5];

        System.out.println("***Solución***");
        System.out.println("Para Array con 1 elemento:  '"+convierteArrayEnString(array)+"'");
        System.out.println("Para Array sin espacio:     '"+convierteArrayEnString(arrayVacia)+"'");
        System.out.println("Para Array con 5 elementos: '"+convierteArrayEnString(arrayMuchos)+"'");
        //Me muestra 5 ceros, ¿debe ser asi??? Al parecer sí, un array vacía es aquella con tamaño=0 (0 elementos)
        System.out.println("Para Array con espacio para 5 sin relleno: '"+convierteArrayEnString(arraySin)+"'");
    }

    public static String convierteArrayEnString(int[] a){
        String res="";

        //Idea: recorrer array e insertar cada elemento encontrado en la variable de tipo String res
        if(a.length!=0){ //si mi array tiene elementos
            for (int i = 0; i < a.length; i++) {
               res=res+a[i];//acumulamos el elemento en la variable tipo String.
            }
        }
        return res;
    }
}
