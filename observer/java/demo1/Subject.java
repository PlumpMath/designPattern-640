import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象
 */
public class Subject
{
    /**
     * 保存注册的观察者对象
     */
    private List<Observer> readers = new ArrayList<Observer>();

    /**
     * 注册观察者
     */
    public void attach(Observer reader){
        readers.add(reader);
    }

    /**
     * 取消观察者
     */
    public void detach(Observer reader){
        readers.remove(reader);
    }

    /**
     * 通知观察者
     */
    protected void notifyObservers() {
        for (Observer reader : readers ) {
            reader.update(this);
        }
    }
}