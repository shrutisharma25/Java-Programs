import java.util.Arrays;
class SumOfRows
{
    public static void main(String args[])
    {
        int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
        int res[][]=new int[a.length][1];
        for(int i=0;i<a.length;i++)
        {
            int sum=0;
            for(int j=0;j<a[i].length;j++)
            {
                sum=sum+a[i][j];
            }
            res[i][0]=sum;
        }
        for(int i=0;i<res.length;i++)
        {
            System.out.println(Arrays.toString(res[i]));
        }
    }
}