import java.util.Scanner;
class Prime
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int c=0;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }       
        if(c==0 && n!=1)
            System.out.println("Prime No."); 
        else
            System.out.println("Not a Prime no");
    }
}