package phamvanngoctan_3432.Lec05_Loops;

import java.util.Scanner;

public class baitaprandom {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        double number;
        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            number = scanner.nextDouble();
            if (number == 0) {
                break;
            }
            sum = sum + number;
            count++;
        }
        if (count == 0) {
            System.out.println("No data entered.");
        } else {
            double average = sum / count;
            System.out.println("Sum = " + sum);
            System.out.println("Count = " + count);
            System.out.println("Average = " + average);
        }
    }
}
