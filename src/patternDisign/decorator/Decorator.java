package patternDisign.decorator;

/**
 * Created by pygmalion on 2014/11/13.
 */
public class Decorator implements Component {
    private Component component;
    public Decorator(Component component){
        this.component=component;
    }
    @Override
    public void operation() {
        component.operation();
    }
}
