public class PythagoreanTriplets {
    public static void main(String[] args) {
        int a=5,b=12,c=13;
        int max=a>b  ? a>c?a:b : b>c?b:c;
        if(max==a)
        {
            boolean flag=((b*b)+(c*c))==(a*a);
            System.out.println(flag);
        }
        else if(max==b)
        {
            boolean flag=((a*a)+(c*c))==(b*b);
            System.out.println(flag);
        }
        else
        {
            boolean flag=((b*b)+(a*a))==(c*c);
            System.out.println(flag);
        }
    }
}
