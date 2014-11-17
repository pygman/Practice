package patternDisign.Singleton;

/**
 * Created by pygmalion on 2014/11/11.
 */
public class SingletonDoubleLock {
    private volatile static SingletonDoubleLock singletonDoubleLock;
    private SingletonDoubleLock(){}
    public static SingletonDoubleLock getSingletonDoubleLock(){
        if(singletonDoubleLock==null){
            synchronized(SingletonDoubleLock.class){
                if (singletonDoubleLock==null){
                    singletonDoubleLock=new SingletonDoubleLock();
                }
            }
        }
        return singletonDoubleLock;
    }
}
