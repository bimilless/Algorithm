package Lv0;

public class Q_26 {
    public static void main(String[] args) {
        /*
        문제 설명

        정수 리스트 num_list가 주어질 때, 마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을
        마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여 return하도록 solution 함수를 완성해주세요.
         */

        /*
        입출력 예

        num_list	          result
        [2, 1, 6]	       [2, 1, 6, 5]
        [5, 2, 1, 7, 5]	[5, 2, 1, 7, 5, 10]

        입출력 예 설명
        입출력 예 #1

        마지막 원소인 6이 그전 원소인 1보다 크기 때문에 6 - 1인 5를 추가해 return합니다.

        입출력 예 #2

        마지막 원소인 5가 그전 원소인 7보다 크지 않기 때문에 5의 두 배인 10을 추가해 return합니다.
         */

        int[] num_list = {2, 1, 6};
        int[] answer = new int[num_list.length + 1];
        int last = 0;

        if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
            last = num_list[num_list.length - 1] - num_list[num_list.length - 2];
        } else {
            last = num_list[num_list.length - 1] * 2;
        }
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        answer[answer.length - 1] = last;
    }

    class Solution {
        public int[] solution(int[] num_list) {
            int[] answer = new int[num_list.length + 1];
            int last = 0;

            if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
                last = num_list[num_list.length - 1] - num_list[num_list.length - 2];
            } else {
                last = num_list[num_list.length - 1] * 2;
            }
            for (int i = 0; i < num_list.length; i++) {
                answer[i] = num_list[i];
            }
            answer[answer.length - 1] = last;
            return answer;
        }
    }
}