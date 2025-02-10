package chapter_5;

public class Example_5_3 {
    public static void main(String[] args) {
        /*
        (1) 크기가 30인 정수형 배열 intArray를 만들어 주세요.
        (2) 배열의 첫 번째(0번 인덱스) 칸부터 1001, 1002, 1003, ..., 1029, 1030을 순서대로 넣어주세요.
        (3) 크기가 4인 문자열형 배열 remainders를 만들어 "Zero", "One", "Two", "Three"를 순서대로 넣어주세요.
        (4) intArray 배열에 담긴 각 값을 4로 나눈 나머지를 인덱스로 생각하고, remainders 배열에서 그 인덱스에 위치한 단어를 출력해주세요.
        이 때 반드시 '배열 정리' 노트에 있는, for- each문을 활용해주세요!!
         */

        int[] intArray =  new int[30];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i + 1001;
        }

        String[] remainders = new String[4];
        remainders[0] = "Zero";
        remainders[1] = "One";
        remainders[2] = "Two";
        remainders[3] = "Three";
        // String[] remainders = {"Zero", "one", "Two", "Three"};


        for (int number : intArray) {
            System.out.println(remainders[number % 4]);
        }
    }
}
// intArray 이건 비유하자면 숫자를 담은 공간이라 계산이 안되는거고
//number는 intArray에서 가져온 숫자 자체를 의미하니 계산이 되는거로 이해하면 된다.