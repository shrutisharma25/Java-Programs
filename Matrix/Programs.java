/*
     1.Sum of all 2D array
     2.Sum of First row elements
     3.Sum of First column elements
     4.Count even and odd no. in 2D array
     5.Sum of left diagonal elements
     6.Sum of right diagonal elements
*/
import java.util.Arrays;
class Programs{
    public static void main(String args[])
    {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        //Printing the 2D array
        for(int i=0;i<a.length;i++)
        {
            System.out.println(Arrays.toString(a[i]));
        }
        //Sum of 2D Array
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                sum=sum+a[i][j];
            }
        }
        System.out.println("Sum of all the elements:-"+sum);
        //Sum of first row elements
        sum=0;
        for(int i=0;i<1;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                sum=sum+a[i][j];
            }
        }
        System.out.println("Sum of first row elements:-"+sum);
        //Sum of first column elements
        sum=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<1;j++)
            {
                sum=sum+a[i][j];
            }
        }
        System.out.println("Sum of first column elements:-"+sum);
        //No of even elements and odd elements in an array
        int even=0,odd=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                if(a[i][j]%2==0)
                even++;
                else
                odd++;
            }
        }
        System.out.println("No of even elements:-"+even);
        System.out.println("no of odd elements:-"+odd);
        // Sum of left diagonal elements
        sum=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                if(i==j)
                sum=sum+a[i][j];
            }
        }
        System.out.println("Sum of left diagonal elements:-"+sum);
        //Sum of right diagonal elements
        sum=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                if((i+j)==(a.length-1))
                {
                   sum=sum+a[i][j];
                }
            }
        }
        System.out.println("Sum of right diagonal elements:-"+sum);                             
    }
}