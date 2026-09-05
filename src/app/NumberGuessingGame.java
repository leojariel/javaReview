package app;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void guessingNumberGame() {
        Scanner sc = new Scanner(System.in);

        int number = 1 + (int)(100 * Math.random());
        int attempts = 0;
        int limit = 5;
        boolean isGuessed = false;

        System.out.println("\n====== Number Guessing Game ======");
        System.out.println("Guess the number between 1 and 100.");

        while (!isGuessed) {

            for (var i = 0; i < limit; i++) {
                System.out.print("Enter a guess: ");

                if (sc.hasNextInt()) {
                    int guess = sc.nextInt();
                    attempts++;
                    if (guess == number) {
                        System.out.println("Congratulations! You guessed the number: " + number);
                        isGuessed = true;
                        break;
                    } else if (guess < number) {
                        System.out.println("The number is greater than " + guess);
                    } else {
                        System.out.println("The number is less than " + guess);
                    }
                } else {
                    System.out.println("Your input must be an integer.");
                    sc.next();
                    i--;
                }
            }

            if (!isGuessed) {
                System.out.println("Your attempts: " + attempts + " have reach the limit: " + limit);
                System.out.print("\nYou want to play again? (Yes/No): ");
                String playAgain = sc.next();
                String response = playAgain.toLowerCase();

                if (!response.equalsIgnoreCase("yes")) {
                    System.out.println("Game Over! The correct number is: " + number);
                    break;
                }
            }

        }
    }

    public static void main(String[] args) {
        guessingNumberGame();
    }
}
