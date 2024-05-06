public class exo2 implements Runnable {
    public static void main(String[] args) {
        CounterThread2 process1 = new CounterThread2();
        CounterThread2 process2 = new CounterThread2();

        var th1 = new Thread(process1);
        var th2 = new Thread(process2);

        th1.start();
        th2.start();

    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Unimplemented method 'run'")
    }
}



