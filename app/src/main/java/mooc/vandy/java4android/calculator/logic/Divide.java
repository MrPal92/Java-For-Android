package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */

// Class implements the Interface which contains the common methods for all the calculator function
public class Divide implements CalculatorFunctionsInterface<int[]> {
    // TODO -- start your code here

    //declaring variable for the class
    private int valueOne;
    private int valueTwo;
    private int[] result;

    // Constructor which assign the values to private variables
    Divide(int firstArgument, int secondArgument)
    {
        this.valueOne = firstArgument;
        this.valueTwo = secondArgument;
        this.result = new int[2];
    }

    @Override //computing the result and returning the value array
    public int[] compute() throws DivisibilityByZero
    {
        if (valueTwo != 0) // testing the condition for divisibility by zero
        {
            result[0] = valueOne / valueTwo; //calculation quotient
            result[1] = valueOne % valueTwo; //calculating remainder
            return result;
        }
        else //throwing custom exception
            throw new DivisibilityByZero("Division with zero is not allowed");
    }
}
