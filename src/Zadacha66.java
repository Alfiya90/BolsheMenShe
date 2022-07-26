import java.util.Scanner;

public class Zadacha66 {

        public static void main(String[] args) throws java.io.IOException {
            Scanner scanner = new Scanner(System.in);
            String a = scanner.nextLine();
            String s = "qwertyuiopasdfghjklzxcvbnm" ;
            char[] charArray = s.toCharArray();

            for (int i = 0; i < s.length(); i++) {
                if (a.charAt(0) == charArray[i]) {
                    System.out.println(charArray[(i+1)%s.length()]);
                }
            }
            }

}


