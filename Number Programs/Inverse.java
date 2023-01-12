class Inverse
{
    public static void main(String[] args) {
        int n=21453;
        int p=1,d=0,num=0;
        while(n!=0)
        {
            d=n%10;  
            num=num+ p*(int)Math.pow(10,d-1);
            p++;
            n=n/10;
        }
        System.out.println(num);
    }
}