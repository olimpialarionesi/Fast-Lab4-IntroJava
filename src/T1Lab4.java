/**
 * Created by Olimpia on 3/31/2017.
 */
public class T1Lab4 {
    public static void main(String[] args) {

        int[] a = {1, 3, 4, 6, 7, 8, 10, 12, 14, 23};
        int numar = SkeletonJava.readIntConsole("Introduceti un numar:");

        for (int i = 0; i < a.length; i++)
            if (a[i] == numar) {
                SkeletonJava.printConsole(i);
                break;
            } else {
                SkeletonJava.printConsole("-1");


            }
    }
}