import java.util.Arrays;
class TransposeOfMatrix
{
    public static void main(String args[])
    {
        int rows=3,cols=3;
        int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
        int t[][]=new int[cols][rows];
        for(int i=0;i<t.length;i++)
        {
            for(int j=0;j<t[i].length;j++)
            {
                t[i][j]=a[j][i];
            }
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println(Arrays.toString(a[i]));
        }
        for(int i=0;i<t.length;i++)
        {
            System.out.println(Arrays.toString(t[i]));
        }
    }
}