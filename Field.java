
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
			int x = (int) (Math.random() * field.length);
			int y = (int) (Math.random() * field.length);

			if (field[y][x] != 's') {
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						if (field[i][j] > field.length || field[i][j] < field.length) {
							System.out.println("im if");
							continue;
						} else {
							if (field[y+1][x]=='s'||field[y-1][x-1]=='s') {
								continue;
							}else {
								field[y][x] = 's';
							}
							
						}
					}
				}

				counter++;
			} else {
				System.out.println("gleich");
				continue;
			}

		}

	}
}
