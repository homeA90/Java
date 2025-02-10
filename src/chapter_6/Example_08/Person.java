package chapter_6.Example_08;

public class Person {
    private String name;
    private int age;
    private int cashAmount;
    private BankAccount account;

    // 생성자 설정
    public Person(String pName, int pAge) {
        name = pName;
        if (pAge < 0) {
            age = 12;
        } else {
            age = pAge;
        }
        cashAmount =0;
    }

    public Person(String pName, int pAge, int pCashAmount) {
        name = pName;
        if (pAge < 0) {
            age = 12;
        } else {
            age = pAge;
        }
        if (pCashAmount < 0) {
            cashAmount = 0;
        } else {
            cashAmount = pCashAmount;
        }
    }
    // 생성자도 메소드와 마찬가지로 오버로딩이 가능함


    // 나이 설정
    public void setAge(int newAge) {
        if (newAge >= 0) {
            age = newAge;
        }
    }

    // 나이 조회
    public int getAge() {
        return age;
    }

    // 이름 설정
    public void setName(String name) {
        this.name = name;
    }

    // 이름 조회
    public String getName() {
        return name;
    }

    // 현금 금액 설정
    public void setCashAmount(int newCashAmount) {
        if (newCashAmount >= 0) {
            cashAmount = newCashAmount;
        }
    }

    // 현금 금액 조회
    public int getCashAmount() {
        return cashAmount;
    }

    // 은행 계좌 설정
    public void setAccount(BankAccount newAccount) {
        account = newAccount;
    }

    // 은행 계좌 조회
    public BankAccount getAccount() {
        return account;
    }

    // 첫 번째 파라미터: 받는 사람 (Person)
    // 두 번째 파라미터: 이체할 금액 (정수)
    // 리턴 : 성공여부 (불린)
    public boolean transfer(Person to, int amount) {
        if (amount > 0 && amount <= account.getBalance()) {
            account.setBalance(account.getBalance() - amount);
            to.account.setBalance(to.account.getBalance() + amount);
            System.out.println("true - from: " + getName() + ", to: " + to.getName() + ", amount: " + amount + ", balance: " + account.getBalance());
            return true;
        } else {
            System.out.println("false - from: " + getName() + ", to: " + to.getName() + ", amount: " + amount + ", balance: " + account.getBalance());
            return false;
        }
        // Person에서는 BankAccount와 반대이다.
        // transfer(BankAccout to, int amount) 에선 받는 사람의 계정(to)의 balance를 amount 만큼 늘려줄수 있음
        // 하지만 메소드오버로딩 됐을 때 편히 쓰기 위해 아래와 같이 작성함

    }

    // 첫 번째 파라미터: 받는 사람의 계정 (BankAccount)
    // 두 번째 파라미터: 이체할 금액 (정수)
    // 리턴 : 성공여부 (불린)
    public boolean transfer(BankAccount to, int amount) {
        return transfer(to.getOwner(), amount);
    }
}
