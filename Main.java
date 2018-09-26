public class Main {

	public static void main(String[] args) {
		
		Field f = new Field();
		short[] sh = new short[5];
		sh[0] = 1;		//1x1
		sh[1] = 2;		//2x1
		sh[2] = 2;		//3x1
		sh[3] = 2;		//4x1
		sh[4] = 1;		//5x1
		char[][] player1 = f.create(12,19);
		f.place(player1, sh);
		System.out.println();
		f.print(player1);

	}

}