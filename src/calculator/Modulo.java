package calculator;

import operations.IOperable;

public class Modulo implements IOperable {
    @Override
    public float getCalculateResult(float f1, float f2) {
        return f1 % f2;
    }
}
