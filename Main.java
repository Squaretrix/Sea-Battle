
public class Main {

	public static void main(String[] args) {
		
		Field f = new Field();
		
		char[][] player1 = f.create(5);
		// f.print(player1);
		f.place(player1, 5);
		System.out.println();
		f.print(player1);

	}

}
