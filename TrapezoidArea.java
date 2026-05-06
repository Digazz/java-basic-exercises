import java.util.Scanner;

public class TrapezoidArea {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first base:");
        double baseOne = scanner.nextDouble();

        System.out.println("Enter the second base:");
        double baseTwo = scanner.nextDouble();

        System.out.println("Enter the height:");
        double height = scanner.nextDouble();

        double area = (baseOne + baseTwo) * height / 2;

        System.out.println("The area of the trapezoid is " + area);

        scanner.close();
    }
}