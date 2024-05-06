public class exo2 implements Runnable {
    public static void main(String[] args) {
        Counter process1 = new Counter();
        Counter process2 = new Counter();
        Thread thread1 = new Thread(process1);
        Thread thread2 = new Thread(process2);
        thread1.start();
        thread2.start();
    }
}



