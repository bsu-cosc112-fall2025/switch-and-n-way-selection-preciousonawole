import java.util.Scanner;

public class TravelEligibility {
    public static void main(String[] args) {
        
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            System.out.print("Do you have a valid passport? (true/false): ");
            boolean hasPassport = scanner.nextBoolean();

            if (age >= 18 && hasPassport) {
                System.out.println("Eligible for international travel.");
            } else if (age >= 18 && !hasPassport) {
                System.out.println("Get passport.");
            } else if (age < 18 && hasPassport) {
                System.out.println("Eligible to travel with guradian.");
            } else {
                System.out.println("Not eligible for travel.");
            }
        }
    }
