package com.multithreading;

class one extends Thread
{
    @Override
    public void run() {
        for(int i=0; i<10; i++)
        {
            System.out.println("Running Task 1");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class two extends Thread
{
    @Override
    public void run() {
        for(int i=0; i<10; i++)
        {
            System.out.println("222***22**2");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Priority
{
    public static void main(String[] args)
    {
        one a = new one();
        two b = new two();

        a.setPriority(Thread.MAX_PRIORITY);
        b.setPriority(Thread.MIN_PRIORITY);

        a.start();
        b.start();
    }
}
