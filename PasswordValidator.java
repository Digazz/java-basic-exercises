import java.util.Scanner;

public class PasswordValidator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String password;
        String correctPassword = "java123";

        do {

            System.out.print("Enter the password: ");
            password = scanner.nextLine();

            if (!password.equals(correctPassword)) {
                System.out.println("Incorrect password.");
            }

        } while (!password.equals(correctPassword));

        System.out.println("The password is correct: " + password);

        scanner.close();
    }
}