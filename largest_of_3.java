public class largest_of_3 {
    public static void main(String args[])
    {
        int a = 1;
        int b = 2;
        int c = 3;
        // if-else
            if(a>b && a>c)
            {
                System.out.println("a is largest "+a);
            }
            else if(b>c)
            {
                System.out.println("b is largest "+b);
            }
            else {
                System.out.println("c is largest "+c);
            }
            //ternary operator
            int d = a>b ? (a>c ? a:c) : (b>c ? b:c);
            System.out.println(d);
    }
}
