class LastWordInString
{
    public static void main(String args[])
    {
        String str="Hello world";
                                      //Without split() function
        int count=0,index=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                count++;
                index=i+1;
            }
        }
        System.out.print("Last word Of string:- ");
        for(int i=index;i<str.length();i++)
        {
            System.out.print(str.charAt(i));// can do it without loop by substring 
        }
        System.out.println();
        System.out.println("-----------------------");
                                      //With split() function
        String result[]=str.split(" ");
        System.out.println("Last word Of string:-"+result[result.length-1]);
    }
}