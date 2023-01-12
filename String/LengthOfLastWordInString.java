class LengthOfLastWordInString
{
    public static void main(String args[])
    {
        String str="Hello world";
                                      //Without split() function
        int c=0;
        for(int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i)==' ')
            {
                break;
            }
            c++;
        }
        System.out.println("Length of Last word:-"+c);
        
        System.out.println("------------------------");
                                      //With split() function
        String result[]=str.split(" ");
        System.out.println("Length of Last word:-"+result[(result.length)-1].length());
    }
}