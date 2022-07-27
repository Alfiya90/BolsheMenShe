package Zadachi;


import java.util.Arrays;
import java.util.Scanner;

public class Z81 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] array = new int[N];
        for (int j = 0; j < array.length; j++){
            array[j] = scan.nextInt();
        }
        Arrays.sort(array, 0, N);
        System.out.println();
        System.out.println(array[0] + " " + array[N-1]);
    }
}
