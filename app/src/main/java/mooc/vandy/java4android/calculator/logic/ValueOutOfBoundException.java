package mooc.vandy.java4android.calculator.logic;

/**
 * Created by mrpal on 09-12-2017.
 */

public class ValueOutOfBoundException extends Exception
{
    public ValueOutOfBoundException(String errorMessage)
    {
        super(errorMessage);
    }
}
