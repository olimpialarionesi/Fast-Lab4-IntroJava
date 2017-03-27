/**
 * Created by Olimpia on 3/27/2017.
 */


        import java.util.Scanner;

public class MultiplicationTableIntervalTowNumbers {
    public static void main(String[] args) {
        Scanner MyConsole = new Scanner(System.in);

        int n1 = 0;
        int n2 = 0;
        int bf = 0;

        System.out.print("Enter first number: ");
        n1 = MyConsole.nextInt();
        System.out.print("Enter second number: ");
        n2 = MyConsole.nextInt();

        System.out.println();

        if (n2 < n1)
        {
            bf = n1;
            n1 = n2;
            n2 = bf;
        }

        for (int j = n1; j <= n2; j++)
        {
            for (int i = 1; i <= 10; i++)
            {
                System.out.println(i + " * " + j + " = " + i * j);
            }
            System.out.println();
        }

    }

}
