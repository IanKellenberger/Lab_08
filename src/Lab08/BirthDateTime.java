package Lab08;

import java.util.Scanner;

public class BirthDateTime {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt for birth year using SafeInput.getRangedInt
        int birthYear = SafeInput.getRangedInt(in, "Enter your birth year (1950-2015)", 1950, 2015);

        // Prompt for birth month using SafeInput.getRangedInt
        int birthMonth = SafeInput.getRangedInt(in, "Enter your birth month (1-12)", 1, 12);

        // Determine the maximum number of days for the selected month
        int maxDays;
        switch (birthMonth) {
            case 2: // February
                maxDays = 29; // Assuming all years in the range are leap years
                break;
            case 4: case 6: case 9: case 11: // April, June, September, November
                maxDays = 30;
                break;
            default: // All other months
                maxDays = 31;
                break;
        }

        // Prompt for birth day using SafeInput.getRangedInt
        int birthDay = SafeInput.getRangedInt(in, "Enter your birth day (1-" + maxDays + ")", 1, maxDays);

        // Prompt for birth hour using SafeInput.getRangedInt
        int birthHour = SafeInput.getRangedInt(in, "Enter the hour of your birth (1-24)", 1, 24);

        // Prompt for birth minute using SafeInput.getRangedInt
        int birthMinute = SafeInput.getRangedInt(in, "Enter the minute of your birth (1-59)", 1, 59);

        // Display the entered values
        System.out.println("\nYour birth date and time:");
        System.out.println("Year: " + birthYear);
        System.out.println("Month: " + birthMonth);
        System.out.println("Day: " + birthDay);
        System.out.println("Hour: " + birthHour);
        System.out.println("Minute: " + birthMinute);
    }
}
