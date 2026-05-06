import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers:");

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int result = x * y;

        System.out.println("The product of the numbers is " + result);

        scanner.close();
    }
}