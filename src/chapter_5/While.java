package chapter_5;

public class While {
    public static void main(String[] args) {
        /* 기본 문법
        while (조건 부분) {
            수행 부분
        } */

        int i = 1;
        int sum = 0;

        while (sum < 10000) {
            sum = sum + i; // sum += i;
            i = i + 1;  // i++;
        }
        System.out.println(sum);
        System.out.println(i-1);


        while (true) {
            if (sum >= 10000) {
                break;
            }
            sum += i;
            i++;
        }
        System.out.println(sum);
        System.out.println(i-1);
    }
}
