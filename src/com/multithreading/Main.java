package com.multithreading;

class lead implements Runnable
{
    @Override
    public void run() {
        System.out.println("this is thread");
    }
}


public class Main
{

    public static void main(String[] args)
    {
        lead l = new lead();

        Thread t = new Thread(l);
        t.start();
    }


}
