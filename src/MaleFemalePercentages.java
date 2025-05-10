/******************************************************************
 * Male and Female Percentages                                    *
 * This program prompts the user to enter the number of males     *
 * and females registered in a class. It calculates the           *
 * percentage of each gender and displays the results.            *
 ******************************************************************/

import java.util.Scanner;

public class MaleFemalePercentages {

    /**************************************************************
     * Main Method                                                *
     * Prompts the user for the number of males and females,      *
     * calculates the percentages, and displays the breakdown.    *
     **************************************************************/
    public static void main(String[] args) {

        //*********************************************************
        // Variable Declarations                                  *
        // To store user input and calculated values              *
        //*********************************************************
        int numberOfMales;                       // User input for the number of males
        int numberOfFemales;                     // User input for the number of females
        int totalStudents;                       // Total number of students
        double malePercentage;                   // Calculated male percentage
        double femalePercentage;                 // Calculated female percentage

        //*********************************************************
        // Input Section                                          *
        // Prompting the user to enter the number of males        *
        // and females registered in the class                    *
        //*********************************************************
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter the number of males in the class: ");
        numberOfMales = keyboardInput.nextInt();

        System.out.print("Enter the number of females in the class: ");
        numberOfFemales = keyboardInput.nextInt();

        //*********************************************************
        // Calculation Section                                    *
        // Calculate the total students and the percentages       *
        //*********************************************************
        totalStudents = numberOfMales + numberOfFemales;

        if (totalStudents == 0) {
            System.out.println("Error: The class cannot have zero students.");
            System.exit(1);
        }

        malePercentage = (double) numberOfMales / totalStudents * 100;
        femalePercentage = (double) numberOfFemales / totalStudents * 100;

        //*********************************************************
        // Output Section                                         *
        // Display the breakdown of percentages                   *
        //*********************************************************
        System.out.println();
        System.out.printf("%-25s %d\n", "Total Students:", totalStudents);
        System.out.printf("%-25s %.2f%%\n", "Male Percentage:", malePercentage);
        System.out.printf("%-25s %.2f%%\n", "Female Percentage:", femalePercentage);

        //*********************************************************
        // Developer Credit                                       *
        //*********************************************************
        System.out.println();
        System.out.println("Developed by: Nikita Baiborodov");

        //*********************************************************
        // Resource Cleanup                                       *
        // Close the scanner to prevent resource leaks            *
        //*********************************************************
        keyboardInput.close();
        System.exit(0);
    }
}
