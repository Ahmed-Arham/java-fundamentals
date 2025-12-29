class Account {
    private double balance;

    public void setBalance(double b) {
        balance = b;
    }

    public double getBalance() {
        return balance;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setBalance(5000);
        System.out.println("Balance: " + acc.getBalance());
    }
}

