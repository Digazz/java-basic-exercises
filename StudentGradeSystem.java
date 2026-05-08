import java.util.Scanner;

public class StudentGradeSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {

            System.out.println("===== MENU =====");
            System.out.println("1. Register student");
            System.out.println("2. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {

                case 1:

                    System.out.print("Enter the student's name: ");
                    String name = scanner.nextLine();

                    double[] grades = new double[3];
                    double sum = 0;

                    for (int i = 0; i < 3; i++) {

                        System.out.printf("Enter grade %d (0 to 10): ", i + 1);

                        grades[i] = scanner.nextDouble();

                        while (grades[i] < 0 || grades[i] > 10) {

                            System.out.println("Invalid grade! Enter a value between 0 and 10.");

                            System.out.printf("Enter grade %d again: ", i + 1);

                            grades[i] = scanner.nextDouble();
                        }

                        sum += grades[i];
                    }

                    double average = sum / 3;

                    System.out.printf("Average grade of %s: %.2f\n", name, average);

                    if (average < 4) {

                        System.out.println("Status: Failed");

                    } else if (average < 7) {

                        System.out.println("Status: Recovery");

                    } else {

                        System.out.println("Status: Approved");
                    }

                    System.out.print("Do you want to register another student? (y/n): ");

                    String answer = scanner.next();

                    if (!answer.equalsIgnoreCase("y")) {
                        running = false;
                    }

                    break;

                case 2:

                    running = false;
                    break;

                default:

                    System.out.println("Invalid option. Try again.");
                    break;
            }
        }

        System.out.println("Program closed.");

        scanner.close();
    }
}