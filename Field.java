
public class Field {

	public char[][] create(int n) {
		char[][] field = new char[n][n];
		for (int y = 0; y < field.length; y++) {
			for (int x = 0; x < field.length; x++) {
				field[y][x] = 'w';
			}
		}
		return field;
	}

	public void print(char[][] field) {
		for (int y = 0; y < field.length; y++) {
			for (int x = 0; x < field.length; x++) {
				System.out.print(field[y][x]);
			}
			System.out.println();
		}
	}

	public void place(char[][] field, int ships) {
		int counter = 0;

		while (counter < ships) {
			counter++;
			int x = (int) (Math.random() * field.length);
			int y = (int) (Math.random() * field.length);
			field[y][x] = 's';
		}
 
	}
}
