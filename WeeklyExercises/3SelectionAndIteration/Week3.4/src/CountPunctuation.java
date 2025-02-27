public class CountPunctuation
{
    public static void main (String args[])
    {

        int count = 0;
        String str = "“Mary had a little lamb, her fleece was as white as snow, and everywhere Mary went, the lamb was sure to go. -that was a nice poem- the end. ”";
        for (int i = 0; i < str.length(); i++)
        {

            if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||  str.charAt(i) == '?' || str.charAt(i) == '-' ||
                    str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':' || str.charAt(i) == '“' || str.charAt(i) == '”' )
            {
                count++;
            }
        }
        System.out.println("The number of punctuations exists in the string is: " +count);

    }
}
