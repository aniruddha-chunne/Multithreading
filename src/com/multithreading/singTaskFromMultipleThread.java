package com.multithreading;

public class singTaskFromMultipleThread extends Thread
{
    @Override
    public void run() {
        for(int i=0; i<10; i++)
        {
            System.out.println(i);

        }
    }

    public static void main(String[] args)
    {

        singTaskFromMultipleThread one = new singTaskFromMultipleThread();
        singTaskFromMultipleThread two = new singTaskFromMultipleThread();


        one.start();
        two.start();



    }


}
