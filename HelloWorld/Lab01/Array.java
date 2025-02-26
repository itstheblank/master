package study;
import java.util.Scanner;
import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		int n = scanner.nextInt();
		int[] array = new int[n];
		System.out.print("Enter the elements: ");
		for(int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}
		Arrays.sort(array);
		int sum = 0;
		for(int num : array) {
			sum += num;
		}
		double average = (double) sum / n;
		System.out.println("The sorted array is: " + Arrays.toString(array));
		System.out.println("The sum of the elements in the array is: " + sum);
		System.out.println("The average of the array is: " + average);
		scanner.close();
	}
}
