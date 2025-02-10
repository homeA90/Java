package chapter_6.Example_08;

public class BankDriver {
    public static void main(String[] args) {

        // 사람 선언
//        Person p1 = new Person();
//        p1.name = "김신의";
//        p1.age = 28;
//        p1.cashAmount = 30000;
//        p1.setName("김신의");
//        p1.setAge(28);
//        p1.setCashAmount(30000);
        Person p1 = new Person("김신의", 28);
        p1.setCashAmount(30000);

        // 은행 계좌 생성
//        BankAccount a1 = new BankAccount();
//        a1.balance = 100000;
//        a1.setBalance(100000);
        BankAccount a1 = new BankAccount(p1);
        p1.setAccount(a1);
        a1.setBalance(100000);


        // 사람과 계좌 연동
//        p1.account = a1;
//        a1.owner = p1;
//        p1.setAccount(a1);
//        p1.setOwner(a1);


        // 수강생 이름
//        Person p2 = new Person();
//        p2.setName("강지훈");
//        p2.setAge(34);
//        p2.setCashAmount(100000);
        Person p2 = new Person("강지훈", 34, 100000);

        // 수강생 계좌 생성
//        BankAccount a2 = new BankAccount();
//        a2.setBalance(500000);
        BankAccount a2 = new BankAccount(500000, p2);
        p2.setAccount(a2);

//        p2.setAccount(a2);
//        a2.setOwner(p2);


        // 실행
//        a2.deposit(30000);
//        a2.withdraw(170000);
//        a2.deposit(620000);
//        a2.withdraw(890000);
//        a1.transfer(p2,10000);
        a2.transfer(a1, 200000);
        a1.transfer(p2, 150000);
        p2.transfer(a1, 270000);
        p1.transfer(p2, 130000);
    }
}
