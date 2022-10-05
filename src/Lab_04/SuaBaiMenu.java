package Lab_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SuaBaiMenu {
    public static void main(String[] args) {
        List<Integer> myArrayList = new ArrayList<>();
        boolean isContinuing = true;
        while (isContinuing) {
            printGamenu();
            int userOption = getUerOption();

            switch (userOption) {
                case 0:
                    isContinuing = false;
                    break;
                case 1:
                    addNumberIntoArrayList(myArrayList);
                    break;
                case 2:
                    printArrayList(myArrayList);
                    break;
                case 3:
                    int maxValue = getMaxvalue(myArrayList);
                    System.out.println("===> Max number: " + maxValue);
                    break;
                case 4:
                    int minValue = getMinvalue(myArrayList);
                    System.out.println("===> Min number: " + minValue);
                    break;
                case 5:
                    searchNumber(myArrayList);
                    break;
                case 6:
                    resetTheList(myArrayList);
                    break;
                default:
                    System.out.println("Wrong option.");
            }

        }
    }

    private static void printGamenu() {
        System.out.println("=========MENU========\n0. Exit!!!\n1. Add number into ArrayList\n2. Print number\n" +
                "3. Get maximum number\n4. Get minimum number\n5. Search number\n6. Reset the list");
    }

    private static int getUerOption() {
        System.out.print("Please  enter your option: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void addNumberIntoArrayList(List<Integer> myArrayList) {
        System.out.print("Please enter number to add list: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        myArrayList.add(number);
    }

    private static void printArrayList(List<Integer> myArrayList) {
        System.out.println(myArrayList);
    }

    private static void resetTheList(List<Integer> myArrayList) {
        myArrayList.clear();
        System.out.println("The list was reset.");
    }

    private static int getMaxvalue(List<Integer> myArrayList) {
        int max = 0;
        for (int i = 0; i < myArrayList.size(); i++) {
            if (max < myArrayList.get(i)) {
                max = myArrayList.get(i);
            }
        }
        return max;
    }

    private static int getMinvalue(List<Integer> myArrayList) {
        int min = 0;
        for (int i = 0; i < myArrayList.size(); i++) {
            if (min > myArrayList.get(i)) {
                min = myArrayList.get(i);
            }
        }
        return min;
    }

    private static void searchNumber(List<Integer> myArrayList) {
        Scanner scanner = new Scanner(System.in);
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
