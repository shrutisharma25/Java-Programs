import java.util.Scanner;
public class DigitsOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no-->");
        int n=sc.nextInt();
        int no=n;
        sc.close();
        int rem=0,c=0;
        while(no!=0)
        {
            no=no/10;
            c++;
        }
        System.out.println(c);
        while(n!=0)
        {
            rem=n/(10^(c-1));
            System.out.println(rem);
            n=n%(10^(c-1));
            c--;
        }
    }    
}
