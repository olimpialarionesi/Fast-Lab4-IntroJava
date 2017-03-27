/**
 * Created by Olimpia on 3/27/2017.
 */

        import java.util.Scanner;

public class TheLargestNumber {
    public static void main(String[] args) {

        Scanner MyConsole = new Scanner(System.in);

        int number;
        int CurrentMax = 0;

        do
        {
            System.out.print("Enter a number: ");
            number = MyConsole.nextInt();

            if (number > CurrentMax)
                CurrentMax = number;

        }
        while(number != 0);
        System.out.println("CurrentMax is: " + CurrentMax);
    }
}
