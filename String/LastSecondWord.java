class LastSecondWord
{
    public static void main(String args[])
    {
        String str="ab hdskj gfhds";
        int c=0,start=0,end=0;
        for(int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i)==' ')
            {
                c++;
            }
            if(c==1 && str.charAt(i)==' ')
            {
                end=i;
            }
            if(c==2)
            {
                start=i+1;
                break;
            }
        }
        System.out.println("Last second word:-"+str.substring(start,end));
        System.out.println("Length of last second word:-"+str.substring(start,end).length());
    }
}