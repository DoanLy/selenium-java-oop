package lab_06;

import java.util.Arrays;

public class lab_6_1 {
    public static void main(String[] args) {
//        Given input string: "2hrs and 5 minutes"
//        Please calculate how many minutes in total
        String myString = "2hrs and 5 minutes";
        char[] myChars = myString.toCharArray();
        System.out.println(Arrays.toString(myChars));
        int hours, minutes, totalMinutes;
        hours = minutes = totalMinutes = 0;

        for (char character : myChars) {
            if (Character.isDigit(character)) {
                //System.out.println(character);
                if (hours != 0) {
                    minutes = Character.getNumericValue(character);
                    continue;
                }
                hours = Character.getNumericValue(character);
            }
        }
        System.out.println("Hours = " + hours);
        System.out.println("Minutes = " + minutes);
        totalMinutes = hours * 60 + minutes;
        System.out.println("Total = " + totalMinutes);
    }
}
