package chapter_6.Lesson_5;

public class String_Class_01 {
    public static void main(String[] args) {
        String myString = "aBc";

        // 대소문자 변환
        System.out.println(myString.toUpperCase());
        System.out.println(myString.toLowerCase());
        System.out.println(myString);


        // 문자열 비교
        System.out.println(myString.toLowerCase() == "abc");
        //  참조형의 비교 연산자는 가리키는 인스턴스가 같은 인스턴스인지 확인하는 역할을 함, 그러므로 false가 나옴

        // 두 문자열의 내용이 같은지 비교하려면 ==가 아니라 equals 메소드를 사용하셔야 합니다.
        System.out.println(myString.toLowerCase().equals("abc"));
    }
}
