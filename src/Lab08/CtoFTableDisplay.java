package Lab08;

public class CtoFTableDisplay {

    public static void main(String[] args) {
        // Print a pretty header for the table
        prettyHeader("Celsius to Fahrenheit Conversion");

        // Print table headers
        System.out.printf("%-10s%-10s\n", "Celsius", "Fahrenheit");
        System.out.println("***************************");

        // Loop through Celsius values from -100 to 100 in steps of 1
        for (int celsius = -100; celsius <= 100; celsius++) {
            // Calculate Fahrenheit equivalent using the CtoF method
            double fahrenheit = CtoF(celsius);

            // Print each row of the table
            System.out.printf("%-10d%-10.2f\n", celsius, fahrenheit);
        }
    }

    public static double CtoF(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void prettyHeader(String msg) {
        int totalLength = 60;
        int msgLength = msg.length();

        // Calculate spaces on each side of the message to center it
        int spacesNeeded = totalLength - 4 - msgLength; // 4 stars and 1 space around the message

        // Print top row of stars
        for (int i = 0; i < totalLength; i++) {
            System.out.print("*");
        }
        System.out.println(); // Move to next line

        // Print centered message with stars and spaces
        System.out.print("***");
        for (int i = 0; i < spacesNeeded / 2; i++) {
            System.out.print(" ");
        }
        System.out.print(msg); // Print the message
        for (int i = 0; i < spacesNeeded / 2; i++) {
            System.out.print(" ");
        }
        // Adjust for odd number of spaces if necessary
        if (spacesNeeded % 2 != 0) {
            System.out.print(" ");
        }
        System.out.println("***");

        // Print bottom row of stars
        for (int i = 0; i < totalLength; i++) {
            System.out.print("*");
        }
        System.out.println(); // Move to next line
    }
}
