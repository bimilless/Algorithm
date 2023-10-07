package Lv0;

import java.util.Scanner;

public class Q_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";

        for (int i =0; i<a.length(); i++) {
            char x = a.charAt(i);
            if (Character.isLowerCase(x)) {
                result += Character.isUpperCase(x);
            } else {
                result += Character.isLowerCase(x);
            }

            System.out.println(result);
        }
    }}
