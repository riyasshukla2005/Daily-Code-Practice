public class fibonacci_series
{
    public static void main(String args[])
    {
        int a = 0;
        int b = 1;
        System.out.print(a+" "+b);
        for(int i=0;i<=10;i++)
        {
            int sum = a+b;
            System.out.print(" "+sum+" ");
            a = b;
            b = sum;
        }
        
    }
}
    