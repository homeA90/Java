package chapter_5;

public class MultidimensionalArrays {
    public static void main(String[] args) {

        // '다중 배열'을 선언
        // 초기값을 바로 설정
        int[][] multiArray1 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        // int[4] 배열 세 개가 묶인 배열'이라고 볼 수 있습니다.
        // 즉, multiArray[0]의 자료형은 int[4]이고 내용은 {1, 2, 3, 4}인 것이죠


        //생성
        // 위에서는 배열의 초기값을 바로 설정해주었는데요. 만약 선언과 생성만 하기 위해서는 어떻게 해야 할까요?
        //3 x 4 사이즈의 빈 배열을 만들어봅시다.
        int[][] multiArray2 = new int[3][4];
        // 각 대괄호 사이에 사이즈를 넣어줍니다. 일반적으로 '행(줄)'을 첫 번째 대괄호에, '열(칸)'을 두 번째 대괄호에 넣습니다.


        //사용
        //앞서 보셨듯, multiArray[0]은 이제 int[4]의 자료형을 갖게 됩니다.
        // 마찬가지로 multiArray[1], multiArray[2] 모두 int[4]의 자료형을 갖게 되죠.
        // 그렇기 때문에 multiArray[0]을 일반적인 배열 탐색법으로 탐색할 수 있습니다.

        for (int i = 0; i < multiArray2[0].length; i++) {
            multiArray2[0][i] = 1 + i;
            System.out.println(multiArray2[0][i]);
        }

        for (int i = 0; i < multiArray2[1].length; i++) {
            multiArray2[1][i] = 5 + i;
            System.out.println(multiArray2[1][i]);
        }

        for (int i = 0; i < multiArray2[2].length; i++) {
            multiArray2[2][i] = 9 + i;
            System.out.println(multiArray2[2][i]);
        }



        // 중첩 반복문 (Nested Loops)
        //하지만 위의 방법도 너무 반복적이죠? 중첩 반복문을 사용하면 깔끔하게 쓸 수 있습니다!
        for (int i = 0; i < multiArray2.length; i++)
            for (int j = 0; j < multiArray2[i].length; j++) {
                multiArray2[i][j] = (i * 4 + 1) + j;
                System.out.println(multiArray2[i][j]);
            }
        // 여기서 multiArray2.length는 전체 자리 수 12가 아닌, 행(줄)의 수인 3입니다
    }
}
