package zadanie12;

class BankAccount {
    protected int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void deposit(int sum) {
        balance += sum;
    }

    public void withdraw(int sum) {
        balance -= sum;
    }

    public void showBalance() {
        System.out.println("Баланс: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(int balance) {
        super(balance);
    }

    public void addInterest() {
        balance += 100;
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(int balance) {
        super(balance);
    }
}

class FixedDepositAccount extends BankAccount {
    public FixedDepositAccount(int balance) {
        super(balance);
    }

    public void withdraw(int sum) {
        System.out.println("Снятие запрещено");
    }
}

class Bank {
    private BankAccount[] accounts;
    private int count;

    public Bank(int size) {
        accounts = new BankAccount[size];
    }

    public void add(BankAccount a) {
        accounts[count++] = a;
    }

    public void showAll() {
        for (int i = 0; i < count; i++) {
            accounts[i].showBalance();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Bank b = new Bank(3);
        b.add(new SavingsAccount(1000));
        b.add(new CurrentAccount(2000));
        b.add(new FixedDepositAccount(5000));
        b.showAll();
    }
}
