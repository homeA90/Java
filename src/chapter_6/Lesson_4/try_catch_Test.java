package chapter_6.Lesson_4;

public class try_catch_Test {
    public static void main(String[] args) {
        int[] smallArray = new int[3];

        for (int i = 0; i < 10; i++) {
            try {
                smallArray[i] = i;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(i + "번째 시도에서 예외 발생");
            }
        }
        for (int i : smallArray) {
            System.out.println(i);
        }
    }
}


/*
예외처리 (Exception Handling)
tyr{
    ...
    // 오류를 발생시킬 수 있는 코드
} catch (Exception e) {
    ...
    // 오류가 발생한 경우 해결
} catch (ArrayIndexOutOfBoundsException e) {  //처음 부분에 발생한 오류를 작성한다.
    ...
    // 오류가 발생한 경우 해결
{

 */