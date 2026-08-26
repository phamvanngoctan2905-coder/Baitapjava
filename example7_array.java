package phamvanngoctan_3432.Lec06_Arrays;

import java.util.Scanner;

public class example7_array {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + ": ");
            array[i] = input.nextInt();
        }

        System.out.print("Array: [");

        for (int i = 0; i < n; i++) {
            System.out.print(array[i]);

            if (i < n - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }
}
