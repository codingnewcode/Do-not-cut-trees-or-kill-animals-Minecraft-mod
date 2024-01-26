package calculator;

import operations.IOperable;

public class Division implements IOperable {
    //@Override
    //public boolean checkIsOperable(float f1, float f2) {
    //    return (f2 != 0);
    //}

    @Override
    public float getCalculateResult(float f1, float f2) {
        // if f2 == 0 exception is handled above for the calculator's needs, if used in other cases than
        // the Calculator, default to the native java Exception maybe.
        return f1 / f2;
    }
}
