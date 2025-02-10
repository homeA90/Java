package chapter_5;

public class For {
    public static void main(String[] args) {
        /* 기본 문법 (Syntax)
        for (초기화식; 종결 제어식; 증감 제어식) {
               수행부분
        }
        */

        // for문을 이용해서 1부터 10까지 출력하려면 이렇게 하면 됩니다.
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        /*
        초기화식에서 i라는 정수 변수를 선언해주고 1을 지정해줍니다.
        i가 10보다 작거나 같을 동안 반복합니다.
        수행 부분이 끝나면 i를 1 늘려줍니다.
         */


        /*
        Q. for문은 언제 사용하나요?
        for문은 while문과 달리 초기화식이 있고 for문 안에서만 쓸 수 있는 변수를 만들 수 있습니다. 이러한 장점 때문에 for문은,
        1. 반복의 인덱스가 필요한 경우
        2. 반복의 최대 횟수가 정해진 경우
        3. 갯수가 정해진 데이터 셋(배열, 리스트 등)의 내용을 하나씩 봐야할 경우
         */


        // 1 부터 100까지의 합을 구하시오.
        int sum = 0;
        for (int i = 1; i <= 100; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
