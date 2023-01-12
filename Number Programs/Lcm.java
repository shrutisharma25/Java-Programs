public class Lcm {
    public static void main(String[] args) {
        int a=36,b=24,rem=1;
        int div=a,dsor=b;
        while(rem!=0)
        {
            rem=div%dsor;
            div=dsor;
            dsor=rem;
        }
        System.out.println( "GCD:-"+div);
        int lcm = (a*b)/div;
        System.out.println("LCM:-"+lcm);
    }
}
