package phamvanngoctan_3432.Lec04_ConditionExecution;

import java.util.Scanner;

public class kiemtrachanhayle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so nguyen n:  ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " la so chan.");
        } else {
            System.out.println(n + " la so le.");
        }
    }
}
