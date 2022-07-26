import java.util.Scanner;

public class Zadacha88 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] n = new int[size];

        for (int i = 0; i < n.length; i++) {
            n[size] = scanner.nextInt();
        }
         int min = n[0];
         for (int i =0; i< n.length; i++) {
         if (n[i] < min) {
             min = n[i];
         }
             System.out.println(min);
         }
    }
}
