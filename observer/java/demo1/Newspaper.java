/**
 * 报纸对象，具体的目标实现
 */
public class Newspaper extends Subject
{
    /**
     * 具体的内容
     */
    private String content;

    /**
     * 获取内容
     */
    public String getContent(){
        return this.content;
    }

    public void setContent(String content){
        this.content = content;
        //通知观察者
        notifyObservers();
    }
}