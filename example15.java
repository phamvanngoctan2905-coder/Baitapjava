package phamvanngoctan_3432.Lec05_Loops;

import java.util.*;
import java.util.Scanner;

public class example15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int wrongAnswers = 0;
        int score = 0;

        while (wrongAnswers < 3) {
            int sum = 0;

            int numberOfTerms = random.nextInt(4) + 2;

            System.out.print("Calculate: ");

            for (int i = 1; i <= numberOfTerms; i++) {
                int number = random.nextInt(10) + 1;
                sum += number;

                System.out.print(number);

                if (i < numberOfTerms) {
                    System.out.print(" + ");
                }
            }

            System.out.print(" = ");
            int answer = scanner.nextInt();

            if (answer == sum) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
                wrongAnswers++;
                System.out.println("Correct answer: " + sum);
                System.out.println("Wrong answers: " + wrongAnswers);
            }
        }

        System.out.println("Game Over!");
        System.out.println("Final score: " + score);
    }
}