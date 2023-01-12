class NoOfWords
{
    public static void main(String args[])
    {
        String str="Hello world";
                                      //Without split() function
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                count++;
            }
        }
        System.out.println("No of words:-"+(count+1));
                                      //With split() function
        String result[]=str.split(" ");
        System.out.println("No of words:-"+result.length);
    }
}