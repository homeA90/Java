package chapter_5;

public class Example_4_9 {
    public static void main(String[] args) {

        // 10000 미만의 정수 중에서, 153의 배수중 가장 큰 값을 찾아 출력하세요.
        int num = 10000;
        int key = 153;


        // 내가 짠 코드
        int result;
        while (true){
            if (num > 0) {
                result = num % key;
                if (result == 0) {
                    break;
                } else {
                    num--;
                }
            }
        }
        System.out.println(num);


        // 코드잇 강의 코드
        while (num % key > 0) {
            num--;
        }
        System.out.println(num);

    }

}
