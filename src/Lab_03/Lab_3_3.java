package Lab_03;

import java.util.Arrays;

public class Lab_3_3 {
    public static void main(String[] args) {
        int[] arrNumber = new int[]{12,345,654,34,7,0,65,32,4,56,2,6,8,8,5,43,2,7,9};
        System.out.println("Sap xep mang sau tu nho den lon:");
        System.out.println(Arrays.toString(arrNumber));
        System.out.println("=======+=======+=======+=======+======+=======+=======+=======+======");
        int temp;
        for (int i = 0; i < arrNumber.length; i++) {
            for (int j = i; j < arrNumber.length; j++) {
                if(arrNumber[i]>arrNumber[j]){
                    temp = arrNumber[i];
                    arrNumber[i] = arrNumber[j];
                    arrNumber[j] = temp;
                }
            }
        }
        System.out.println("Mang sau khi sap xep:");
        System.out.println(Arrays.toString(arrNumber));
    }
}
