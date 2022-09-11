package src.main.java;
import java.util.LinkedList;
public class OrderList
{
    public static void main(String[] args)
    {
        LinkedList<String> order_Item = new LinkedList<String>();
        order_Item.add("Chocolate");
        order_Item.add("Perfume");
        order_Item.add("wine");
        order_Item.add("Sunglass");
        order_Item.add("Bracelet");
        order_Item.add("Hat");
        for(int i =0; i < order_Item.size(); i++)
            System.out.println(order_Item.get(i));
           }
}
