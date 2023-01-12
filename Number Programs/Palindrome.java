import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. to be checked-->");
        int n=sc.nextInt();
        sc.close();
        int temp=n,rem=0,no=0;
        while(temp!=0)
        {
            rem=temp%10;
            no=(no*10)+rem;
            temp=temp/10;
        }
        if(no==n)
            System.out.println("Palindrome No.");
        else
            System.out.println("Not A Palindrome No.");
    }
}
