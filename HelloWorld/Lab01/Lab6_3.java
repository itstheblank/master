package study;

import java.util.Scanner;
public class Lab6_3 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the height: ");
	        int n = scanner.nextInt();
	        scanner.close();
	        for (int i = 1; i <= n; i++) {
	            for (int j = 0; j < n - i; j++) {
	                System.out.print(" ");
	            }
	            for (int k = 0; k < (2 * i - 1); k++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
	}
