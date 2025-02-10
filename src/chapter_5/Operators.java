package chapter_5;

public class Operators {
    public static void main(String[] args) {

        // 문자열 사이에 덧셈(+) 연산자를 사용하면 문자열을 연결해줄 수 있습니다.
        String myString = "Hello " + "Codeit!";
        System.out.println(myString);

        // 문자열과 숫자를 더하면 숫자가 저절로 문자열로 바뀌고, 문자열과 불린을 더하면 불린이 저절로 문자열로 변경 됨
        System.out.println("I am " + 27 + " years old.");
        System.out.println("The result is " + false + ".");

        // 큰 따옴표(")로 둘러싸인 문자열 내에 큰 따옴표(")를 넣는 경우가 있겠죠.
        // 이런 경우에 맥에서는 역슬래쉬(\), 윈도우즈에서는 원화 표시(₩)를 사용하면 됩니다.
        System.out.println("데카르트는 \"나는 생각한다. 고로 존재한다.\"라고 말했다.");

        System.out.println(9 / 5);

        // 소수형은 정수형보다 랭크가 높기 때문에 소수형과 정수형 간의 연산의 결과값으로는 소수형이 나옵니다.
        System.out.println(9.0 / 5);


        int a = 3;
        int b = 5;
        System.out.println(-a);  // 양, 음 부호가 바뀜
        System.out.println(++a); // a에 1을 추가
        System.out.println(--a); // a에 1을 감소

        //불린 연산
        //비교 연산자 (Comparison chapter_5.Operators)
        System.out.println(a > b);  // a가 b보다 크다
        System.out.println(a >= b); // a가 b보다 크거나 같다
        System.out.println(a < b);  // a가 b보다 작다
        System.out.println(a <= b); // a가 b보다 작거나 같다
        System.out.println(a == b); // a는 b와 같다
        System.out.println(a != b); // a는 b와 같지 않다

        // 불린 연산자 (Boolean chapter_5.Operators)
        // AND(&&)의 경우 양쪽 다 true이어야만 true가 나오고, 한쪽이라도 false면 false가 나옵니다.
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        // OR(||)의 경우 양쪽 다 false이어야만 false가 나오고, 한쪽이라도 true면 true가 나옵니다.
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

    }
}
