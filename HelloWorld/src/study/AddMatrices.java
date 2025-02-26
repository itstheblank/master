package study;
import java.util.Scanner;

public class AddMatrices {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int rows = scanner.nextInt();
		System.out.print("Enter the number of columns: ");
		int cols = scanner.nextInt();
		int[][] m1 = new int[rows][cols];
		int[][] m2 = new int[rows][cols];
		int[][] m = new int[rows][cols];
		System.out.println("Enter the elements of the first matrix: ");
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				m1[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Enter the elements of the second matrix: ");
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				m2[i][j] = scanner.nextInt();
			}
		}
		//add matrix
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				m[i][j] = m1[i][j] + m2[i][j];
			}
		}
		System.out.println("The sum of two given matrices is:");
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		scanner.close();
	}

}
