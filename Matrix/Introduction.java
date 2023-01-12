import java.util.Arrays;
class Introduction
{
    public static void main(String args[])
    {
        int[][] num=new int[3][3];
        num[0][0]=1;
        num[0][1]=2;
        num[0][2]=3;
        num[1][0]=4;
        num[1][1]=5;
        num[1][2]=6;
        num[2][0]=7;
        num[2][1]=8;
        num[2][2]=9;
        
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        System.out.println("--------------");
        System.out.println(Arrays.toString(num[0]));
        System.out.println(Arrays.toString(num[1]));
        System.out.println(Arrays.toString(num[2]));
        System.out.println("--------------");
        System.out.println("Length Of 2D Array:-"+num.length);
        System.out.println("--------------");
        System.out.println("Printing 2D array with single loop:-");
        for(int i=0;i<num.length;i++)
        {
            System.out.println(Arrays.toString(num[i]));
        }
        System.out.println("--------------");
        System.out.println("Printing 2D array with nested loop:-");
        for(int i=0;i<num.length;i++)
        {
            for(int j=0;j<num[i].length;j++)
            {
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
        //how to vary the length of outer Array
         int a[][]={{1,2,3},{4,5},{6,7,8,9}};  
         System.out.println("--------------");
        System.out.println("Printing 2D array whose inner array length varies:-");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}