package chapter_5;

public class Example_4_12 {
    public static void main(String[] args) {

        /* for문으로 구구단을 출력해보세요. 아래와 똑같은 결과값이 나와야 합니다.
        1 * 1 = 1
        1 * 2 = 2
        1 * 3 = 3
        1 * 4 = 4
        1 * 5 = 5
        1 * 6 = 6
        1 * 7 = 7
        1 * 8 = 8
        1 * 9 = 9
        2 * 1 = 2
        2 * 2 = 4
        */

        int sum = 0;

        for (int x = 1; x <= 9; x++) {
            for (int y = 1; y <= 9; y++) {
                sum = x * y;
                System.out.println(x + " * " + y + " = " + sum);
            }
        }
    }
}
