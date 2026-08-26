package phamvanngoctan_3432.Lec06_Arrays;

import java.util.Scanner;

public class example9_array {

    // Cach 1: Dung mang phu
    public static int[] reverse1(int[] a) {
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length - 1 - i];
        }

        return b;
    }

    // Cach 2: Doi cho 2 phan tu
    public static void reverse2(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
    }

    // Cach 3: Dung vong lap while
    public static void reverse3(int[] a) {
        int i = 0;
        int j = a.length - 1;

        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;

            i++;
            j--;
        }
    }

    // Hien thi mang
    public static void printArray(int[] a) {
        System.out.print("[");
        
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);

            if (i < a.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        // Nhap mang
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + ": ");
            a[i] = sc.nextInt();
        }

        // Cach 1
        int[] b = reverse1(a);
        System.out.print("Reverse 1: ");
        printArray(b);

        // Tao mang moi de thu cach 2
        int[] c = new int[n];

        for (int i = 0; i < n; i++) {
            c[i] = a[i];
        }

        reverse2(c);
        System.out.print("Reverse 2: ");
        printArray(c);

        // Tao mang moi de thu cach 3
        int[] d = new int[n];

        for (int i = 0; i < n; i++) {
            d[i] = a[i];
        }

        reverse3(d);
        System.out.print("Reverse 3: ");
        printArray(d);

        sc.close();
    }
}