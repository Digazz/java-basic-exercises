import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;

        do {

            System.out.print("Enter a positive integer: ");
            number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Invalid number.");
            }

        } while (number < 0);

        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println(number + "! = " + factorial);

        scanner.close();
    }
}