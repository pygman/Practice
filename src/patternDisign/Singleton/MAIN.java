package patternDisign.Singleton;

/**
 * Created by pygmalion on 2014/11/11.
 */
public class MAIN {
    public static void main(String[] args) {
        SingletonENUM singletonENUM=SingletonENUM.INSTANCE.INSTANCE;
        System.out.println(singletonENUM.hashCode());
        SingletonENUM singletonENUM1=SingletonENUM.INSTANCE.INSTANCE;
        System.out.println(singletonENUM1.hashCode());
        SingletonENUM singletonENUM2=SingletonENUM.INSTANCE.INSTANCE;
        System.out.println(singletonENUM2.hashCode());
    }
}
