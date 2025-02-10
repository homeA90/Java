package chapter_5;

public class Example_4_6 {
    public static void main(String[] args) {


        // 정수 134354를 7로 나눈 나머지를 영어로 출력하세요.
        // 예를 들어서 134354를 7로 나누었을 때 나머지가 0이면 콘솔에 "Zero"가 출력되어야 하고, 1 이면 콘솔에 "One"이 출력되어야 하고, 2이면 "Two"가 출력되어야 하고, 6이면 "Six"이 출력되어야 합니다.
        // (어떤 수를 7로 나누었을 때, 나올 수 있는 나머지의 최솟값은 0이고, 최댓값은 6입니다.)
        int num = 7;

        switch (num % 7) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            default:
                System.out.println("Zero");
                break;
        }
    }
}
