package Lv0;

public class Q_23 {
    public static void main(String[] args) {
        /*
        문제 설명
        1부터 6까지 숫자가 적힌 주사위가 세 개 있습니다. 세 주사위를 굴렸을 때 나온 숫자를 각각 a, b, c라고 했을 때 얻는 점수는 다음과 같습니다.

        세 숫자가 모두 다르다면 a + b + c 점을 얻습니다.
        세 숫자 중 어느 두 숫자는 같고 나머지 다른 숫자는 다르다면 (a + b + c) × (a2 + b2 + c2 )점을 얻습니다.
        세 숫자가 모두 같다면 (a + b + c) × (a2 + b2 + c2 ) × (a3 + b3 + c3 )점을 얻습니다.
        세 정수 a, b, c가 매개변수로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
         */

        /*
        입출력 예
        a	b	c	result
        2	6	1	9
        5	3	3	473
        4	4	4	110592

        입출력 예 설명
        입출력 예 #1

        예제 1번에서 세 주사위 숫자가 모두 다르므로 2 + 6 + 1 = 9점을 얻습니다. 따라서 9를 return 합니다.

        입출력 예 #2

        예제 2번에서 두 주사위 숫자만 같으므로 (5 + 3 + 3) × (52 + 32 + 32 ) = 11 × 43 = 473점을 얻습니다. 따라서 473을 return 합니다.

        입출력 예 #3

        예제 3번에서 세 주사위 숫자가 모두 같으므로 (4 + 4 + 4) × (42 + 42 + 42 ) × (43 + 43 + 43 ) = 12 × 48 × 192 = 110,592점을 얻습니다. 따라서 110592를 return 합니다.
         */
        int a = 4;
        int b = 4;
        int c = 4;

        if(a != b && b != c && a != c) {
            System.out.println(a+b+c);
        } else if (a == b && b == c && a == c) {
            System.out.println((a+a+a) * (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c));
            } else {
            System.out.println((a+b+c) * (a*a + b*b + c*c));

        }
    }
    class Solution {
        public int solution(int a, int b, int c) {
            int answer = 0;
            if(a != b && b != c && a != c) {
                answer = a+b+c;
            } else if (a == b && b == c && a == c) {
                answer = (a+a+a) * (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c);
            } else {
                answer = (a+b+c) * (a*a + b*b + c*c);
            }
            return answer;
        }
    }
}