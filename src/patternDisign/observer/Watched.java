package patternDisign.observer;

/**
 * Created by pygmalion on 2014/11/11.
 */
public interface Watched {
    public void addWatcher(Watcher watcher);
    public void removeWatcher(Watcher watcher);
    public void notifyWatchers(String str);
}
