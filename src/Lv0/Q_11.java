package Lv0;

public class Q_11 {
    public static void main(String[] args) {
        // 문제 설명
        //길이가 같은 두 문자열 str1과 str2가 주어집니다.
        //두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요.

        // 입출력 예
        //  str1	  str2	   result
        //"aaaaa"	"bbbbb"	"ababababab"

        String str1 = "aaaaa";
        String str2 = "bbbbb";
        String mixed = solution(str1, str2);
        System.out.println(mixed);

    }

    public static String solution(String str1, String str2) {
        int length1 = str1.length();
        int length2 = str2.length();
        int maxLength = Math.max(length1, length2);

        StringBuilder mixed = new StringBuilder();

        for (int i = 0; i < maxLength; i++) {
            if (i < length1) {
                mixed.append(str1.charAt(i));
            }
            if (i < length2) {
                mixed.append(str2.charAt(i));
            }
        }
        return mixed.toString();
    }
}


