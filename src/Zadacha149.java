import java.util.Scanner;

public class Zadacha149 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int size = scanner.nextInt();
         int [] Array = new int [size];
         for (int i = 0; i<Array.length; i++) {
             int n = scanner.nextInt();
             Array[i] = n;
         }
             for (int j = size-1 ; j >= 0; j-- ) {
                 System.out.println(Array [j]);
             }

         }

}

