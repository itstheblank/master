package study;

import java.util.Scanner;

public class Lab03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a_11 a_12 b_1 a_21 a_22 b_2: ");
		double a11 = scanner.nextDouble();
		double a12 = scanner.nextDouble();
		double b1 = scanner.nextDouble();
		double a21 = scanner.nextDouble();
		double a22 = scanner.nextDouble();
		double b2 = scanner.nextDouble();
		double delta = a11 * a22 - a21 * a12;
		double delta_x = b1 * a22 - b2 * a12;
		double delta_y = a11 * b2 - a21 * b1;
		if(delta != 0) {
			double x1 = delta_x / delta;
			double x2 = delta_y / delta;
			System.out.println("The solution are x_1 =" + x1 + " and x_2 = " + x2);
		}
		else {
			if(delta_x != 0 || delta_y != 0) {
				System.out.println("No solution");
			}
			else if(delta_x == 0 && delta_y == 0) {
				System.out.println("Infinite solution");
			}
		}
		//close scanner
		scanner.close();
	}
}
