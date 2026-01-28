import java.util.Scanner;
public class sum_of_digits {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();
        int digits;
        int sum = 0;
        while(n!=0)
        {
            digits = n%10;
            sum = sum + digits;
            n = n/10;
        }
        System.out.println(sum);
    }
}
