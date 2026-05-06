import java.util.Scanner;

public class Division {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers:");

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if (y != 0) {
            double result = x / y;
            System.out.println("The quotient is " + result);
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        scanner.close();
    }
}