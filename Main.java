public class Main {

	public static void main(String[] args) {
		
		Field f = new Field();
		
		char[][] player1 = f.create(9,12);
		f.place(player1, 10);
		System.out.println();
		f.print(player1);

	}

}