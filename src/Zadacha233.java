import java.util.Scanner;

public class Zadacha233 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        int k = 0;

        for (int i = 0; i < array.length; i++) {
            int h = scanner.nextInt();
            array[i] = h;

            if (array[i] <= 437) {
                k = k + 1;
            }
        }
        System.out.println("Crash " + k);

        for (int i = 0; i < array.length; i++) {
            while (array[i] > 437) {
                System.out.println(" No crash");
                break;
            }
        }
    }
}






