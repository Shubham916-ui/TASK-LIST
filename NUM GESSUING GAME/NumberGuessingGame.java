import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {4
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int rounds = 3;
        int totalScore = 0;

        for (int round = 1; round <= rounds; round++) {
            int numberToGuess = random.nextInt(100) + 1;
            int numberOfTries = 0;
            int maxAttempts = 10;
            boolean win = false;

            System.out.println("Round " + round + ": Guess a number between 1 and 100. You have " + maxAttempts + " attempts.");

            while (!win && numberOfTries < maxAttempts) {
                int guess = scanner.nextInt();
                numberOfTries++;

                if (guess == numberToGuess) {
                    win = true;
                    int points = maxAttempts - numberOfTries + 1;
                    totalScore += points;
                    System.out.println("Congratulations! You've guessed the number in " + numberOfTries + " tries. You earned " + points + " points.");
                } else if (guess < numberToGuess) {
                    System.out.println("The number is higher than your guess. Try again.");
                } else {
                    System.out.println("The number is lower than your guess. Try again.");
                }
            }

            if (!win) {
                System.out.println("Sorry, you've used all your attempts. The number was " + numberToGuess + ".");
            }
        }

        System.out.println("Game Over! Your total score is: " + totalScore);
        scanner.close();
    }
}

