package chapter_5;

public class TypeConversionCasting {
    public static void main(String[] args) {

        // 형 변환
        int a = 36;
        double b = a;     // int to double

        short c = 17;
        long d = c;       // short to long

        float e = 3.14f;
        double f = e;     // float to double

        System.out.println(b);
        System.out.println(d);
        System.out.println(f);


        // 타입 캐스팅 (Type Casting)
        // 값(혹은 변수) 앞에 (자료형)(예: (int) x)을 적어주면 강제적으로 형을 변환시킬 수 있습니다.
        // 물론 형 변환이 가능한 경우에 대해서만 가능하겠죠? 숫자 자료형들 사이에서는 모두 가능합니다.
        double x = 3.14;
        int y = (int) x;
        long z = (long) x;

        System.out.println(y);
        System.out.println(z);

        int q = 9;
        int w = 5;
        System.out.println(q / w);
        System.out.println((double) q / w);

        double pi = 3.14;
        int myInt = (int) pi; // 데이터 손실 (소수 부분)
        System.out.println(myInt);

    }
}
