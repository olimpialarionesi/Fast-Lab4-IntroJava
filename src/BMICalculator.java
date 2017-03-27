/**
 * Created by Olimpia on 3/27/2017.
 */

        import java.util.Scanner;


public class BMICalculator {
    public static void main(String[] args) {

        Scanner MyConsole = new Scanner(System.in);

        double height = 0.0;
        double weight = 0.0;
        double BMI = 0.0;
        String gender;

        System.out.print("Enter your height in meters: ");
        height = MyConsole.nextFloat();

        System.out.print("Enter your weight in kilograms: ");
        weight = MyConsole.nextFloat();

        System.out.print("Enter your gender (M/F): ");
        gender = MyConsole.next();

        System.out.println();

        BMI = weight /(height * height);
        System.out.printf("Your BMI is " + BMI);
        System.out.println();
        System.out.println();

        System.out.println("BMI Values:");
        System.out.println("Underweight: Under 18.5");
        System.out.println("Normal: 18.5 - 24.9");
        System.out.println("Overweight: 25 - 29.9");
        System.out.println("Obese: 30 or greater");

    }
}
