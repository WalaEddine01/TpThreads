public class CounterThread extends Thread{        
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++)
        {
            try {
                sleep(20l);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
