package Assignment2;

/**
 * This is a class called Calculator, this class is the driver class of the code that has the main method,
 * this class informs the user how to use the calculator, and then instantiate the CalculatorEngine and CalculatorInput classes
 
 * @author Dikchha Rijal
 * @version 1.0.0
 * @see assignment2
 * @since 17.0.8
 */
public class Calculator {

	   /**
		 * This is the main method used in the Calculator.
		 * It will print my name and student number to the screen, inform the user how to
         * use the calculator, and then instantiate the CalculatorEngine and CalculatorInput classes
		 * @param args array of Strings
		 */
	public static void main(String[] args) {
		System.out.println("Welcome to the Assignment 2 CST8284 calculator.\r\n"
				+ "Written by Dikchha Rijal, #040806753\r\n\n"
				+ "Equations are in the form num1 operator num2 =\r\n"
				+ "Where num1 and num2 must be integers,\r\n"
				+ "operator is one of +, -, / or * \r\n\n"
				+ "Enter 0 = to quit.\n\n");

		
		  CalculatorEngine engine = new CalculatorEngine();
		  
		  CalculatorInput input = new CalculatorInput();
		  
		  
		 input.promptUser(engine);
	}
	
	

}
