import java.util.Arrays;
class SumOfColoums
{
    public static void main(String args[])
    {
        int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
        int res[][]=new int[1][a.length];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                if(i==0)
                {
                    res[0][j]=res[0][j]+a[i][j];
                }
                if(i==1)
                {
                    res[0][j]=res[0][j]+a[i][j];
                }
                if(i==2)
                {
                    res[0][j]=res[0][j]+a[i][j];
                }
            }
        }
        for(int i=0;i<res.length;i++)
        {
            System.out.println(Arrays.toString(res[i]));
        }
    }
}