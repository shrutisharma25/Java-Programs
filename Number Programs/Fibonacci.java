import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0,b=1,c=0;
        System.out.println("Enter the no. of times series will print:-");
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++)
        {
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;            
        }
    }
}
