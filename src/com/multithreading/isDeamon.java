package com.multithreading;

public class isDeamon extends Thread
{
    @Override
    public void run() {
        System.out.println("deamon");
    }

    public static void main(String[] args)
    {
        System.out.println("we a re ok");
            isDeamon a = new isDeamon();
            a.setDaemon(true);
            a.start();
    }

}
