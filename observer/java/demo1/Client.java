public class Client
{
    public static void main(String[] args) {
        //创建一个报纸，被视为观察者
        Newspaper subject = new Newspaper();
        //创建订阅者，也就是观察者
        Reader reader1 = new Reader();
        reader1.setName("张三");

        Reader reader2 = new Reader();
        reader2.setName("李四");

        Reader reader3 = new Reader();
        reader3.setName("王二");

        subject.attach(reader3);
        subject.attach(reader1);
        subject.attach(reader2);

        subject.setContent("本期内容是观察者");
    }
}