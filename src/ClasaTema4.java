/**
 * Created by Olimpia on 3/25/2017.
 */
public class ClasaTema4 {
    public static void main(String[] args) {

        //sa se citeasca un string de la tastatura
        //sa se afiseze stringul in uppere case
        String s;
        s = SkeletonJava.readStringConsole("Introduceti stringul");

        String cale= "d:\\cale\\subcale.txt\\subcale\\fisierulmeu.txt";

        System.out.println(s.toUpperCase());

        int delacat=cale.lastIndexOf(".");
        String extensie = cale.substring(delacat);
        SkeletonJava.printConsole("extensie");
    }
}
