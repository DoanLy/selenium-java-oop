package Lab_03;

import java.util.Arrays;

public class Lab_3_1 {
    public static void main(String[] args) {
        int[] arrNumber = new int[]{2, 3, 45, 1, 2, 6, 23, 7, 9, 0};
        //System.out.println(Arrays.toString(myIntArr));
        System.out.println("Co bao nhieu so chan, so le trong chuoi sau:");
        System.out.println(Arrays.toString(arrNumber));
        int totalOdd = 0;
        int totalEven = 0;
        for (int i = 0; i < arrNumber.length; i++) {
            if (arrNumber[i] % 2 == 0) {
                totalOdd++;
            } else {
                totalEven++;
            }
        }
        System.out.printf("Co %d so chan!\n", totalOdd);
        System.out.printf("Co %d so le!", totalEven);
    }
}
