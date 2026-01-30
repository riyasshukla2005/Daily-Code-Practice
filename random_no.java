import java.util.Random;
import java.util.random.*;
public class random_no {
    public static void main(String args[])
    {   //Method 1: random() function
        Random ran = new Random();
        double num = ran.nextInt(100) + 1;
        System.out.println(num);

        //Method 2- using Math.random()
        double n = Math.random(); //double value will be generated
        System.out.println(n);

        int a = (int)(Math.random()*100)+1;
        System.out.println(a);
    }
}
