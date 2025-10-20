import java.util.Scanner;

public class FlooringOptionSelector {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a flooring option:");
        System.out.println("option 1: Scored concrete");
        System.out.println("option 2: Carpeting");
        System.out.println("option 3: Wood floors in living areas, capreting in bedrooms, tile in bath areas");
        System.out.print("Enter the option of your choice: ");
        int option = scanner.nextInt();
        String flooringType;

        switch (option) {
            case 1:
                flooringType = "Scored concrete - $3000";
                break;
            case 2:
                flooringType = "Carpeting - $5000";
                break;
            case 3:
                flooringType = "Wood floors in living areas, capreting in bedrooms, tile in bath areas - 10000";
                break;
            default:
                flooringType = "Unknown Flooring Type";
                break;
        }

        System.out.println("You selected: " + flooringType);
        scanner.close();
    }
}
