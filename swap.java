public class swap {
    public static void main(String args[])
    {
        int a = 1;
        int b = 2;
        System.out.println("Before swapping :"+a+" "+b);
        //using third variable
        int temp = a;
        a  =  b;
        b = temp;
        System.out.println("After swappig: "+a+" "+b);

        //without using third variable
        int a1 = 1;
        int b1 = 2;
        System.out.println("Before swapping: "+a1+" "+b1);
        a1 = a1+b1;
        b1 = a1-b1;
        a1 = a1-b1;
        System.out.println("After swapping: "+a1+" "+b1);

    }
}
