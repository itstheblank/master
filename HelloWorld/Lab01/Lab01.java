package study;
import java.util.Scanner;

public class Lab01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		double a = scanner.nextDouble();
		System.out.print("Enter the second number: ");
		double b = scanner.nextDouble();
		double sum = a + b;
		double difference = a - b;
		double product = a * b;
		double quotient = (b != 0) ? (a / b) : Double.NaN;
		
		System.out.println("\nResults: ");
		System.out.println("Sum: " + sum);
		System.out.println("Difference: " + difference);
		System.out.println("Product: " + product);
		if(b != 0) {
			System.out.println("Quotient: " + quotient);
		}
		else {
			System.out.println("Quotient: Undefined");
		}
		//close scanner
		scanner.close();
	}

}
