/*
// AUTHOR: Fahed Alkhiami
// FILENAME: Assignment 3
// SPECIFICATION: 
// FOR: CS 1400 - ASSIGNMENT #3
// TIME SPENT: HOW LONG IT TOOK YOU TO FINISH THIS ASSIGNMENT
 *it took me about 55 minutes to do.
 */
//*/



import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.println("Please enter a string: ");
        String firstString = scanner.nextLine();

        System.out.println("Please enter another string: ");
        String secondString = scanner.nextLine();

        char option;

        // Menu and Processing
        do {
            System.out.println("\nCommand Options");
            System.out.println("a: find if the lengths of the strings are equal");
            System.out.println("b: find if the two strings are the same");
            System.out.println("c: find which string is lexically larger");
            System.out.println("d: print the first character of each string");
            System.out.println("e: concatenate the two strings");
            System.out.println("f: print both strings in uppercase");
            System.out.println("q: quit this program");
            System.out.println("Please, enter an option from the menu: ");

            option = scanner.next().charAt(0);

            switch (option) {
                case 'a':
                    System.out.println("The lengths are " + (firstString.length() == secondString.length() ? "" : "not ") + "the same.");
                    break;
                case 'b':
                    System.out.println("The two strings are " + (firstString.equals(secondString) ? "" : "not ") + "the same.");
                    break;
                case 'c':
                    int comparisonResult = firstString.compareTo(secondString);
                    System.out.println("The " + (comparisonResult < 0 ? "second" : "first") + " string is lexically larger.");
                    break;
                case 'd':
                    System.out.println("The first character of the first string is " + firstString.charAt(0));
                    System.out.println("The first character of the second string is " + secondString.charAt(0));
                    break;
                case 'e':
                    String concatenatedString = firstString.concat(secondString);
                    System.out.println("The concatenation of two strings is \"" + concatenatedString + "\"");
                    break;
                case 'f':
                    System.out.println("The first string using upper case letters: " + firstString.toUpperCase());
                    System.out.println("The second string using upper case letters: " + secondString.toUpperCase());
                    break;
                case 'q':
                    System.out.println("\nGoodbye!");
                    break;
                default:
                    System.out.println("\nInvalid option");
                    break;
            }

        } while (option != 'q');

        scanner.close();
    }
}
//git test project
//git