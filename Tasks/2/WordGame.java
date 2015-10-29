package programming101Application;

public class WordGame {
	public int index = 0;
	public int counter = 0;

	public int movement(char[][] matrix, int n, int m, String word) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (matrix[i][j] == word.charAt(index)) {
					if (isPalindrom(word) == false) {
						if (j <= m - word.length()) {
							checkLeftToRight(matrix, n, m, word, i, j);
						}
						index = 0;
						if (j >= word.length() - 1) {
							checkRightToLeft(matrix, n, m, word, i, j);
						}
						index = 0;
						if (i <= n - word.length()) {
							checkUpToDown(matrix, n, m, word, i, j);
						}
						index = 0;
						if (i >= word.length() - 1) {
							checkDownToUp(matrix, n, m, word, i, j);
						}
						index = 0;
						if (i <= n - word.length() && j >= word.length() - 1) {
							checkUpRightToDownLeftDiagonally(matrix, n, m,
									word, i, j);
						}
						index = 0;
						if (i <= n - word.length() && j <= m - word.length()) {
							checkUpLeftToDownRightDiagonally(matrix, n, m,
									word, i, j);
						}
						index = 0;
						if (i >= word.length() - 1 && j >= word.length() - 1) {
							checkDownRightToUpLeftDiagonally(matrix, n, m,
									word, i, j);
						}
						index = 0;
						if (i >= word.length() - 1 && j <= m - word.length()) {
							checkDownLeftToUpRightDiagonally(matrix, n, m,
									word, i, j);
						}
						index = 0;
					} else {
						if (j <= m - word.length()) {
							checkLeftToRight(matrix, n, m, word, i, j);
						}
						index = 0;
						if (i <= n - word.length()) {
							checkUpToDown(matrix, n, m, word, i, j);
						}
						index = 0;
						if (i <= n - word.length() && j >= word.length() - 1) {
							checkUpRightToDownLeftDiagonally(matrix, n, m,
									word, i, j);
						}
						index = 0;
						if (i >= word.length() - 1 && j >= word.length() - 1) {
							checkDownRightToUpLeftDiagonally(matrix, n, m,
									word, i, j);
						}
						index = 0;
					}
				}
			}
		}
		return counter;
	}

	public boolean isPalindrom(String word) {
		int i = 0;
		int j = word.length() - 1;
		while (j > i) {
			if (word.charAt(i) != word.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	private void checkDownToUp(char[][] matrix, int n, int m, String word,
			int i, int j) {
		int initialI = i;
		int initialJ = j;
		while (index < word.length() - 1) {
			if (matrix[initialI - 1][initialJ] == word.charAt(index + 1)) {
			}
			if (matrix[initialI - 1][initialJ] != word.charAt(index + 1)) {
				return;
			}
			initialI--;
			index++;
		}
		counter++;
	}

	private void checkUpToDown(char[][] matrix, int n, int m, String word,
			int i, int j) {
		int initialI = i;
		int initialJ = j;
		while (index < word.length() - 1) {
			if (matrix[initialI + 1][initialJ] == word.charAt(index + 1)) {
			}
			if (matrix[initialI + 1][initialJ] != word.charAt(index + 1)) {
				return;
			}
			initialI++;
			index++;
		}
		counter++;
	}

	private void checkDownLeftToUpRightDiagonally(char[][] matrix, int n,
			int m, String word, int i, int j) {

		int initialI = i;
		int initialJ = j;
		while (index < word.length() - 1) {
			if (matrix[initialI - 1][initialJ + 1] == word.charAt(index + 1)) {
			}
			if (matrix[initialI - 1][initialJ + 1] != word.charAt(index + 1)) {
				return;
			}
			initialI--;
			initialJ++;
			index++;
		}
		counter++;
	}

	private void checkDownRightToUpLeftDiagonally(char[][] matrix, int n,
			int m, String word, int i, int j) {
		int initialI = i;
		int initialJ = j;
		while (index < word.length() - 1) {
			if (matrix[initialI - 1][initialJ - 1] == word.charAt(index + 1)) {
			}
			if (matrix[initialI - 1][initialJ - 1] != word.charAt(index + 1)) {
				return;
			}
			initialI--;
			initialJ--;
			index++;
		}
		counter++;
	}

	private void checkRightToLeft(char[][] matrix, int n, int m, String word,
			int i, int j) {
		int initialI = i;
		int initialJ = j;
		while (index < word.length() - 1) {
			if (matrix[initialI][initialJ - 1] == word.charAt(index + 1)) {
				initialJ--;
				index++;
			} else {
				return;
			}
		}
		counter++;
	}

	public void checkLeftToRight(char[][] matrix, int n, int m, String word,
			int i, int j) {
		int initialI = i;
		int initialJ = j;
		while (index < word.length() - 1) {
			if (matrix[initialI][initialJ + 1] == word.charAt(index + 1)) {
				initialJ++;
				index++;
			} else {
				return;
			}
		}
		counter++;
	}

	private void checkUpRightToDownLeftDiagonally(char[][] matrix, int n,
			int m, String word, int i, int j) {
		int initialI = i;
		int initialJ = j;
		while (index < word.length() - 1) {
			if (matrix[initialI + 1][initialJ - 1] == word.charAt(index + 1)) {
			}
			if (matrix[initialI + 1][initialJ - 1] != word.charAt(index + 1)) {
				return;
			}
			initialI++;
			initialJ--;
			index++;
		}
		counter++;
	}

	private void checkUpLeftToDownRightDiagonally(char[][] matrix, int n,
			int m, String word, int i, int j) {
		int initialI = i;
		int initialJ = j;
		while (index < word.length() - 1) {
			if (matrix[initialI + 1][initialJ + 1] == word.charAt(index + 1)) {
			}
			if (matrix[initialI + 1][initialJ + 1] != word.charAt(index + 1)) {
				return;
			}
			initialI++;
			initialJ++;
			index++;
		}
		counter++;
	}
}
