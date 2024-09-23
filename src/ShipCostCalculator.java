import java.util.Scanner;

public class ShipCostCalculator {
    // calculateShippingCost(itemPrice)
    //if itemprice >=100 then
    //  return 0.0 // free shipping
    // else
    //  return itemPrice * 0.02 // 2% of the item price
    //end

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0.0;
        double shippingCost;

        System.out.print("Enter the price of the item: ");

        if (in.hasNextDouble()) {
            itemPrice = in.nextDouble();
            in.nextLine(); // Clear the buffer

            // Calculate the shipping cost
            shippingCost = calculateShippingCost(itemPrice);

            // Calculate the total price
            double totalPrice = itemPrice + shippingCost;

            // Output the shipping cost and total price
            System.out.printf("Shipping Cost: $%.2f%n", shippingCost);
            System.out.printf("Total Price: $%.2f%n", totalPrice);
        } else {

            System.out.println("You entered an invalid number.");
        }

        in.close(); // Close the scanner
    }

    private static double calculateShippingCost(double itemPrice) {
        return itemPrice >= 100 ? 0.0 : itemPrice * 0.02;
    }
}
