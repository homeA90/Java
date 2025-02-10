package chapter_5;

public class Array {
    public static void main(String[] args) {

        /*
        배열 생성
        배열을 만드는 방법
        (1) 선언과 동시에 빈 배열 생성
        int[] intArray = new int[5]; // 크기 5의 빈 배열

        (2) 선언 후, 배열 생성
        int[] intArray;
        intArray = new int[5]; // 크기 5의 빈 배열

        위 두개는 사실 거의 똑같다고 볼 수 있죠?

        (3) 리터럴로 생성
        int[] intArray = {1, 2, 3, 4, 5};

        이렇게 하면 5개의 원소가 있으니까 intArray는 자동으로 크기 5의 배열이 됩니다.

        그런데 이 방식은 변수를 정의할 때만 할 수 있습니다. 밑에 코드처럼 두 줄에 나누어서 하면 오류가 나옵니다.
        int[] intArray;
        intArray = {1, 2, 3, 4, 5}; // 오류


        배열 사용
        이제 배열을 사용하는 방법을 볼까요? 먼저 값을 대입하는 방법을 보겠습니다.

        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        intArray[3] = 4;
        intArray[4] = 5;

        이렇게 하면 0번 인덱스에는 정수 1을 넣어주고, 1번 인덱스에는 정수 2를 넣어주고, 이런식으로 intArray 배열을 채우게 됩니다.
        여기서 중요한 점: 인덱스는 0부터 시작합니다! 5칸 짜리 배열이라면 인덱스가 0부터 4까지이겠죠?


        앨리어싱 (Aliasing)
        이렇게 배열을 통째로 넘길 수도 있는데요.

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = arr1;

        급 퀴즈! 아래 코드의 출력값은 뭘까요?

        arr1[0] = 100;
        System.out.println(arr2[0]);
        100
        100입니다! arr1을 arr2에 지정해줬을 때, 두 변수는 같은 주소를 가리키게 됩니다.
        사실 arr1과 arr2는 아예 똑같은 값인 거죠. arr2를 arr1의 'Alias(가명)'이라고 할 수 있습니다.

        그럼 만약 arr1을 arr2에 새롭게 복사하고 싶으면 어떻게 해야할까요?

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = arr1.clone();

        arr1[0] = 100;
        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
        100
        1
        이렇게 clone라는 메소드를 사용하면 됩니다.
        메소드의 사용은 나중에 천천히 배울테니 문법적인 어려움이 있어도 걱정하지 마시고, '이런게 있구나' 정도만 확인하시면 됩니다.

        어쨌든 이렇게 하면 배열이 복사가 된 것이라, arr1과 arr2는 서로 다른 배열입니다.
        그래서 arr1[0]을 수정해도 arr2[0]에는 영향을 미치지 않고, 1이 출력됩니다!

         */

        int [] intArray = new int [5];

        intArray[0] = 2;
        intArray[1] = 3;
        intArray[2] = 5;
        intArray[3] = 7;
        intArray[4] = 11;

        // System.out.println(intArray[2] + intArray[4]);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        // for-each 문법
        // 이렇게 쓰면, 처음에 수행 부분으로 들어갈 때 i는 intArray의 0번 인덱스의 값(원소)을 갖게 되고,
        // 그 다음 들어갈 때는 1번 인덱스의 값(원소)을 갖게 되고...이런 식으로 배열의 마지막 값(원소)까지 갖게 됩니다
        for (int i : intArray) {
            System.out.println(i);
        }

        for (double i : intArray) {
            System.out.println(i);
        }


        // 예제1) 100개 짜리 배열을 만들고 첫 번째 칸은 1, 두 번째 칸은 2, ..., 마지막 칸은 100으로 채워봅시다.
        int [] arr1 = new int [100];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i+1;
            System.out.println(arr1[i]);
            }
        // for-each 문법
        for (int i : arr1) {
            System.out.println(i);
        }


        // 예제2) 문자열을 담는 fruitsArray을 만든 후, 원소를 저장하고, for - each문을 활용하여 원소들을 출력해주었습니다.
        String[] fruitsArray = new String[5];

        fruitsArray[0] = "딸기";
        fruitsArray[1] = "당근";
        fruitsArray[2] = "수박";
        fruitsArray[3] = "참외";
        fruitsArray[4] = "메론";

        for (String fruit : fruitsArray) {
            System.out.println(fruit);
        }
    }
}
