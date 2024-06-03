package Assignment2;

/**
 * This is a class called CalculatorEngine that has the four methods that does the calculation between the input number 1 and number 2.
 * 
 * @author Dikchha Rijal
 * @version 1.0.0
 * @see assignment2
 * @since 17.0.8
*/
public class CalculatorEngine {
	
	/**
	 * This is the add method that will do the addition of two numbers
	 * @param num1 The integer number 1 for add method
	 * @param num2 The integer number 2 for add method
	 * @return the sum for the add method
	 */
	public int add(int num1, int num2) {
		int sum = num1 +num2;
		return sum;
			
	}
	
	/**
	 * This is the subtract method that will do the subtraction of two numbers
	 * @param num1 The integer number 1 for add method
	 * @param num2 The integer number 2 for add method
	 * @return the value after the subtraction of numbers
	 */
	public int substract(int num1, int num2) {
		int sub = num1-num2;
		return sub;
	}

	/**
	 * This is the multiply method that will do the multiplication of two numbers
	 * @param num1 The integer number 1 for add method
	 * @param num2 The integer number 2 for add method
	 * @return the value after multiplication of numbers
	 */
	public int multiply(int num1, int num2) {
		int mul = num1*num2;
		return mul;
	}
	
	/**
	 * This is the divide method that will do the division of two numbers
	 * @param num1 The integer number 1 for add method
	 * @param num2 The integer number 2 for add method
	 * @return the value after the division of numbers
	 */
	public int divide(int num1, int num2) {
		int div = 0;
		try {
			div = num1 / num2;
			
		//  used exception AirthmeticException for catch
		}catch(ArithmeticException e) {
			System.out.println("Error: The number cannot be divided by Zero! Result is invalid, returning zero. The Exception is ArithmeticException. Error caught in Try Catch block." );
		
		}

		return div;
	}
}
