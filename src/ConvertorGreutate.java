/**
 * Created by Olimpia on 3/24/2017.
 */
public class ConvertorGreutate {
    public static void main(String[] args) {
        double lbs;
        lbs = SkeletonJava.readDoubleConsole("inroduceti greutatea in lbs");

        double kg;
        kg = lbs*0.45359237;

        SkeletonJava.printConsole(lbs + " lbs = " +  kg + " kg ");

    }
}
