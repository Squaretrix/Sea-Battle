
public class Field {
	final char WATER = 'o';
	final char SHIP = 'X';
	public char[][] create(int n) {
		char[][] field = new char[n][n];
		for (int y = 0; y < field.length; y++) {
			for (int x = 0; x < field.length; x++) {
				field[y][x] = WATER;
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
		int outb = 0;
		while (counter < ships) {
			int x = (int) (Math.random() * field.length);
			int y = (int) (Math.random() * field.length);
			if (countAround(field, x, y) == true) {
				field[y][x] = SHIP;
				counter++;
			}else {
				outb++;
			}
			if (outb>100) {
				System.out.println("Unable to place");
				System.exit(0);
			}
		}
	}

	public boolean countAround(char[][] field, int x, int y) {

		for (int i = x - 1; i <= x + 1; i++) {
			for (int j = y - 1; j <= y + 1; j++) {
				if (i < 0 || j < 0 || j >= field.length || i >= field.length) {
				} else {
					if (field[j][i] == SHIP) {
						return false;
					}
				}

			}
		}
		return true;

	}
}
