import java.util.Scanner;

public class PythagoreanTheoremCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the values of the legs to calculate the hypotenuse:");

        double legA = scanner.nextDouble();
        double legB = scanner.nextDouble();

        double sum = Math.pow(legA, 2) + Math.pow(legB, 2);

        double hypotenuse = Math.sqrt(sum);

        System.out.println("The value of the hypotenuse is: " + String.format("%.2f", hypotenuse));

        scanner.close();
    }
}