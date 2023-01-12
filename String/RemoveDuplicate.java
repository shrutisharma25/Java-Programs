class RemoveDuplicates
{
    public static void main(String args[])
    {
        String str="hello";
        String s="";
        for(int i=0;i<str.length();i++)
        {
            int c=0;
            for(int j=i+1;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                   c=1;
                   i++;
                  // continue;
                }
            }
            if(c==0)
            {
               s=s+str.charAt(i);
            }
        }
        System.out.println(s);
    }
}
