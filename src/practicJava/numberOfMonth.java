package practicJava;

import java.util.Scanner;

public class numberOfMonth {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input a name of month");
		String nameOfMonth = input.next();
		
		
		switch(nameOfMonth.toLowerCase()){
		
		case "jan":
			System.out.println(1);
			break;
		
		case "feb":
			System.out.println(2);
			break;
			
		case "march":
			System.out.println(3);
			break;
			
		case "april":
			System.out.println(4);
			break;
			
		case "may":
			System.out.println(5);
			break;
			
		case "june":
			System.out.println(6);
			break;
			
		case "july":
			System.out.println(7);
			break;
			
		case "aguest":
			System.out.println(8);
			break;
			
		case "septembr":
			System.out.println(9);
			break;
			
		case "october":
			System.out.println(10);
			break;
			
		case "november":
			System.out.println(11);
			break;
			
		case "december":
			System.out.println(12);
			break;
			
			default:
				System.out.println("Invalid input");
		}
			
		
	}

	

}
