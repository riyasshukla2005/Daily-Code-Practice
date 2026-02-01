import java.util.Scanner;
public class square_root {
    public static void main(String args[])
    {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter a number: ");
    int n = sc.nextInt();
    int res = 0;
    for(int i=1;i<=n;i++)
    {
        if(i*i==n)
        {
            res = i;
            System.out.println("Square root: "+res);
        }
    }
    
}
}
