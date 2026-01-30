public class sum_of_elements_array {
    public static void main(String args[])
    {
        int arr[] = {0,1,2,2,3,4,5};
        int sum = 0;
        int len = arr.length;
        for(int i=0;i<len;i++)
        {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
