package Lab_02;

import java.util.Scanner;

public class Lab_2_1 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Pls input your weight: ");
        float weight = scanner1.nextFloat();
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Pls input your height: ");
        float height = scanner2.nextFloat();
        float BMI = weight / (height * 2);
        System.out.println("BMI = " + BMI);
        if (BMI <= 18.5) {
            System.out.println("You are underweight");
        } else if (BMI > 18.5 && BMI <= 24.9) {
            System.out.println("You are normal weight");
        } else if (BMI >= 25 && BMI <= 29.9) {
            System.out.println("You are overweight");
        } else {
            System.out.println("You are obesity");
        }
    }
}
