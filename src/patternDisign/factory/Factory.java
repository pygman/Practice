package patternDisign.factory;

import patternDisign.factory.bean.BeanA;
import patternDisign.factory.bean.BeanB;
import patternDisign.factory.bean.BeanOther;

/**
 * Created by pygmalion on 2014/11/11.
 */
public class Factory {
    public static IBean creator(String which){
        if(which.equals("A")){
            return new BeanA();
        }else if(which.equals("B")){
            return new BeanB();
        }else{
            return new BeanOther();
        }
    }
}
