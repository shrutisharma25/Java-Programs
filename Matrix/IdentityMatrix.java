class IdentityMatrix
{
    public static void main(String args[])
    {
        int a[][]={{1,0,0},{0,1,0},{0,0,1}};
        int c=0;
        
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                if(i==j)
                {
                    if(a[i][j]!=1)
                    {
                        c=1;
                        break;
                    }
                }
            }
        }
        if(c==0)
        System.out.println("Identity Matrix");
        else
        System.out.println("Not an Identity Matrix");
    }
}