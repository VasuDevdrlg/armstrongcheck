class demo 
{
    public static void main(String[]args) 
    {   int y=0;
        int x=407;
        String str=String.valueOf(x);
        int size=str.length();
        for(int i=0;i<size;i++)
        {
            char ch=str.charAt(i);
            int num=Character.getNumericValue(ch);
            int z=(int) Math.pow(num,size);
            y+=z;
        }
        String s=((x==y)?"its Armstrong":"its not armstrong");
        System.out.println(s);
    }
}