public class LargeCustomStrategy implements Strategy
{
    public double caclPrice(double goodsPrice)
    {
        System.out.println("大客户优惠10%");
        return goodsPrice * (1-0.1);
    }

}