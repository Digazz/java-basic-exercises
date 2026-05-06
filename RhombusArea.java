import java.util.Scanner;

public class RhombusArea {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first diagonal:");
        double diagonalOne = scanner.nextDouble();

        System.out.println("Enter the second diagonal:");
        double diagonalTwo = scanner.nextDouble();

        double area = (diagonalOne * diagonalTwo) / 2;

        System.out.println("The area of the rhombus is " + area);

        scanner.close();
    }
}