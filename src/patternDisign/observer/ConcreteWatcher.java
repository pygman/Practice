package patternDisign.observer;

/**
 * Created by pygmalion on 2014/11/11.
 */
public class ConcreteWatcher implements Watcher {
    @Override
    public void update(String str) {
        System.out.println(str);
    }
}
