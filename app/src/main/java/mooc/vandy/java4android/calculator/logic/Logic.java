package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.logic.Add;
import mooc.vandy.java4android.calculator.logic.Divide;
import mooc.vandy.java4android.calculator.logic.Multiply;
import mooc.vandy.java4android.calculator.logic.Subtract;
import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic 
       implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out){
        mOut = out;
    }

    /**
     * Perform the @a operation on @a argumentOne and @a argumentTwo.
     */
    public void process(int argumentOne,
                        int argumentTwo,
                        int operation){
        // TODO -- start your code here

        //Creating new variable and initializing new Object of class Calculator
        CalculatorInterface calc = new Calculator();

        // Using Switch Control Structure for Performing Appropriate Operation
        switch (operation)
        {
            case 1: // Performs Addition Operation
                mOut.print(calc.Add(argumentOne,argumentTwo));
                break;

            case 2: // Performs Subtraction Operation
                mOut.print(calc.Subtract(argumentOne, argumentTwo));
                break;

            case 3: // Performs Multiplication Operation
                mOut.print(calc.Multiply(argumentOne, argumentTwo));
                break;

            case 4: // Performs Division Operation
                mOut.print(calc.Divide(argumentOne, argumentTwo));
                break;

            default: // This case will handles the unexpected value of operation variable eg: 0 or 5
                mOut.print("Invalid Operation Selected");
                break;
        }

    }
}

