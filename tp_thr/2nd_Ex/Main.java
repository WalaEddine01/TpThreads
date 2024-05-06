public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        Thread withdrawThread1 = new Thread(new BankTransaction(account, true, 500));
        Thread depositThread1 = new Thread(new BankTransaction(account, false, 600));
        Thread depositThread2 = new Thread(new BankTransaction(account, false, 300));

        withdrawThread1.start();
        depositThread1.start();
        depositThread2.start();

    }
}
