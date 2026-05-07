import java.util.Scanner;

public class ConvertTemperature {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int selection;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("Select one of the options below");
            System.out.println("1 - Convert to Celsius");
            System.out.println("2 - Convert to Fahrenheit");
            System.out.println("0 - Exit");

            selection = scanner.nextInt();

            switch (selection) {

                case 1:
                    System.out.print("Enter the temperature in Fahrenheit: ");
                    double fahrenheit = scanner.nextDouble();
                    double fahrenheitToCelsius = (fahrenheit - 32) * 5 / 9;
                    System.out.println("Result: " + String.format("%.2f", fahrenheitToCelsius) + "°C");
                    break;

                case 2:
                    System.out.print("Enter the temperature in Celsius: ");
                    double celsius = scanner.nextDouble();
                    double celsiusToFahrenheit = (1.8 * celsius) + 32;
                    System.out.println("Result: " + String.format("%.2f", celsiusToFahrenheit) + "°F");
                    break;

                case 0:
                    System.out.println("Closing...");
                    break;

                default:
                    System.out.println("Invalid option!");
            }

        } while (selection != 0);

        scanner.close();
    }
}