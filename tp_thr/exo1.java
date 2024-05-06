public class exo1 {
    public static void main(String[] args) {
        CounterThread process1 = new CounterThread();
        CounterThread process2 = new CounterThread();
        process1.run();
        process2.run();
    }
}

