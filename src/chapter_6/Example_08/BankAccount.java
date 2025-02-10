package chapter_6.Example_08;


public class BankAccount {
    private int balance;
    private Person owner;

    // 생성자 설정
    public BankAccount(int Balance) {
        if (Balance >= 0) {
            this.balance = Balance;
        } else {
            this.balance = 0;
        }
    }

    public BankAccount(Person powner) {
        owner = powner;
    }

    public BankAccount(int balance, Person powner) {
        if (balance > 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
        owner = powner;
    }


    // 계좌 잔액 설정
    public void setBalance(int newBalance) {
        if (newBalance >= 0) {
            balance = newBalance;
        }
    }

    // 계좌 잔액 조회
    public int getBalance() {
        return balance;
    }

    // owner 설정
    public void setOwner(Person newOwner) {
        owner = newOwner;
    }

    // Onwer 조회
    public Person getOwner() {
        return owner;
    }


    // 파라미터 : 입금할 액수(정수)
    // 리턴 : 성공여부(불린)
    boolean deposit(int amount) {
        if (amount > 0 && amount <= owner.getCashAmount()) {
            balance += amount;
            owner.setCashAmount(owner.getCashAmount() - amount);
            System.out.println(amount + "원 입금하였습니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원\ntrue");
            return true;
        } else {
            System.out.println("입금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원\nfalse");
            return false;
        }

    }

    // 파라미터 : 출금할 액수(정수)
    // 리턴 : 성공여부(불린)
    boolean withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            owner.setCashAmount(owner.getCashAmount() + amount);
            System.out.println(amount + "원 출금하였습니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원\ntrue");
            return true;
        } else {
            System.out.println("출금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원\nfalse");
            return false;
        }
    }

    // 첫 번째 파라미터 : 받는 사람(Person)
    // 두 번재 파라미터 : 이체할 금액(정수)
    // 리턴 : 성공여부(불린)
    public boolean transfer(Person to, int amount) {
        return transfer(to.getAccount(), amount);
    }

    public boolean transfer(BankAccount to, int amount) {
        boolean success;
        if (amount > 0 && amount <= getBalance()) {
            setBalance(getBalance() - amount);
            to.setBalance(to.getBalance() + amount);
            success = true;
        } else {
            success = false;
        }
        System.out.println(success + " - from: " + owner.getName() + ", to: " + to.owner.getName() + ", amount: " + amount + ", balance: " + getBalance());

        return success;
    }


    // 여기서 중요한 포인트는 transfer(Person to, int amount) 에선 받는사람(to)의 balance를 amount 만큼 늘려줄수가 없음.
    // person class에 balance가 없기때문이다. 그래서 BankAccount에서 만든다음 오버로딩 된 한쪽 메소드를 다른한쪽에 가져와서 쓰는 형식으로 만듬.
}
