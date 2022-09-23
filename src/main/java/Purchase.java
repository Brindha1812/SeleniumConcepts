

public class Purchase extends OrderList
{
    public static void main(String[] args)
    {
        int PurchaseList;
        int TotalAmount;
        int ChocolatePrice = 100;
        int PerfumePrice = 200;
        int SunglassPrice = 88;
        int HatPrice = 50;
        int WinePrice = 98;
        int BraceletPrice = 400;
        System.out.println("Thea Purchase List is Perfume, Chocolate, Hat, Bracelet, Sunglass");
        TotalAmount = PerfumePrice+ SunglassPrice + HatPrice + BraceletPrice + ChocolatePrice;
        System.out.println("The Purchase Amount is :  " + TotalAmount);

    }
}
