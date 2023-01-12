import java.util.Arrays;
class SpiralPattern
{
    public static void main(String args[])
    {
        int a[][]=new int [5][5];
        int i=0,j=0,c=1;
        int row=5,col=5;
        int k=a.length;
        for(i=0;i<k;i++)
        {
            for(j=0;j<k;j++)
            {
                a[i][j]=c;
                c++;
                i++;
            }
            i--;
        }
        for(k=0;k<a.length;k++)
        {
           System.out.println(Arrays.toString(a[k]));
        }
    }
}