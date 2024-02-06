/*
// AUTHOR: Fahed Alkhiami
// FILENAME: Rock paper scissors game
// SPECIFICATION: DESCRIPTION OF THIS PROGRAM
// FOR: CS 1400 - ASSIGNMENT #2
// TIME SPENT: It took me about 25 minutes
//*/


import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt player 1 to enter their choice
        System.out.println("Player 1: Choose rock, scissors, or paper: ");
        String player1Choice = scanner.nextLine().toLowerCase();

        // Prompt player 2 to enter their choice
        System.out.println("Player 2: Choose rock, scissors, or paper: ");
        String player2Choice = scanner.nextLine().toLowerCase();

        // Check if the choices are valid
        if (isValidChoice(player1Choice) && isValidChoice(player2Choice)) {
            // Determine the winner
            String result = determineWinner(player1Choice, player2Choice);
            System.out.println(result);
        } else {
            System.out.println("Wrong choice!");
        }

        // Close the scanner
        scanner.close();
    }

    // Function to check if the choice is valid (rock, scissors, or paper)
    public static boolean isValidChoice(String choice) {
        return choice.equals("rock") || choice.equals("scissors") || choice.equals("paper");
    }

    // Function to determine the winner
    public static String determineWinner(String player1Choice, String player2Choice) {
        if (player1Choice.equals(player2Choice)) {
            return "It is a tie.";
        } else if (
            (player1Choice.equals("rock") && player2Choice.equals("scissors")) ||
            (player1Choice.equals("scissors") && player2Choice.equals("paper")) ||
            (player1Choice.equals("paper") && player2Choice.equals("rock"))
        ) {
            return "Player 1 wins.";
        } else {
            return "Player 2 wins.";
        }
    }
}