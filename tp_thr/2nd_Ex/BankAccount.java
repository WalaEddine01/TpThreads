public class BankAccount {
    private double balance = 0;

    public BankAccount(double balance){
        this.balance = balance;
    }

    public synchronized void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew $" + amount);
            System.out.println("New balance: $" + balance);
        } else {
            System.out.println(Thread.currentThread().getName());
        }
    }

    public synchronized void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(Thread.currentThread().getName() + " deposited $" + amount);
            System.out.println("New balance: $" + balance);
        } else {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
