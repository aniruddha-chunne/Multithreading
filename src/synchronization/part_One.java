package synchronization;

import com.sun.source.tree.SynchronizedTree;
import org.w3c.dom.ls.LSOutput;

class Book
{
    int a = 10;
    int b;


    synchronized  public  void booking (int b)
    {
        a = a-b;
        if(a<=0)
        {
            System.out.println("Mo seat left");
        }
        else
        {
            System.out.println(a + "is remaining");
        }
    }

}


class Theater_Booking extends Thread
{
    int b;

    public Theater_Booking (int b)
    {
        this.b = b;
    }

//    public int getB() {
//        return b;
//    }
//
//    public void setB(int b) {
//        this.b = b;
//    }





    static Book e = new Book();

    @Override
    public void run()
    {
        System.out.println(b);
        e.booking(b);
    }
}

public class part_One
{

    public static void main(String[] args)
    {
        Theater_Booking d = new Theater_Booking(6);
//        d.setB(7);

        d.start();
        Theater_Booking e = new Theater_Booking(7);
//        e.setB(6);
        e.start();

    }
}
