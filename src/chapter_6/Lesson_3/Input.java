package chapter_6.Lesson_3;


import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("나이가 어떻게 되시나요?");

        Scanner scanner = new Scanner(System.in); // 콘솔 입력 받기 위한 코드
        int age = scanner.nextInt(); // 입력할 값을 넣어주는 객체

        System.out.println("나이는: " + age);

        System.out.println("이름이 어떻게 되시나요?");
        String name = scanner.next(); // 타입별로 코드가 약간 다름

        System.out.println(name + "의 나이는: " + age);
    }
}
