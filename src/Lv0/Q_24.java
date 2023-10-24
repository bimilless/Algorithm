package Lv0;

public class Q_24 {
    public static void main(String[] args) {
    /*
    문제 설명

    정수가 담긴 리스트 num_list가 주어질 때, 모든 원소들의 곱이 모든 원소들의 합의 제곱보다
    작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.
     */

    /*
    입출력 예

    num_list         result
    [3, 4, 5, 2, 1]	    1
    [5, 7, 8, 3]	    0

    입출력 예 설명

    입출력 예 #1

    모든 원소의 곱은 120, 합의 제곱은 225이므로 1을 return합니다.

    입출력 예 #2

    모든 원소의 곱은 840, 합의 제곱은 529이므로 0을 return합니다.

    */

        int[] num_list = {3, 4, 5, 2, 1};
        int sum = 0;
        int mulSum = 1;

        for (int i = 0; i < num_list.length; i++) {
            sum += num_list[i];
            mulSum *= num_list[i];
        }

        if (mulSum < sum * sum) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }

    class Solution {
        public int solution(int[] num_list) {
            int answer = 0;
            int sum = 0;
            int mulSum = 1;

            for (int i = 0; i < num_list.length; i++) {
                sum += num_list[i];
                mulSum *= num_list[i];
            }

            sum = sum * sum;

            if (mulSum < sum * sum) {
                answer = 1;
            } else {
                answer = 0;
            }
            return answer;
        }
    }
}