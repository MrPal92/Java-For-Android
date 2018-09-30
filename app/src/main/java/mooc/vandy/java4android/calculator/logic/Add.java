package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */

 // Class implements the Interface which contains the common methods for all the calculator function
public class Add implements CalculatorFunctionsInterface<Integer> {
    // TODO -- start your code here

    //declaring variable for the class
    private double valueOne;
    private double valueTwo;
    private double result;

    // Constructor which assign the values to private variables
    Add(int firstArgument, int secondArgument)
    {
        this.valueOne = firstArgument;
        this.valueTwo = secondArgument;
    }

    @Override
    public Integer compute() throws ValueOutOfBoundException
    {
        try
        {
            result = valueOne + valueTwo;
            if (result > Integer.MAX_VALUE || result< Integer.MIN_VALUE) //if value of the result exceed the boundary of
                                                                        // Integer DataType then this will through an exception
                throw new Exception();
            else
                return (int)result;
        }
        catch (Exception e) // this section will catch the exception and throw an custom exception
        {
            throw new ValueOutOfBoundException("Result Exceeds the maximum value of Integer DataType");
        }
    }
}
