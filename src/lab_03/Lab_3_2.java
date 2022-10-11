package lab_03;

import java.util.Arrays;

public class Lab_3_2 {
    public static void main(String[] args) {
        int[] arrNumber = new int[]{12, 345, 654, 34, 7, 0, 65, 32, 4, 56, 2, 6, 8, 8, 5, 43, 2, 7, 9};
        System.out.println("In ra so lon nha, nho nhat trong mang sau:");
        System.out.println(Arrays.toString(arrNumber));
        System.out.println("=======+=======+=======+=======+======+=======+=======+=======+======");
        int maxNumber = arrNumber[0];
        int minNumber = arrNumber[0];

        for (int i = 0; i < arrNumber.length; i++) {
            if (maxNumber < arrNumber[i]) maxNumber = arrNumber[i];
            if (minNumber > arrNumber[i]) minNumber = arrNumber[i];
        }
        System.out.println("So lon nhat: " + maxNumber);
        System.out.println("So nho nhat: " + minNumber);
    }
}
