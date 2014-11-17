package patternDisign.decorator;

/**
 * Created by pygmalion on 2014/11/13.
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("ConcreteComponent.opration");
    }
}
