package Lab08;

import java.util.Scanner;

public class CheckOut {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double totalCost = 0.0;
        boolean moreItems;

        // Loop to input prices
        do {
            // Prompt for item price using SafeInput.getRangedDouble
            double itemPrice = SafeInput.getRangedDouble(in, "Enter the price of your item ($0.50 to $10.00)", 0.50, 10.00);

            // Add item price to total cost
            totalCost += itemPrice;

            // Prompt to confirm if there are more items using SafeInput.getYNConfirm
            moreItems = SafeInput.getYNConfirm(in, "Do you have more items to add? (Y/N)");
        } while (moreItems);

        // Display the total cost to two decimal places
        System.out.printf("\nTotal cost of items: $%.2f\n", totalCost);
    }
}
