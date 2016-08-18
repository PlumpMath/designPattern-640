public class Price
{
    private Strategy strategy = null;

    public void setStrategy(Strategy strategy)
    {
        this.strategy = strategy;
    }

    public double quote(double goodsPrice)
    {
        return this.strategy.caclPrice(goodsPrice);
    }
}