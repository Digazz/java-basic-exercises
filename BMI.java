import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your height:");
        double height = scanner.nextDouble();

        System.out.println("Enter your weight:");
        double weight = scanner.nextDouble();

        double bmi = weight / Math.pow(height, 2);

        System.out.println("Your BMI is " + String.format("%.2f", bmi));

        scanner.close();
    }
}