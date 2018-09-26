public class Field {
	final char WATER = 'o';
	final char SHIP = 'X';

	public char[][] create(int l, int b) {
		char[][] field = new char[b][l];

		for (int y = 0; y < field.length; y++) {
			for (int x = 0; x < field[0].length; x++) {
				field[y][x] = WATER;
			}
		}
		return field;
	}

	public void print(char[][] field) {
		for (int y = 0; y < field.length; y++) {
			for (int x = 0; x < field[0].length; x++) {
				System.out.print(field[y][x]);
			}
			System.out.println();
		}
	}

	public void place(char[][] field, short ships[]) {
		setOne(field, ships);
		setTwo(field, ships);
		setThree(field, ships);
		setFour(field, ships);
		setFive(field, ships);
	}

	public boolean countAround(char[][] field, int x, int y, boolean horizontal, int length) {

		if (horizontal) {
			for (int j = y - 1; j <= y + 1; j++) {
				for (int i = x - 1; i <= x + length; i++) {

					if (j >= 0 && i >= 0 && j < field.length && i < field[0].length)

						if (field[j][i] == SHIP)
							return true;
				}
			}
			if (x + length > field[0].length)
				return true;
		}

		else {
			for (int j = y - 1; j <= y + length; j++) {
				for (int i = x - 1; i <= x + 1; i++) {

					if (j >= 0 && i >= 0 && j < field.length && i < field[0].length)

						if (field[j][i] == SHIP)
							return true;
				}
			}
			if (y + length > field.length)
				return true;
		}

		return false;
	}

	void setOne(char[][] field, short ships[]) {
		int counter = 0;
		int outb = 0;
		while (counter < ships[0]) {
			int x = (int) (Math.random() * field[0].length);
			int y = (int) (Math.random() * field.length);

			if (countAround(field, x, y, true, 1)) {
				counter++;
			} else {
				field[y][x] = SHIP;
				outb++;
			}
			if (outb > 100) {
				System.out.println("Unable to place");
				System.exit(0);
			}
		}
	}

	void setTwo(char[][] field, short ships[]) {
		boolean hz;
		int counter = 0;
		int outb = 0;
		while (counter < ships[1]) {
			int x = (int) (Math.random() * field[0].length);
			int y = (int) (Math.random() * field.length);
			int ra = (int) (Math.round(Math.random() * 2));
			if (ra == 1) {
				hz = true;
			} else {
				hz = false;
			}
			if (countAround(field, x, y, hz, 2)) {
				counter++;
				
			} else {
				if (hz) {
					field[y][x] = SHIP;
					field[y][x + 1] = SHIP;
				} else {
					field[y][x] = SHIP;
					field[y + 1][x] = SHIP;
				}
				outb++;
			}
			if (outb > 100) {
				System.out.println("Unable to place");
				System.exit(0);
			}
		}
	}

	void setThree(char[][] field, short ships[]) {
		boolean hz;
		int counter = 0;
		int outb = 0;
		while (counter < ships[2]) {
			int x = (int) (Math.random() * field[0].length);
			int y = (int) (Math.random() * field.length);
			int ra = (int) (Math.round(Math.random() * 2));
			if (ra == 1) {
				hz = true;
			} else {
				hz = false;
			}
			if (countAround(field, x, y, hz, 3)) {
				counter++;
				
			} else {
				if (hz) {
					field[y][x] = SHIP;
					field[y][x + 1] = SHIP;
					field[y][x + 2] = SHIP;
				} else {
					field[y][x] = SHIP;
					field[y + 1][x] = SHIP;
					field[y + 2][x] = SHIP;
				}
				outb++;
			}
			if (outb > 100) {
				System.out.println("Unable to place");
				System.exit(0);
			}
		}
	}

	void setFour(char[][] field, short ships[]) {
		boolean hz;
		int counter = 0;
		int outb = 0;
		while (counter < ships[3]) {
			int x = (int) (Math.random() * field[0].length);
			int y = (int) (Math.random() * field.length);
			int ra = (int) (Math.round(Math.random() * 2));
			if (ra == 1) {
				hz = true;
			} else {
				hz = false;
			}
			if (countAround(field, x, y, hz, 4)) {
				counter++;
				
			} else {
				if (hz) {
					field[y][x] = SHIP;
					field[y][x + 1] = SHIP;
					field[y][x + 2] = SHIP;
					field[y][x + 3] = SHIP;
				} else {
					field[y][x] = SHIP;
					field[y + 1][x] = SHIP;
					field[y + 2][x] = SHIP;
					field[y + 3][x] = SHIP;
				}
				outb++;
			}
			if (outb > 100) {
				System.out.println("Unable to place");
				System.exit(0);
			}
		}
	}

	void setFive(char[][] field, short ships[]) {
		boolean hz;
		int counter = 0;
		int outb = 0;
		while (counter < ships[4]) {
			int x = (int) (Math.random() * field[0].length);
			int y = (int) (Math.random() * field.length);
			int ra = (int) (Math.round(Math.random() * 2));
			if (ra == 1) {
				hz = true;
			} else {
				hz = false;
			}
			if (countAround(field, x, y, hz, 4)) {
				counter++;
				
			} else {
				if (hz) {
					field[y][x] = SHIP;
					field[y][x + 1] = SHIP;
					field[y][x + 2] = SHIP;
					field[y][x + 3] = SHIP;
					field[y][x + 4] = SHIP;
				} else {
					field[y][x] = SHIP;
					field[y + 1][x] = SHIP;
					field[y + 2][x] = SHIP;
					field[y + 3][x] = SHIP;
					field[y + 4][x] = SHIP;
				}
				outb++;
			}
			if (outb > 100) {
				System.out.println("Unable to place");
				System.exit(0);
			}
		}
	}

}