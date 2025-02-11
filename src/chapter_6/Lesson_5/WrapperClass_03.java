package chapter_6.Lesson_5;

public class WrapperClass_03 {
    public static void main(String[] args) {
    // Integer i = new Integer(123); 해당 코드는 java9에서 사용권장안함으로 지정되고, java16에서 삭제 됨
    // 그리고 Integer.valueOf()은 캐시를 이용하여 출력되므로 == 으로 도 값이 ture 나옴
        Integer i = Integer.valueOf(123); // 해당 식으로 작성해야함.
        Integer j = 123;

        System.out.println(j==123);
        System.out.println(j==j);
        System.out.println(Integer.valueOf(123) == Integer.valueOf(123));
        System.out.println(Integer.valueOf(123).equals(Integer.valueOf(123)));
    }
}
