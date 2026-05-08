import java.util.Scanner;

public class TimeConverter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of seconds:");

        int totalSeconds = scanner.nextInt();
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds / 60) % 60;
        int seconds = totalSeconds % 60;

        String formattedHours = String.format("%02d", hours);
        String formattedMinutes = String.format("%02d", minutes);
        String formattedSeconds = String.format("%02d", seconds);

        System.out.println("The time in hours, minutes, and seconds is: "
                + formattedHours + " : "
                + formattedMinutes + " : "
                + formattedSeconds);

        scanner.close();
    }
}