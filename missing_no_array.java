public class missing_no_array {
    public static void main(String args[])
    {
        int sum = 0;
        int sums = 0;
        int a[] = {1,2,4};
        int x = 4;
        for(int i=0;i<a.length;i++)
        {   //mETHOD 1- direct method
            if(x==a[i])
                System.out.println("Found at "+a[i]);
            else
                System.out.println("Not Found");
        }
        //Method 2- sum
        for(int i=0;i<a.length;i++)
        {
            sum = sum + a[i];
        }
        System.out.println(sum);
        for(int i=1;i<=4;i++)
        {
            sums = sums + i;}
        System.out.println(sums);
        
        int res = sums - sum;
        System.out.println(res);

    }
    
}
