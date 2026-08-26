package phamvanngoctan_3432.Lec06_Arrays;

import java.util.Scanner;

public class example8_array {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + ": ");
            array[i] = input.nextInt();
        }

        // Method 1
        System.out.println("Method 1:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        // Method 2
        System.out.println("Method 2:");

        int[] reverseArray = new int[n];

        for (int i = 0; i < n; i++) {
            reverseArray[i] = array[n - 1 - i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(reverseArray[i] + " ");
        }

        System.out.println();

        // Method 3
        System.out.println("Method 3:");

        int[] copy = array.clone();

        int left = 0;
        int right = n - 1;

        while (left < right) {

            int temp = copy[left];
            copy[left] = copy[right];
            copy[right] = temp;

            left++;
            right--;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(copy[i] + " ");
        }
    }
}
