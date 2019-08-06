package arr;

public class Bank {

    private String title;

    public String getTitle(){
        return title;
    }
    public Bank (String title){
        this.title = title;
    }



    public class Account {
private  double balance;
private long number;

        public long getNumber() {
            return number;
        }

        public double getBalance() {
            return balance;
        }
        public Account (long number){
            this.number = number;
        }

        public void Deposit (double summa){
            balance +=summa;
        }

        public boolean Withdraw(double summa){
if (balance < summa) return false;
balance -= summa;
return true;
        }

        public void show()
        {
            System.out.printf("%s, %d, %g", title, getNumber(),getBalance());
        }

    }
}

