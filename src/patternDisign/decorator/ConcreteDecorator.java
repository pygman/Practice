package patternDisign.decorator;

/**
 * Created by pygmalion on 2014/11/13.
 */
public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addBehavior();
    }
    private void addBehavior(){
        System.out.println("I am Added");
    }
}
