package chapter_6.Lesson_3.Example_3_1;
/*
파라미터로 정수 배열 intArray를 받고 배열의 모든 값의 평균을 리턴해주는 메소드 computeAverage를 쓰세요.
리턴값의 자료형은 double입니다.

4.3333333
3.75
4.0
3.0
 */
public class AverageFinder {
    double computeAverage(int[] intArray) {
        double sum = 0;
        for (int num : intArray) {
            sum += num;
        }
        return sum/intArray.length;
    }
}
