package Lab08;

import java.util.Scanner;

public class PrettyHeader {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt user for a message to display in a pretty header
        System.out.print("Enter a message for the header: ");
        String message = in.nextLine();

        // Generate a pretty header using SafeInput.prettyHeader
        SafeInput.prettyHeader(message);

        // Example additional content beneath the header
        System.out.println("Welcome to the program!");
    }
}
