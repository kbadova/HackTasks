package programming101Application;

public class CoordinateSystem {
	Point point;
	int counter = 0;

	public CoordinateSystem() {
		point = new Point(0, 0);
	}

	public void changeDirection(String string, int index) {
		for (int i = index + 1; i < string.length(); i++) {

			switch (string.charAt(i)) {

			case '>':

				point.moveLeftX();
				counter++;
				break;

			case '<':

				point.moveRightX();
				counter++;
				break;

			case '^':

				point.moveDownY();
				counter++;
				break;

			case '~':

				return;

			}
		}
	}

	public Point direction(String string) {
		for (int i = 0; i < string.length(); i++) {

			switch (string.charAt(i)) {

			case '>':

				point.moveRightX();
				break;

			case '<':

				point.moveLeftX();
				break;

			case '^':
				
				point.moveUpY();
				break;

			case '~':
				
				changeDirection(string, i);
				i += counter + 1;
				break;

			}
		}
		return point;
	}

}
