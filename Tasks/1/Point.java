package programming101Application;

public class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void moveLeftX() {
		x -= 1;
	}

	public void moveRightX() {
		x = x + 1;
	}

	public void moveUpY() {
		y -= 1;
	}

	public void moveDownY() {
		y += 1;
	}

	public int getX() {
		return x;
	}

	public String toString() {
		return "(" + x + "," + y + ")";
	}

}
