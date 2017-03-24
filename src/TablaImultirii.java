/**
 * Created by Olimpia on 3/24/2017.
 */
public class TablaImultirii {
    public static void main(String[] args) {

        int numar;
        numar = SkeletonJava.readIntConsole(" Introduceti un numar ");


       for(int i=0; i<=10; i++)
           SkeletonJava.printConsole(numar + "*" +  i + "=" +  numar*i);

    }
}
