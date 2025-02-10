package chapter_6.Lesson_1;

public class Method {
    /*
    기본 문법 (Syntax)
    먼저 메소드의 기본 문법부터 봅시다.

    int sum(int x, int y) {
        return x + y;
    }
    sum이라는 메소드를 썼는데요. 이 함수는 일단 파라미터로 정수형 x와 정수형 y를 받습니다.
    그리고 이 메소드는 꼭 정수형을 리턴시켜줘야 합니다.
    그렇지 않으면 오류가 나옵니다! return x + y;는 정수형을 리턴시켜주니까 문제 없겠죠?

    만약 리턴값이 없으면 자료형 대신 void라고 써주면 됩니다.
    예를 들어서 예전에 썼던 main 함수도 리턴값이 없기 때문에 void를 썼었습니다.

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    예제
    '은행 계좌' 예제로 돌아가봅시다. '은행 계좌'에는 '입금' 기능, '출금' 기능, 그리고 '이체' 기능이 필요하겠죠?
    각각 틀만 써보겠습니다.

    public class BankAccount {
        int balance;
        Person owner;

        // 파라미터: 입금할 액수
        // 리턴: 성공 여부 (불린)
        boolean deposit(int amount) {

        }

        // 파라미터: 출금할 액수
        // 리턴: 성공 여부 (불린)
        boolean withdraw(int amount) {

        }

        // 첫 번째 파라미터: 받는 사람 (Person)
        // 두 번째 파라미터: 이체할 금액 (정수)
        // 리턴: 성공 여부 (불린)
        boolean transfer(Person to, int amount) {

        }
    }
    '입금' 기능은 deposit 메소드로 썼는데요. 이 메소드는 파라미터로 입금할 액수 amount를 받고, 입금 성공 여부를 나타내는 불린 값을 리턴해줍니다.

    '출금' 기능은 withdraw 메소드로 썼습니다. withdraw는 파라미터로 출금할 액수 amount를 받고, 성공 여부를 나타내는 불린 값을 리턴해줍니다.

    마지막으로 '계좌 이체' 기능은 transfer 메소드로 썼습니다. transfer은 파라미터를 두 개 받습니다:

    첫 번째는 받을 사람을 나타내는 Person 타입의 to입니다.
    두 번째는 이체할 금액 amount입니다.
    다른 메소드들과 마찬가지로 리턴 값은 성공 여부를 나타내는 불린 값입니다.

    지금은 메소드에 아무 내용이 없고, 따라서 리턴 타입을 지키지 못했기 때문에 오류가 나오는데요. 실제로 내용을 채워넣는 것은 인스턴스 강의 후에 하겠습니다.
     */
}
