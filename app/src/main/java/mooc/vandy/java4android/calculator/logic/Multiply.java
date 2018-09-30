package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */

// Class implements the Interface which contains the common methods for all the calculator function
public class Multiply implements CalculatorFunctionsInterface<Integer>{
    // TODO -- start your code here

    //declaring variable for the class
    private int valueOne;
    private int valueTwo;

    // Constructor which assign the values to private variables
    Multiply(int firstArgument, int secondArgument)
    {
        this.valueOne = firstArgument;
        this.valueTwo = secondArgument;
    }

    @Override //computing the result and returning the value
    public Integer compute()
    {
        return (int)valueOne * valueTwo;
    }
}
