package patternDisign.proxy;

/**
 * Created by pygmalion on 2014/11/13.
 */
public class TestProxy {
    public static void main(String[] args) {
        AbstractObject obj=new ProxyObject();
        obj.opration();
    }
}
