import java.util.Scanner;

public class BolsheMenshe {
    public static void main(String[] args) {
        Scanner s= new Scanner (System.in);
        System.out.println("Введите первое число");
        int x = s.nextInt();
        System.out.println("Введите второе число");
        int y= s.nextInt();
        if (x==y){
            System.out.println(x+ "="+y);
        } else if (x<y){
            System.out.println(x+"<"+y);
        } else {
            System.out.println(x+">"+y);

        }
    }


    }

