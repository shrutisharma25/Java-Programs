import java.util.Scanner;
public class CountDigit {
    public static void main(String[] args) {
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the no. whose digits are to be counted:-");
            int n=sc.nextInt();
            sc.close();
            int c=0;
            while(n!=0)
            {
                n=n/10;
                c++;
            }
            System.out.println("No of Digits-->"+c);
        }
    }    
}
