public class Gcd {
    public static void main(String[] args) {
        int a=120,b=60;
        int dsor=a,div=b,rem=1;

        while(rem!=0)
        {
            rem=div%dsor;
            div=dsor;
            dsor=rem;
        }
        System.out.println(div);
    }
}
