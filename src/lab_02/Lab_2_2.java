package lab_02;

import java.util.Scanner;

public class Lab_2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vui long nhap mot so: ");
        int Num = scanner.nextInt();
        if (Num % 2 == 0) {
            System.out.println("Do la so chan!");
        } else {
            System.out.println("Do la so le!");
        }
    }
}
