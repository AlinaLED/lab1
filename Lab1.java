package lab1;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число a");
        int a = in.nextInt();
        System.out.println("Введите число b");
        int b = in.nextInt();
        System.out.println("Введите число c");
        int c = in.nextInt();
        System.out.println("Введите число d");
        int d = in.nextInt();

        int x =0;
        if (a<b &a<c&a<d)x =a;

        else if (b<a&b<c&b<d)x =b;
        else if (c<a&c<b&c<d)x =c;
        else if (d<b&d<c&d<a)x =d;

        System.out.println(x);


    }

}
