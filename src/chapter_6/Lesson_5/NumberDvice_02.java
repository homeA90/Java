package chapter_6.Lesson_5;

import java.util.Random;

public class NumberDvice_02 {
    public static void main(String[] args) {

        // 절대값_Math.abs()
        System.out.println(Math.abs(-10));
        System.out.println(Math.abs(8));


        // 최소값, 최대값
        System.out.println(Math.min(4, 10));
        System.out.println(Math.max(4, 10));


        // random 클래스
        Random rand = new Random();
        System.out.println(rand.nextInt(10));  // 0 이상 9 이하 랜덤한 값


        // a와 b사이의 랜던 값
        int min = 10;
        int max = 30;
        System.out.println(rand.nextInt((max - min) + 1) + min);
        /*
        [해설]
        이 코드에서 ((max - min) + 1) + min 부분을 살펴보면, 난수 생성의 범위를 설정하는 방식입니다.

        1. rand.nextInt((max - min) + 1):
        rand.nextInt(n)은 0 이상 n 미만의 값을 랜덤하게 생성합니다.
        (max - min) + 1은 max와 min 사이의 숫자를 포함하려는 범위로 설정합니다.
        예를 들어, min = 10이고 max = 30이라면 (max - min) + 1 = 21이 되어, rand.nextInt(21)은 0 이상 20 이하의 값을 반환합니다.

        2. + min:
        마지막에 min을 더하는 이유는 rand.nextInt((max - min) + 1)으로 생성된 값이 0 이상 max - min 이하이기 때문에,
        그 값을 min만큼 더해서 최종적으로 원하는 범위인 min 이상 max 이하로 맞추기 위함입니다.
        간랸하게 0~20 인데 10을 더해서 10~30으로 만들어주는 것!
         */
    }
}
