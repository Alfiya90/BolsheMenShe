package Zadachi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Z514 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int n = 0;
        for (int i = 1; i*(i+1)/2 <= k; i++) {
            n = i;
            n++;
        }
        System.out.println(n-1);


    }
}
