import java.util.Scanner;

public class PersonData {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter your gender:");
        String gender = scanner.nextLine();

        System.out.println("Enter your weight:");
        double weight = scanner.nextDouble();

        System.out.println("\n--- Person Data ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Weight: " + weight + " kg");

        scanner.close();
    }
}