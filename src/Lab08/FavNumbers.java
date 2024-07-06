package Lab08;

import java.util.Scanner;

public class FavNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt for favorite integer using SafeInput.getInt
        int favoriteInt = SafeInput.getInt(in, "Enter your favorite integer");

        // Prompt for favorite double using SafeInput.getDouble
        double favoriteDouble = SafeInput.getDouble(in, "Enter your favorite double");

        // Display the entered values
        System.out.println("\nYour favorite integer is: " + favoriteInt);
        System.out.println("Your favorite double is: " + favoriteDouble);
    }
}
