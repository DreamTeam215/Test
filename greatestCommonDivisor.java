import java.util.*;
public class greatestCommonDivisor {

	private static int findGCD(int number1, int number2) { 
		if(number2 == 0){ return number1; } 
		return findGCD(number2, number1%number2); } 
	
	public static void main (String[]args){
		
		Scanner scan = new Scanner(System.in);
		
		int number1, number2, numbers;
		
		System.out.println("Enter how many pair of numbers you would like to solve");
		numbers = scan.nextInt();
		
		
		for(int i = 0; i < numbers; i++)
		{
			scan.nextLine();
			System.out.println("Please enter number 1: ");
			number1 = scan.nextInt();
			
			System.out.println("Please enter number 2: ");
			number2 = scan.nextInt();
			
			System.out.println("Number 1: " + number1 + " Number 2: " + number2 
					+" GCD: " + findGCD(number1,number2) + "\n");	
		}

	}
		}

			
	
