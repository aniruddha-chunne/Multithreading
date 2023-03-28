package synchronization;

class totalEarning extends Thread
{
    int total = 100;
    public void total()
    {

        synchronized (this)
        {

            for (int i = 0; i < 10; i++) {
                total = total + 100;

            }
        }

        this.notify();
    }

    @Override
    public void run() {
        for(int i=0; i<10;i++)
        {
            total  =  total +100;

        }
    }
}


public class inter_Thread_Communication
{
    public static void main(String[] args) throws InterruptedException {
                totalEarning t = new totalEarning();
                t.start();

                synchronized (t)
                {
                    t.wait();
                    System.out.println(t.total);
                }


    }
}
