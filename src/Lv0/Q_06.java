package Lv0;

import java.util.Scanner;

public class Q_06 {
    public static void main(String[] args) {
        // 문제 설명
        // 두 정수 a, b가 주어질 때 다음과 같은 형태의 계산식을 출력하는 코드를 작성해 보세요.
        // a + b = c

        // 입력 #1
        // 4 5

        // 출력 #1
        // 4 + 5 = 9

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;


        if (1 <= a && b <= 100) {
            System.out.println(a + " + " + b + " = " + c);
        }
    }
}
