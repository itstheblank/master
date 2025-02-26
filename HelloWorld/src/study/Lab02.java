package study;
import java.util.Scanner;

public class Lab02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a: ");
		double a = scanner.nextDouble();
		System.out.print("Enter b: ");
		double b = scanner.nextDouble();
		if(a != 0) {
			double x = -b / a;
			System.out.println("x = " + x);
		}
		else {
			if(b == 0) {
				System.out.println("Infinite solution for x");
			}
			else {
				System.out.println("No solution for x");
			}
		}
		//close scanner
		scanner.close();
	}
}