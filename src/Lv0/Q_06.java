package Lv0;

import java.util.Scanner;

public class Q_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;


        if (1 <= a && b <= 100) {
            System.out.println(a + " + " + b + " = " + c);
        }
    }
}
