public class BankTransaction implements Runnable{

    private BankAccount account;
    private double amount;
    private boolean isWithdrawal;

    public BankTransaction(BankAccount account, boolean isWithdrawal, double amount) {
        this.account = account;
        this.isWithdrawal = isWithdrawal;
        this.amount = amount;
    }

    public void run() {
        if (isWithdrawal) {
            account.withdraw(amount);
        } else {
            account.deposit(amount);
        }
    }

}
