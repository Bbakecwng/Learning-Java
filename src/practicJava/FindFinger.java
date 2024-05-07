package practicJava;

import java.util.Scanner;

public class FindFinger {
	

	public static void main(String[] args) {
		Scanner input;
		int fingerNumber;
		
		String fingerOne = "Index finger";
		String fingerTwo = "Big finger";
		String fingerthree = "Ring finger";
		String fingerFour = "Pinky finger";
		String fingerFifth = "Thumb finger";
		
		input = new Scanner(System.in);
		System.out.println("Please input a number to find each finger name: ");
		
		fingerNumber = input.nextInt();
			
		switch (fingerNumber) {
		case 1:
			System.out.println("Number one finger name is "+ fingerOne );
			break;
			
		case 2:
			System.out.println("Number two finger name is "+ fingerTwo);
			break;
			
		case 3:
			System.out.println("Number three finger name is "+ fingerthree);
			break;
			
		case 4:
			System.out.println("Number four finger name is "+ fingerFour);
			break;
			
		case 5:
			System.out.println("Number fifth finger name is "+ fingerFifth);
			break;

		default:
			System.out.println("Invalid Number.");
			System.out.println("Please enter a number again.");
			break;
			
		}
		
		  if(fingerNumber >=6) { 
			  Scanner input2 = new Scanner(System.in); 
			  int inputNumber = input2.nextInt();
		  System.out.println("Please input a valid number between 1 to 5"); 
		  int inputNum = input2.nextInt(); 
		  //System.out.println("Invalid number again");
		  }else { 
			  System.out.printf(fingerOne,fingerTwo,fingerthree); 
		}	
	}

}
