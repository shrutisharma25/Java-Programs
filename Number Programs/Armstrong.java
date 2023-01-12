import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. to be checked-->");
        int n=sc.nextInt();
        sc.close();
        int temp=n,rem=0,s=0;
        while(temp!=0)
        {
            rem=temp%10;
            s=s+(rem*rem*rem);
            temp=temp/10;
        }
        if(n==s)
             System.out.println("Armstrong no.");
        else
             System.out.println("Not a Armstrong no.");
    }
}
