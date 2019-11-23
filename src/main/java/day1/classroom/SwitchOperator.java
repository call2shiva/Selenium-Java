package day1.classroom;

public class SwitchOperator {

	/*
	 * Goal: Perform calculation based on the user input operations
	 * 
	 * inputs: 2,3 and "add"
	 * output: added value: 5
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a Switch case: type 'switch', followed by: ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1) Declaring Integer and string variables
	 * 2) Implemented calculation with Switch statement
	 * 3) Executing calculate operation using switch statement
	 * 
	 */	
	
	public static void main(String[] args) {
		
		// Declare 2 integer numbers
		int a=5;
		int b=5;
		// Declare a String variable with input as operations (Tip:
		String cAdd="Add";
		String cSub="Sub";
		String cMul="Mult";
		String cDiv="Div";
		String def="D1";
		// Initiate switch case for operations
				
		switch (cAdd) {
		case ("Add"):
			System.out.println(a+b);
		break;

		case("Sub"):
			System.out.println(a-b);
		break;

		case("Mult"):
			System.out.println(a*b);
		break;
		
		case("Div"):
			System.out.println(a/b);
		break;

		default:
			System.out.println("No operation Selected");
			break;
		}
			// Within switch, include as case for add operation
		
		
			// Within switch, include as case for sub operation
		
		
			// Within switch, include as case for mul operation
		
		
			// Within switch, include as case for div operation
		
		
			// Within switch, include 'default' to handle other operations
		
		
		//end of switch case
		
	}

}
