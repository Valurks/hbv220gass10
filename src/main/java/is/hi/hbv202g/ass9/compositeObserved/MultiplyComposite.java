package is.hi.hbv202g.ass9.compositeObserved;

import java.util.ArrayList;
import java.util.List;

public class MultiplyComposite implements Observer {

    private final List<MathExpression> children = new ArrayList<>();
    private int result;

    public int getResult() {
        result = 1;
        for (MathExpression child : children) {
            result *= child.getResult();
        }
        return result;
    }

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
        getResult();
    }

    public int getLastObservedResult() {
        return result;
    }
}
