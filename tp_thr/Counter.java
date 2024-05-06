public class Counter implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++)
        {
            try {
                Thread.sleep(500l);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
