package Lv0;

public class Q_12 {
    public static void main(String[] args) {
        // 문제 설명
        //문자들이 담겨있는 배열 arr가 주어집니다. arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.

        // 입출력 예
        //       arr	result
        //["a","b","c"]	  "abc"

        String[] arr = {"a", "b", "c"};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    class Solution {
        public String solution(String[] arr) {
            String answer = "";
            for (int i = 0; i < arr.length; i++) {
                answer += arr[i];
            }
            return answer;
        }
    }
}
