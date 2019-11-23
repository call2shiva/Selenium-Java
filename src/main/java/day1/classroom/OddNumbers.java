package day1.classroom;

public class OddNumbers {
	
	/*
	 * Goal: Find the odd numbers in the specific range of numbers
	 * 
	 * Input: range of numbers (starting to end) [1 to 20]
	 * Output: Printing only odd numbers [1,3,5,7,9...,19]
	 * 
	 * Shortcuts:
	 * 1) Print : type 'syso', followed by ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
	 * 
	 * What are my learnings from this code?
	 * 
	 * 1) Learned how to create For loop
	 * 2) Learned to Implement If condition
	 * 3) Learned how to execute results
	 * 
	 */

	public static void main(String[] args) {
		
		
		//	Iterate from 1 to 20 (tip: using loop concept)
		for(int i=1; i<=20; i++) {
			
			//	Within loop -> check whether the integer is odd (tip: use mod operator)
			
			if(i%2==1)
			{
				
//				Within loop -> print the odd integer

				System.out.println("Odd no between 1-20:"+i);
			}
				
		}

	

		
	}

}
