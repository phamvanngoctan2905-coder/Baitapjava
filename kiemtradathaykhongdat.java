package phamvanngoctan_3432.Lec04_ConditionExecution;

import java.util.Scanner;

public class kiemtradathaykhongdat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap diem tong ket: ");
        double score = scanner.nextDouble();
        if (score >= 5.0) {
            System.out.println("dat");
        } else {
            System.out.println("khong dat");
        }
    }
}
