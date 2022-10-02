package lab_06;

public class lab_6_3 {
    public static void main(String[] args) {
//        String myStr = "100 minutes";
//        NOT using REGEX, extract digit character from that String
//        Expected output: "100".
//        EX: "12345nabc678" -> "12345678"
        String myStr = "100 minutes";
        System.out.println("Input: " + myStr);
        String newString = "";
        char[] myChars = myStr.toCharArray();
        for (char character : myChars) {
            if (Character.isDigit(character)) {
                newString += character;
            }
        }
        System.out.println("Expected output: " + newString);
    }
}
