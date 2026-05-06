import java.util.Scanner;

public class KmToMiles {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the distance in kilometers:");
        double km = scanner.nextDouble();

        double miles = km * 0.621371;

        System.out.println("The distance in miles is " + String.format("%.2f", miles));

        scanner.close();
    }
}