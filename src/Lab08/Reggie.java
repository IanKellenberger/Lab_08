package Lab08;

import java.util.Scanner;

public class Reggie {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt for SSN using SafeInput.getRegExString
        String ssn = SafeInput.getRegExString(in, "Enter your Social Security Number (XXX-XX-XXXX)", "^\\d{3}-\\d{2}-\\d{4}$");

        // Prompt for UC Student M number using SafeInput.getRegExString
        String mNumber = SafeInput.getRegExString(in, "Enter your UC Student M Number (MXXXXX)", "^(M|m)\\d{5}$");

        // Prompt for menu choice using SafeInput.getRegExString
        String menuChoice = SafeInput.getRegExString(in, "Enter a menu choice (O, S, V, Q)", "^[OoSsVvQq]$");

        // Display the results
        System.out.println("\nSSN entered: " + ssn);
        System.out.println("UC Student M Number entered: " + mNumber);
        System.out.println("Menu choice entered: " + menuChoice);
    }
}

