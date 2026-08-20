package phamvanngoctan_3432.Lec04_ConditionExecution;

import java.util.Scanner;

public class kiemtrasonguyenduong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so nguyen n: ");
        int n = scanner.nextInt();

        if (n > 0) {
            System.out.println(n + " la so duong.");
        } else if (n < 0) {
            System.out.println(n + " la so am.");
        } else {
            System.out.println("n = 0.");
        }
    }
}
