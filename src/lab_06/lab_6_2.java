package lab_06;

import java.util.Scanner;

public class lab_6_2 {
    public static void main(String[] args) {
//        String myPassword = "password123";
//        Allow user to input maximum 3 times
        String myPassword = "password123";
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Pls input Password: ");
            String PW = scanner.nextLine();
            if (PW.equals(myPassword)) {
                break;
            } else {
                System.out.println("===>Incorrect Password!!!");
            }
        }

    }
}
