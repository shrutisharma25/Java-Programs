import java.util.Scanner;
class StringPalindrome
{
    public static boolean check(String str)
    {
        String s="";
        for(int i=str.length()-1;i>=0;i--)
        {
            s=s+str.charAt(i);
        }
        if(str.equals(s))
        return true;
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(check(s));
    }
}