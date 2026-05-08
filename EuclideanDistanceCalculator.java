import java.util.Scanner;

public class EuclideanDistanceCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two coordinate pairs (x, y) to calculate the Euclidean distance:");

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double deltaX = x2 - x1;
        double deltaY = y2 - y1;

        double distance = Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));

        System.out.println("The distance between the points is: " + String.format("%.2f", distance));

        scanner.close();
    }
}