package Adding;

import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method 

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		double firstNumber = scanner.nextDouble();
		
		System.out.println("Enter the second number: ");
		double secondNumber = scanner.nextDouble();

		scanner.close();
		
		double sum = firstNumber+secondNumber;
		
		System.out.println("The sum of" +firstNumber+ " and  " + secondNumber+ "is:" + sum);
		

	}

}
