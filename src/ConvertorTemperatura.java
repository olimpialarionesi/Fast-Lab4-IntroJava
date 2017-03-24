/**
 * Created by Olimpia on 3/24/2017.
 */
public class ConvertorTemperatura {
    public static void main(String[] args) {

        double F;
        F = SkeletonJava.readDoubleConsole("Introduceti temperatura in F");

        double C;
        C = 5.0/9.0*(F-32);

        SkeletonJava.printConsole( F + " °F = " + C + " °C ");
    }
}
