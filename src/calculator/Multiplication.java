package calculator;

import operations.IOperable;

public class Multiplication implements IOperable {
    public Multiplication() {

    }
    //@Override
    //public boolean checkIsOperable(float f1, float f2) {
    //    return false;
    //}

    @Override
    public float getCalculateResult(float f1, float f2) {
        return f1 * f2;
    }
}
