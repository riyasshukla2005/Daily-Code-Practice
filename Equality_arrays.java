import java.util.Arrays;

public class Equality_arrays
{
    public static void main(String args[])
    {    //Method 1- using equals()
        int a[] = {1,2,3,4};
        int b[] = {1,2,3,4};
        boolean status = Arrays.equals(a,b);
        System.out.println(status);

        //Method 2- using loop
        boolean res = true;
        if(a.length==b.length)
        {
            for(int i=0;i<a.length;i++)
            {
                if(a[i]!=b[i])
                {
                    res = false;
                    System.out.println(res+" "+a[i]);
                }
                else {
                    res = true;
                    System.out.println(res+" "+a[i]);
                }
            }
        } System.out.println(res);
    }
}