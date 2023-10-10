package Lv0;

import java.util.Scanner;

public class Q_07 {
    public static void main(String[] args) {
        // 문제 설명
        // 두 개의 문자열 str1, str2가 공백으로 구분되어 입력으로 주어집니다.
        // 입출력 예와 같이 str1과 str2을 이어서 출력하는 코드를 작성해 보세요.

        // 입력 #1
        //apple pen

        //출력 #1
        //applepen

        //입력 #2
        //Hello World!

        //출력 #2
        //HelloWorld!

        Scanner sc = new Scanner(System.in);
//        String a = sc.next();
//        String b = sc.next();

        String a = "apple";
        String b = "pen";


        if (1<= a.length() && b.length() <= 10) {
//            System.out.println((a+b).trim());
            System.out.println(a.concat(b));
        }
    }
}
