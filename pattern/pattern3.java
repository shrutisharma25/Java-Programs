public class pattern3 {
        public static void pattern()
        {
            int n=4;
            for(int i=1;i<=n;i++)
            {
                for (int j=1;j<=n;j++)
                {
                    if((i+j)<=n)
                    {
                        System.out.print(" "+" ");
                    }
                    else
                    {
                        System.out.print("*"+" ");
                    }
                }
                
                System.out.println();
            }
        }
        public static void main(String args[]) {
            pattern();
        }
}