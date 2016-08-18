public class Client
{
    public static void main(String[] args)
    {
        Price ctx = new Price();
        double price = 1000.00;
        double quote = 0;

        Strategy strategy = new LargeCustomStrategy();
        ctx.setStrategy(strategy);
        quote = ctx.quote(price);
        System.out.println("大客户客户价格:"+quote);

        strategy = new OldCustomStrategy();
        ctx.setStrategy(strategy);
        quote = ctx.quote(price);
        System.out.println("老客户客户价格:"+quote);

        strategy = new NormalCustomStrategy();
        ctx.setStrategy(strategy);
        quote = ctx.quote(price);
        System.out.println("普通客户客户价格:"+quote);
    }
}