public class RotateOfNumber 
    {
        public static void main(String[] args) {
            int num=12345,newNum=0;
            int n=-1,rem=0,d=0;
            int temp=num;
            int first=0,last=0;
            while(temp>0)
            {
                temp=temp/10;
                d++;
            }
            n=n%d;
            if(n<0)
            {
                n=n+d;
            }
            rem=num%(int)Math.pow(10,n);  //12345%(10^2)=45
            first=rem*(int)Math.pow(10,(d-n));   //45*10^5-3 =45*10^3 =45000
            last=num/(int)Math.pow(10,n);
            newNum=first+last;
            System.out.println(newNum);
        }
    }
    /*
          12345   2
          45* 10^5-2 ;
          12345/10^2
     */
