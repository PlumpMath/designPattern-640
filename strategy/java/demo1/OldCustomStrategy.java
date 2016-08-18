public class OldCustomStrategy implements Strategy
{
    public double caclPrice(double goodsPrice)
    {
        System.out.println("老客户优惠5%");
        return goodsPrice * (1-0.05);
    }

}