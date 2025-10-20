import java.util.Scanner;
public class TvModelSelector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a TV model:");
        System.out.println("1. Model 100");
        System.out.println("2. Model 200");
        System.out.println("3. Model 300");
        System.out.print("Enter the number of your choice: ");

        int choice = scanner.nextInt();
        String model;

        switch (choice) {
            case 1:
                model = "Remote control, timer, stereo sound - $1000";
                break;
            case 2:
                model = "Adds picture-in-picture - $1200";
                break;
            case 3:
                model = "Adds HDTV, flat screen, 16x9 aspect ratio - $2400";
                break;
            default:
                model = "Unknown Model";
                break;
        }

        System.out.println("You selected: " + model);
        scanner.close();
    }
}