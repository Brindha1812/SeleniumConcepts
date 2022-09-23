public class Palindrome
{
    public static void main(String[] args)
    {
        String name = "malayalam";
        String revName = "";
        System.out.println("Reversed Name :  " + new StringBuffer(name).reverse());

        for( int i = name.length() - 1; i >= 0; i--)
        {
            revName += name.charAt(i);
        }
        System.out.println(revName);
    }
}
