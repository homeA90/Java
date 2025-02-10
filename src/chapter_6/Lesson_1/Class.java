package chapter_6.Lesson_1;

public class Class {
    /*

    [클래스 (Class)]
    [사람 (Person)]
    '클래스'는 앞서 말한 객체들에 대한 설계도, 또는 설명서입니다. '사람' 객체에 대한 설명서를 먼저 써봅시다.

    public class Person {
        String name;
        int age;
        int cashAmount;
        // 은행 계좌?
    }
    Person이라는 클래스를 만들었습니다.
    이 클래스에는 '이름'을 표현하는 name이라는 문자열 변수, '나이'를 표현하는 age라는 정수 변수, 그리고 '보유 현금'을 표현하는 cashAmount라는 정수 변수가 있습니다.
    '은행 계좌'를 표현하는 변수는 일단 비워두겠습니다.

    [은행 계좌 (BankAccount)]
    이번에는 '은행 계좌' 객체에 대한 설명서를 써보겠습니다.

    public class BankAccount {
        int balance;
        // 소유인?
    }
    BankAccount라는 클래스를 만들고, 이 클래스에는 '잔액'을 표현하는 balance라는 정수 변수가 있습니다.
    '소유인'을 표현하는 변수는 일단 비워두겠습니다.

    [연결하기]
    이제 '사람'과 '은행 계좌'의 관계를 표현해봅시다.

    public class Person {
        String name;
        int age;
        int cashAmount;
        BankAccount account;
    }
    BankAccount 클래스를 마치 자료형처럼 사용한 걸 보실 수 있습니다. account 변수는 BankAccount 타입을 갖게 됩니다.

    마찬가지로:

    public class BankAccount {
        int balance;
        Person owner;
    }
    owner 변수는 Person 타입을 갖게 됩니다.

    이런 식으로 프로그램을 객체 단위로 정리하고, 객체들끼리 엮으면서 프로그래밍 하는 방식이 바로 '객체 지향 프로그래밍'입니다!

     */

}
