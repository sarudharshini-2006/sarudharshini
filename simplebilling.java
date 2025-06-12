import java.util.Scanner;

public class SimpleBillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Product details
        String product1 = "Apple";
        double price1 = 10.0;

        String product2 = "Milk";
        double price2 = 20.0;

        // Input quantities
        System.out.print("Enter quantity of " + product1 + ": ");
        int quantity1 = scanner.nextInt();

        System.out.print("Enter quantity of " + product2 + ": ");
        int quantity2 = scanner.nextInt();

        // Calculate total
        double total = (price1 * quantity1) + (price2 * quantity2);

        // Print bill
        System.out.println("\n---- Bill ----");
        System.out.println(product1 + " x " + quantity1 + " = Rs. " + (price1 * quantity1));
        System.out.println(product2 + " x " + quantity2 + " = Rs. " + (price2 * quantity2));
        System.out.println("Total Amount = Rs. " + total);

        System.out.println("Thank you for shopping!");

        scanner.close();
    }
}