class  LagestWordInAString
{
    public static void main(String args[])
    {
        String str="ajhgfb hdmbh gjs";
        String[] s=str.split(" ");
        String res=s[0];
        int max=res.length();
        for(int i=0;i<s.length;i++)
        {
            if(s[i].length()>max){
                max=s[i].length();
                res=s[i];
            }
        }
        System.out.println(res);
    }
}