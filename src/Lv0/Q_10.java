package Lv0;

public class Q_10 {
    public static void main(String[] args) {
        // 문제 설명
        // 문자열 my_string, overwrite_string과 정수 s가 주어집니다. 문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을 문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.

        // 제한사항
        //my_string와 overwrite_string은 숫자와 알파벳으로 이루어져 있습니다.
        //1 ≤ overwrite_string의 길이 ≤ my_string의 길이 ≤ 1,000
        //0 ≤ s ≤ my_string의 길이 - overwrite_string의 길이

        // 입출력 예
        // my_string	        overwrite_string	       s	          result
        // "He11oWor1d"	           "lloWorl"	           2	        "HelloWorld"
        // "Program29b8UYP"	        "merS123"	           7	      "ProgrammerS123"

        String my_string =  "He11oWor1d";
        String overwrite_string =  	"lloWorl";
        int s = 2;

        String answer = "";

        int ms = my_string.length();
        int os = overwrite_string.length();

        answer = my_string.substring(0,s) + overwrite_string + my_string.substring(s+os, ms);

        System.out.println(my_string.substring(0,s) + overwrite_string + my_string.substring(s+overwrite_string.length(), my_string.length()));
    }
}