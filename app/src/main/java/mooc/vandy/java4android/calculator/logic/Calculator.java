package mooc.vandy.java4android.calculator.logic;

/**
 * Created by mrpal92@gmail.com on 09-12-2017.
 */

/**
 *  For the solution to the given problem I have taken Loose coupling approach which is also the
 *  requirement of the problem solution. To understand my solution better first you need to
 *  understand my thinking process to solve this solution.
 *
 *  In this project skeleton our professors gives us four classes Add, Subtract, Multiply and Division
 *  and we have to implement these classes with our current knowledge on subject but
 *  these classes are actually the Functional Behaviour of Calculator which means it should be the part
 *  of Calculator class.
 *
 *  So I have created an Interface Name CalculatorInterface which contains all the function of calculator like
 *  Add, Subtract, Multiply and Divide(with this CalculatorInterface we can add another function into calculator class
 *  by simply adding those function to Interface)
 *  and the Class Calculator implements this Interface and by doing so I am also able to achieve a layered
 *  architecture and the class Calculator acts as layer in between Business Logic(add, subtract etc) and user class Logic
 *
 * So this approach make this solution More Scalable and Loosely Coupled(Logical Independent of each other)
 *
 * In this Solution I also tried to implement Custom Exception and Exception Handling for my practice
 * you can check that with division and addition class
 *
 * And all the Function Classes of calculator implements the Interface named CalculatorFunctionInterface
 * which contains the common methods of contains by all the Function Classes and for the flexibility of these function
 * Generics is also implemented.
 *
 * below this is the structure of my approach
 *
 *                                          CalculatorInterface                          CalculatorFunctionsInterface
 *                                                  ^                                                   ^
 *                                                  |                                                   |
 *                                                  |                                                   |
 *                                                  |                                                   |
 *      Logic Class   <---------------->     Calculator Class    <---------------->  Add, Subtract, Multiply and Divide Class
 *
 *  The above structure is also called as 3- layer architecture common in big business applications.
 *
 *
 *   Note: English is not my native language if you don't understand anything written above due my some mistake
 *   I encourage you to rectify that contacting me at mr.pal92@gmail.com  or mr.pal92@hotmail.com
 *
 */



public class Calculator implements CalculatorInterface {


    @Override //Implementing the CalculatorInterface method Add
    public String Add(int valueOne, int valueTwo)
    {
        CalculatorFunctionsInterface function = new Add(valueOne, valueTwo); //creating an instance of Add class
        try
        {
            return Integer.toString((Integer) function.compute()); // calling the compute method
        }
        catch (ValueOutOfBoundException ex) // handling custom created exception
        {
            return "Addition Of " + valueOne +" and" +valueTwo +" exceeds the value supported by type";
        }
        catch (Exception ex) // handling all the unexpected exception by catching the master exception
        {
            return "Some Unexpected Error Occurred";
        }
    }

    @Override //Implementing the CalculatorInterface method Subtract
    public String Subtract(int valueOne, int valueTwo)
    {
        CalculatorFunctionsInterface function = new Subtract(valueOne,valueTwo);
        try
        {
            return Integer.toString((Integer) function.compute()); // calling the compute method
        }
        catch (ValueOutOfBoundException ex) // handling custom created exception
        {
            return "Value is out of bound";
        }
        catch (Exception ex) // handling all the unexpected exception by catching the master exception
        {
            return "Some Unexpected Error Occurred";
        }

    }

    @Override //Implementing the CalculatorInterface method Multiply
    public String Multiply(int valueOne, int valueTwo)
    {
        CalculatorFunctionsInterface function = new Multiply(valueOne, valueTwo);
        try
        {
            return Integer.toString((Integer) function.compute()); // calling the compute method
        }
        catch (ValueOutOfBoundException ex) // handling custom created exception
        {
            return "Value is out of bound";
        }
        catch (Exception ex) // handling all the unexpected exception by catching the master exception
        {
            return "Some Unexpected Error Occurred";
        }

    }

    @Override //Implementing the CalculatorInterface method Divide
    public String Divide(int valueOne, int valueTwo)
    {
        CalculatorFunctionsInterface function = new Divide(valueOne, valueTwo);
        try
        {
            int[] result = (int[]) function.compute(); // calling the compute method and storing the return value into result array
            return Integer.toString(result[0]) + " R: " +Integer.toString(result[1]); // forming string and returning the value
        }
        catch (ValueOutOfBoundException ex) // handling custom created exception
        {
            return "Value is out of bound";
        }
        catch (DivisibilityByZero ex) // handling custom created exception
        {
            return "Division with zero is not allowed";
        }
        catch (Exception ex) // handling all the unexpected exception by catching the master exception
        {
            return "Some Unexpected Error Occurred";
        }
    }
}
