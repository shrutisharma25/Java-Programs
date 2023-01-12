import java.util.Scanner;
class Increase1ToMiddleElement
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:-");
        int n=sc.nextInt();
        int temp=n;
        int c=0;
        while(temp!=0)
        {
            temp=temp/10;
            c++;
        }
            int middle=c/2;
            n=n+(int)Math.pow(10,middle);
            System.out.println(n);
    }
}