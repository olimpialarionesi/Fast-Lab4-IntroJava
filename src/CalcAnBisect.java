/**
 * Created by Olimpia on 3/24/2017.
 */
public class CalcAnBisect {
    public static void main(String[] args) {

        int an;
        an = SkeletonJava.readIntConsole("Introduceti un an");

        if ( an %4 !=0 )
        SkeletonJava.printConsole(" Anul " + an + " este obisnuit");

        else
            if ( an % 100 != 0)
                SkeletonJava.printConsole(" Anul " + an + " este bisect ");
            else
                if(an % 400 != 0)
                    SkeletonJava.printConsole(" Anul " + an + " este obisnuit ");
                else
                    SkeletonJava.printConsole(" Anul " + an + " este bisect ");





    }
}
