package com.multithreading;

class Thread1 extends Thread
{
    @Override
    public void run() {

        for(int i=0; i<10; i++)
        {
            System.out.println("Running Task 1");
            try {
                Thread.sleep(200);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class Thread2 extends Thread
{
    @Override
    public void run() {
        for(int i=0; i<10; i++)
        {
            System.out.println("Running Task 2");

            try {
                Thread.sleep(200);

                System.out.println(Thread.currentThread().getName());
                System.out.println(Thread.currentThread().isAlive());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class multipleTaskFromMultipleThread
{

    public static void main(String[] args)
    {
        Thread1 one = new Thread1();
        one.setName("First Thread");

        Thread2 two = new Thread2();

        System.out.println(one.isAlive());

        one.start();
        two.start();

        System.out.println(one.isAlive());

    }




}
