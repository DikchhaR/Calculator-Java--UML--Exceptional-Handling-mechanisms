package Assignment2;

/**
 * Importing Scanner class and all classes.
 */
import java.util.Scanner;
import java.util.*;


/**
 * This is a class called CalculatorInput where the calculator will keep asking the user for input, that is, an equation
 * until the user quits by entering "0 ="
 
 * @author Dikchha Rijal
 * @version 1.0.0
 * @see assignment2
 * @since 17.0.8
 */
public class CalculatorInput {
	
	
	/**
	 * This is a method named promptUser which will request the user to write an equation in one line in a specific format.
	 * All input will come from the scanner and all numerical input will be read as nextInt() while other input will be read as next().
	 * @param e the parameter e of type CalculatorEngine
	 */
	public void promptUser(CalculatorEngine e) throws InputMismatchException, NoSuchElementException {
		
		Scanner keyboard = new Scanner (System.in);
		Scanner input;
		int num1 = 0;
		int num2 = 0;
		String sign, equals, buffer;
		
		System.out.print("Enter your equation: "); 
		
		buffer = keyboard.nextLine();
		 
		//using a while loop to first exclude the case where the buffer is "0=", that is, when user types "0= "
		while (!buffer.equals("0=")) {
			
			try {
				if (buffer.isEmpty()) {
					// throwing a NoSuchElementException
					throw new NoSuchElementException("Error: Equation is incomplete, NoSuchElementException - buffer is empty-  there is no input given at all. The error is Caught inside 'if' block of try and catch. \n");
					
				}
			}catch(NoSuchElementException nse) {
				System.out.print(nse.getMessage()); 
				System.out.print("\nEnter your equation: ");
				buffer = keyboard.nextLine();
				input = new Scanner(buffer);
				continue;
				
			}
			
			input = new Scanner(buffer);
			
			
			try{
				num1 = input.nextInt();
				
			// used exception InputMismatchException for catch
			}catch(InputMismatchException em) {
				System.out.println("Error: First number is not an integer, InputMismatchException- Error Caught in Try Catch block.\n");
				System.out.print("Enter your equation: "); 
				
				buffer = keyboard.nextLine();
				continue;
			
			}
			sign = "";
			try{ 
				sign = input.next();
				//if statement used to catch error if the correct operator is not used
				if(!(sign.equals("+") || sign.equals("-") ||sign.equals("*") || sign.equals("/"))){
					
					//throwing a new InputMismatchException
				
					throw new InputMismatchException("Error: Equation is incomplete. Invalid operator. Valid operators are +, -, /, and *. Exception is InputMismatchException -Error caught in Try Catch block.\n");
			
				}
				
				
				// used exception NoSuchElementException for catch
			}catch(InputMismatchException err2) {
				System.out.println(err2.getMessage());
				System.out.print("Enter your equation: "); 
				
				buffer = keyboard.nextLine();
				continue;
			}catch(NoSuchElementException err1) {
				System.out.println("Error: Equation is incomplete. Operator is missing. Exception is NoSuchElementException-Error caught in Try Catch block.\n");
				System.out.print("Enter your equation: "); 
				
				buffer = keyboard.nextLine();
				continue;
			}
			
			
			try{
				num2 = input.nextInt();
				
				// used exception InputMismatchException for catch		
			}catch(InputMismatchException ms) {
				System.out.println("Error: Second number is not an integer- Exception is InputMismatchedException-Error caught in Try Catch block.\n");
				System.out.print("Enter your equation: "); 
				
				buffer = keyboard.nextLine();
				continue;
				
			// used exception NoSuchElementException for catch
			}catch(NoSuchElementException ns) {
				System.out.println("Error: Second number is missing - Exception is NoSuchElementException-Error caught in Try Catch block.\n");
				System.out.print("Enter your equation: "); 
				
				buffer = keyboard.nextLine();
				continue;
			}
		
			try {
				equals = input.next();
				
				if(!equals.equals("=")) {
					throw new InputMismatchException("Error: Equation incomplete. Equation must end with '=' Exception is InputMismatchException. Error caught in Try Catch block");
				}
				
			// used exception InputMismatchException for catch	
			}catch(InputMismatchException err) {
				System.out.println(err.getMessage());
				System.out.print("Enter your equation: "); 
				
				buffer = keyboard.nextLine();
				continue;
				
			// used exception NoSuchElementException for catch	
			}catch(NoSuchElementException er) {
				System.out.println("Error: Equation incomplete. Equation must end with '=' Exception is NoSuchElementException. Error caught in Try Catch block.\n");
				System.out.print("Enter your equation: "); 
				
				buffer = keyboard.nextLine();
				continue;
			}
			
			
			// if statement to make sure that if user uses the correct operators, return the result by doing the calculation
			if (sign.equals("+")){
				
				int result = e.add(num1, num2);
				System.out.println("That answer is: "+ result);
				
				
			} else if (sign.equals("-")) {
				int result = e.substract(num1, num2);
				System.out.println("That answer is: "+ result);
				
			}else if (sign.equals("*")) {
				int result = e.multiply(num1, num2);
				System.out.println("That answer is: "+ result);
				
			}else if (sign.equals("/")) {
				int result = e.divide(num1, num2);
				System.out.println("That answer is: "+ result);
				
			}
			
			System.out.print("\nEnter your equation: "); 
			
			buffer = keyboard.nextLine();
			
			
		}//End of while block
		keyboard.close();
		
		System.out.println("Program exiting.");
	}

}
