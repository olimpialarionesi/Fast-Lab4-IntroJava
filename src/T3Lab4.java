/**
 * Created by Olimpia on 3/31/2017.
 */
public class T3Lab4 {
    public static void main(String[] args) {

// 6. Sa se calculeze factorialul unui numar a.
        // factorialul este definit asa:
        //  factorial  = 1*2*3*4….*a
        //  de ex pentru a = 4, factorialul este 1*2*3*4

        long number = SkeletonJava.readIntConsole("Introduceti un numar :");

        long factorial = 1;

        for (long i = 1; i <= number; i++)
            factorial = i * factorial;
        SkeletonJava.printConsole(factorial);




    }
}