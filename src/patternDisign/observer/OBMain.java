package patternDisign.observer;

/**
 * Created by pygmalion on 2014/11/11.
 */
public class OBMain {
    public static void main(String[] args) {

        Watched girl=new ConcreteWatched();

        Watcher watcher1=new ConcreteWatcher();
        Watcher watcher2=new ConcreteWatcher();
        Watcher watcher3=new ConcreteWatcher();
        girl.addWatcher(watcher1);
        girl.addWatcher(watcher2);
        girl.addWatcher(watcher3);

        girl.notifyWatchers("开心");
        girl.notifyWatchers("难过");

    }
}
