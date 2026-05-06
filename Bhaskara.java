import java.util.Scanner;

public class Bhaskara {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of a:");
        double a = scanner.nextDouble();

        System.out.println("Enter the value of b:");
        double b = scanner.nextDouble();

        System.out.println("Enter the value of c:");
        double c = scanner.nextDouble();

        double delta = (b * b) - (4 * a * c);

        if (a == 0 || delta < 0) {

            System.out.println("Impossible to calculate");

        } else {

            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("R1 = " + String.format("%.5f", x1));
            System.out.println("R2 = " + String.format("%.5f", x2));
        }

        scanner.close();
    }
}