class SquareStar
{
    public static void main(String args[])
    {
        int n=8,r=22;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=r;j++)
            {
                if(i==1 || i==n || j==1 || j==r)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}