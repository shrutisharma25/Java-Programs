public class SunnyNo {
    public static void main(String[] args) {
        int n=8,c=0;
        for(int i=1;i<=n;i++)
        {
            int s=(i*i)-1;
            if(s==n)
            {
                c++;
                break;
            }
        }
        if(c==1)
        {
        System.out.println("Sunny no."); 
        }
        else
        {
        System.out.println("Not a Sunny no.");
        }
    }
}
