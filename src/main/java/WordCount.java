import java.util.ArrayList;
import java.util.List;

public class WordCount
{
    public static void main(String[] args)
    {
        String quote = "Your dreams are only your dreams until you write them down then they are goals";
        ArrayList<String> al = new ArrayList(List.of(quote.split(" ")));
        int words = al.size();
        System.out.println(words);
    }
}
