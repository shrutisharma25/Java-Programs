class PrimeFactorization {
    public static void main(String[] args) {
        int n=46;
        for(int i=2;i*i<=n;i++)
        {
            while(n%i==0)
            {
                n=n/i;
                System.out.print(i +" ");
            }
        }
        if(n!=1)
        {
            System.out.println(n);
        }
    }    
}
