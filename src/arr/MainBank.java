package arr;

public class MainBank {
    public static void main(String[] args) {
        Bank bank = new Bank("Sber");
        Bank.Account acc1 = bank.new Account(123);
        acc1.show();
acc1.Deposit(100);
    }
}
