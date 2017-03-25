/**
 * Created by Olimpia on 3/25/2017.
 */
public class Probmlema3 {
    public static void main(String[] args) {
        //sa se citeasca numerele naturale pana cand se introduce 0.
        //afisati suma obtinuta prin adunarea doar a numerelor mai mari decat 4 si mai mici decat 11.

    int ceva=0;
            int suma=0;
        do {

            ceva = SkeletonJava.readIntConsole("da numar");

            boolean conditie = (ceva > 4) && (ceva < 11);

            if (conditie) {
                suma = ceva + suma;
            }
        }


        while( ceva!=0);
    System.out.print(suma);




        }


    }

