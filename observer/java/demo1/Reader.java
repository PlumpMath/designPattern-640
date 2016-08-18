public class Reader implements Observer
{
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void update(Subject subject) {
        System.out.println(name + "收到报纸了，内容是："+
            ((Newspaper)subject).getContent());
    }
}