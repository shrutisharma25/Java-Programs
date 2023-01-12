import java.util.Scanner;
public class CircularPrime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no to be checked:-");
        int n= sc.nextInt();
        sc.close();
        int rotate=0, temp=n;
        while(temp!=0)
        {
            rotate++;
            temp=temp/10;
        }
        System.out.println(rotate);
    }
}
