package Lab_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleMenu {
    public static void main(String[] args) {
        List<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(2);
        myArrayList.add(7);
        myArrayList.add(11);
        myArrayList.add(3);
        boolean isContinuing = true;
        while (isContinuing) {
            System.out.println("=========MENU========\n0. Exit!!!\n1. Add number into ArrayList\n2. Print number\n" +
                    "3. Get maximum number\n4. Get minimum number\n5. Search number");
            System.out.print("Please input option: ");
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();

            if (option == 0) {
                isContinuing = false;
            } else if (option == 1) {
                System.out.print("How many numbers do you want to add?   ");
                int inputAddedItem = scanner.nextInt();
                for (int i = 0; i < inputAddedItem; i++) {
                    System.out.printf("=>Please input number %d: ", i + 1);
                    int number = scanner.nextInt();
                    myArrayList.add(number);
                }
                System.out.println("===> New ArrayList: " + myArrayList);

            } else if (option == 2) {
                System.out.println("===> Print numbers: ");
                for (int i = 0; i < myArrayList.size(); i++) {
                    System.out.println(myArrayList.get(i));
                }
            } else if (option == 3) {
                System.out.print("===> Max number: ");
                int max = 0;
                for (int i = 0; i < myArrayList.size(); i++) {
                    if (max < myArrayList.get(i)) {
                        max = myArrayList.get(i);
                    }
                }
                System.out.println(max);
            } else if (option == 4) {
                System.out.print("===> Min number: ");
                int min = 0;
                for (int i = 0; i < myArrayList.size(); i++) {
                    if (min > myArrayList.get(i)) {
                        min = myArrayList.get(i);
                    }
                }
                System.out.println(min);
            } else if (option == 5) {
                System.out.print("Input the number to search: ");
                int numberSearch = scanner.nextInt();
                boolean isCheck = false;
                for (int i = 0; i < myArrayList.size(); i++) {
                    if (numberSearch == myArrayList.get(i)) {
                        System.out.println("===> Number to find at Index: " + i);
                        isCheck = true;
                    }
                }
                if (!isCheck) {
                    System.out.println("===>That number doesn't exist!!!");
                }
            }
        }
    }
}
