package patternDisign.proxy;

/**
 * Created by pygmalion on 2014/11/13.
 */
public class ProxyObject extends AbstractObject {
    RealObject realObject=new RealObject();
    @Override
    public void opration() {
        System.out.println("before");
        realObject.opration();
        System.out.println("after");
    }
}
