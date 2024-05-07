package practicJava;

import java.util.Scanner;

public class Assignment14 {

	public static void main(String[] args) {
			
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number");
		int firstNumber = input.nextInt();
		System.out.println("Enter second number");
		int secondNumber = input.nextInt();
			if(firstNumber %2 !=0) {
				System.out.println("First number is odd");
			
			} else { 
				System.out.println("First number is even"); 
				} if (secondNumber %2 !=1){ 
					System.out.println("Second number is even"); 
					}else {
				  System.out.println("Second number is odd"); }
				 
		
		

	}

}
