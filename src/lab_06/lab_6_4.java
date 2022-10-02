package lab_06;

public class lab_6_4 {
    public static void main(String[] args) {
//        String url = "https://   google.com";
//        Check http OR https; domain name, .com OR .net
        String url = "http://google.com";
        String url2 = "https://vietnam.net";
        char[] myChars = url2.toCharArray();
        String http = "";
        String domain = "";
        boolean startPlusToHttp = true;
        boolean startPlusToDomain = false;

        for (char character : myChars) {
            if (character == ':') {
                startPlusToHttp = false;
                continue;
            }
            if (startPlusToHttp) {
                http += character;
            }
            if (character == '.') {
                startPlusToDomain = true;
            }
            if (startPlusToDomain) {
                domain += character;
            }
        }

        System.out.println("HTTP is: " + http);
        System.out.println("Domain is: " + domain);
    }
}
