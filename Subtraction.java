import java.util.Scanner;

public class Subtraction {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers:");

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int result = x - y;

        System.out.println("The difference is " + result);

        scanner.close();
    }
}