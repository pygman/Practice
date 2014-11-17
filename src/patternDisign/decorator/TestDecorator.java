package patternDisign.decorator;

/**
 * Created by pygmalion on 2014/11/13.
 */
public class TestDecorator {
    public static void main(String[] args) {
        ConcreteDecorator concreteDecorator=new ConcreteDecorator(new ConcreteComponent());
        concreteDecorator.operation();
    }
}
