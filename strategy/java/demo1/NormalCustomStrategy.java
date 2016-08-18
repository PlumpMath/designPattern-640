public class NormalCustomStrategy implements Strategy
{
    public double caclPrice(double goodsPrice)
    {
        System.out.println("新客户没有优惠");
        return goodsPrice;
    }

}