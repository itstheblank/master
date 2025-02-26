package study;

import java.util.Scanner;

public class Lab04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a: ");
		double a = scanner.nextDouble();
		System.out.print("Enter b: ");
		double b = scanner.nextDouble();
		System.out.print("Enter c: ");
		double c = scanner.nextDouble();
		if(a == 0) {
			if(b == 0) {
				if(c == 0) {
					System.out.println("Infinite solution");
				}
				else {
					System.out.println("No solution");
				}
			}
			else {
				double x = -c/b;
				System.out.println("The solution is x = " + x);
			}
		}
		else {
			double delta = b * b - 4 * a * c;
			if(delta > 0) {
				double x1 = (-b - Math.sqrt(delta)) / (2 * a);
				double x2 = (-b + Math.sqrt(delta)) / (2 * a);
				System.out.println("The solutions are x_1 = " + x1 + " and x_2 = " + x2);
			}
			else if(delta == 0) {
				double x = (-b) / (2 * a);
				System.out.println("The solution is x = " + x);
			}
			else {
				System.out.println("No solution");
			}
		}
		//close scanner
		scanner.close();
	}
}
