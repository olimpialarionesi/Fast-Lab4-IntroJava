/**
 * Created by Olimpia on 3/22/2017.
 */
public class MaiMicDin3 {
    public static void main(String[] args) {

        int numarx;
        numarx = SkeletonJava.readIntConsole( "introduceti un numar");

        int numary;
        numary = SkeletonJava.readIntConsole("introduceti un numar");

        int numarz;
        numarz = SkeletonJava.readIntConsole("introduceti un numar");

        if (numarx < numary)

            if (numarx < numarz)
                SkeletonJava.printConsole(numarx + " Este cel mai mic. ");
            else
        {
            SkeletonJava.printConsole(numarz + " Este cel mai mic ");

        }
        else
            if ( numary < numarz )
                SkeletonJava.printConsole(numary + "Este cel mai mic");
            else
                SkeletonJava.printConsole( numarz + "Este cel mai mic");
    }
}
