public class even_odd_digits {
    public static void main(String args[])
    {
        int num = 12345;
        int c = 0;
        while(num!=0)
        {
            num = num/10;
            c++;
        }
        if(c%2==0)
        {
            System.out.println("Even digits");
        }
        else {
            System.out.println("Odd digits");
        }
    }
}
