public class patten2 {
    public static void pattern()
    {
        for(int i=5;i>=1;i--)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        pattern();
    }
}
