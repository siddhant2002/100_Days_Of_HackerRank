class A
{
    static String catAndMouse(int x, int y, int z) {
        int i,j;
        String s="";
        if(Math.abs(z-x)==Math.abs(z-y))
        {
            s="Mouse C";
        }
        else 
        {
            if(Math.abs(z-x)>Math.abs(z-y))
            {
                s="Cat B";
            }
            else
            {
                s="Cat A";
            }
        }
        return s;
    }
    public static void main(String args[])
    {
        System.out.println(catAndMouse(2,3,4));
    }
}