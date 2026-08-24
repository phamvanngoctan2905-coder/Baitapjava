package phamvanngoctan_3432.Lec05_Loops;

import java.util.Random;
import java.util.Scanner;

public class example14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(20) + 1;
        int guess;
        int numberOfGuesses = 0;

        System.out.println("=== RANDOM NUMBER GUESSING GAME ===");
        System.out.println("Guess a number from 1 to 20!");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            numberOfGuesses++;

            if (guess < secretNumber) {
                System.out.println("Guess higher!");
            } else if (guess > secretNumber) {
                System.out.println("Guess lower!");
            } else {
                System.out.println("Congratulations! You guessed correctly!");
            }

        } while (guess != secretNumber);

        System.out.println("The secret number is: " + secretNumber);
        System.out.println("You guessed " + numberOfGuesses + " times.");
    }
}