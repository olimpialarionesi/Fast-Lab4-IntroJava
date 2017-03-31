/**
 * Created by Olimpia on 3/31/2017.
 */

//Se se calculeze suma primelor n numere naturale, unde n este declarat ca si
// n = 20;
// sau o alta valoare



public class T2Lab4 {
    public static void main(String[] args) {


        int n = SkeletonJava.readIntConsole("Introduceti un numar:");
        int sum = 0;

        for (int i = 1; i <= n; i++)
            sum = sum + i;
        SkeletonJava.printConsole(sum);



    }
}
