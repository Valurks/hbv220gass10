package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Composite implements MathExpression, Observer {

    protected final List<MathExpression> children = new ArrayList<>();
    protected int lastObservedResult;

    public void add(MathExpression mathExpression) {
        children.add(mathExpression);
    }

    public void remove(MathExpression mathExpression) {
        children.remove(mathExpression);
    }

    public List<MathExpression> getChildren() {
        return children;
    }

    public void update() {
        lastObservedResult = getResult();
        System.out.println("New value observed: " + lastObservedResult);
    }

    public int getLastObservedResult() {
        return lastObservedResult;
    }

    public final int getResult() {
        int result = startingValue();
        for (MathExpression child : children) {
            result = calculate(result, child.getResult());
        }
        return result;
    }

    protected abstract int startingValue();

    protected abstract int calculate(int result, int value);
}
