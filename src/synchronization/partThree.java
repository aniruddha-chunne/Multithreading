package synchronization;

import com.sun.source.tree.SynchronizedTree;
import org.w3c.dom.ls.LSOutput;

class Book2
{
    static int a = 20;
    int b;

    synchronized  static public  void booking (int b)
    {
        a = a-b;
        if(a<1)
        {
            System.out.println("Mo seat left");
        }
        else
        {
            System.out.println(a + "is remaining");
        }
    }
}


class Theater_Booking2 extends Thread
{
    int b;
    static Book e;

    public Theater_Booking2 (int b, Book e)
    {
        this.e = e;
        this.b = b;
    }

    @Override
    public void run()
    {
        System.out.println(b);
        e.booking(b);
    }
}

class Theater_Booking21 extends Thread
{
    int b;
    static Book e;

    public Theater_Booking21 (int b, Book e)
    {
        this.e = e;
        this.b = b;
    }

    @Override
    public void run()
    {
        System.out.println(b);
        e.booking(b);
    }
}

public class partThree
{

    public static void main(String[] args)
    {

         Book k = new Book();

        Theater_Booking2 d = new Theater_Booking2(6,k);
//        d.setB(7);

        d.start();
        Theater_Booking21 e = new Theater_Booking21(7,k);
//        e.setB(6);
        e.start();


        Book k2 = new Book();

        Theater_Booking2 f = new Theater_Booking2(6,k2);
//        d.setB(7);

        f.start();
        Theater_Booking21 g = new Theater_Booking21(7,k2);
//        e.setB(6);
        g.start();



    }
}
