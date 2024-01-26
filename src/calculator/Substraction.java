package calculator;

import operations.IOperable;

public class Substraction implements IOperable {
    private float f1, f2;
    public Substraction () {
    }

    //@Override
    //public boolean checkIsOperable(float f1, float f2) {
    //    return false;
    //}

    public float getCalculateResult(float f1, float f2) {
        return f1 - f2;
    }
}
