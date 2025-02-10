package chapter_5;

public class IfElse {
    public static void main(String[] args) {
        /* 조건문 기본 문법
            if (조건부분 1) {
                // 수행 부분 1
            } else if (조건 부분 2) {
                // 수행 부분 2
            } else if (조건 부분 3) {
                // 수행 부분 3
            } else {
              // 수행 부분 4
            }  */



        int number = 13;
        if (number % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
        // 13을 2로 나누면 나머지는 1이죠? 1은 0과 같지 않으니까 조건 부분은 false가 나옵니다.
        // 그래서 else부분으로 넘어가 "odd number"를 출력하는 명령어가 수행되는 거죠.




        int x = 10;
        int y = 3;

        if (x != 10 || x % 2 !=0) {
            System.out.println(x);
        } else if (y == 1) {
            System.out.println(y);
        } else {
            System.out.println(x + y);
        }
        // x는 10이 맞기 때문에 x != 10는 false입니다.
        // x는 2로 나누어 떨어지기 때문에 x % 2 != 0도 false입니다.
        // false || false는 false이기 때문에 if문의 조건 부분은 결과적으로 거짓이죠?
        //그러면 이제 else if의 조건 부분을 확인하는데, y == 1은 true이기 때문에 y의 값인 1이 출력됩니다.


    }
}
