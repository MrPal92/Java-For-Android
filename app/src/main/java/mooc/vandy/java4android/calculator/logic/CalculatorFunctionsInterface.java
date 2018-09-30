package mooc.vandy.java4android.calculator.logic;

/**
 * Created by mrpal92@gmail.com on 09-12-2017.
 */

public interface CalculatorFunctionsInterface<T> {

    T compute() throws ValueOutOfBoundException, DivisibilityByZero;

}
