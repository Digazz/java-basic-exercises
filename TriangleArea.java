import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base:");
        double base = scanner.nextDouble();

        System.out.println("Enter the height:");
        double height = scanner.nextDouble();

        double area = (base * height) / 2;

        System.out.println("The area of the triangle is " + area);

        scanner.close();
    }
}