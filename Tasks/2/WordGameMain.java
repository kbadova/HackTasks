package programming101Application;

import java.util.Scanner;

public class WordGameMain {
	public static void main(String[] args) {
		int n, m;
		Scanner input = new Scanner(System.in);
		System.out.println("Entering a matrix n x m ");
		System.out.println("Enter n: ");
		n = input.nextInt();
		System.out.println("Enter m: ");
		m = input.nextInt();
		char[][] matrix = new char[n][m];
		System.out.println("Enter the matrix:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matrix[i][j] = input.next().charAt(0);
			}
		}
		WordGame game = new WordGame();
		System.out.println(game.movement(matrix, n, m, "ivan"));
		input.close();
	}
	
}
