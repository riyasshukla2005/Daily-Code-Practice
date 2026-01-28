public class Palindrome_String {
    public static void main(String args[])
    {
        String str = "ABAC";
        String rev = "";
        int len = str.length();
        for(int i=len-1;i>=0;i--)
        {
            rev = rev + str.charAt(i);
        }
        if(rev.equals(str))
        {
            System.out.println("Palindrome string");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }
}
