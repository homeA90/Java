package chapter_5;

public class Example_3_10 {
    public static void main(String[] args) {

        //여러분이 국어(koreanScore) 86점, 수학(mathScore) 94점, 과학(scienceScore) 87점, 컴퓨터(computerScore) 100점을 맞았다고 합시다.
        //이 값들을 사용하여 평균 점수(average)를 구하고 소수로 출력해 보세요.

        // 시험 점수
        int koreanScore = 86;
        int mathScore = 94;
        int scienceScore = 87;
        int computerScore = 100;

        double average = (double) (koreanScore + mathScore + scienceScore + computerScore)/4;
        System.out.println(average);

        }

}

