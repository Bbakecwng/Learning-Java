package practicJava;

import java.util.Scanner;

public class FindFingerNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int fingerNumber;
        String fingerName;

        do {
            System.out.print("Enter a number between 1 and 5 to get the finger name: ");
            fingerNumber = scanner.nextInt();

            switch (fingerNumber) {
                case 1:
                    fingerName = "Index finger";
                    break;
                case 2:
                    fingerName = "Big finger";
                    break;
                case 3:
                    fingerName = "Ring finger";
                    break;
                case 4:
                    fingerName = "Pinky finger";
                    break;
                case 5:
                    fingerName = "Thumb finger";
                    break;
                default:
                    System.out.println("Invalid input. Please enter a number between 1 and 5.");
                    continue;
            }

            System.out.println("Finger name: " + fingerName);

        } while (fingerNumber < 1 || fingerNumber > 5);

        scanner.close();
    }

	}


