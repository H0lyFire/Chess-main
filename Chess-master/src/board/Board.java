package board;

public final class Board {
	static String[][] chess = new String[8][8];
	static char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };
	static char[] numbers = { '8', '7', '6', '5', '4', '3', '2', '1' };
	static char num = ' ';
	static char let = ' ';
	static int contl = 0;
	static int contn = 0;
	int xp = 0;
	int yp = 0;
	int x = 0;
	int y = 0;
	int begin = 0;
	String memrb = "RB";
	String memcb = "CB";
	String membb = "BB";
	String memkb = "KB";
	String memqb = "QB";
	String[] mempb = new String[9];

	String memrw = "RW";
	String memcw = "CW";
	String membw = "BW";
	String memkw = "KW";
	String memqw = "QW";
	String[] mempw = new String[9];

	static String pos = "  ";

	public void Board() {
		mempb[8] = "PB";
		mempw[8] = "PW";
		if (begin == 0) {
			for (int x = 0; x < 8; x++) {

				for (int y = 0; y < 8; y++) {
					chess[x][y] = "  ";
				}
			}
		}
		positioningPieces();

		for (int contnu = 0; contnu < 1; contnu++) {
			for (int contnu2 = 0; contnu2 < 9; contnu2++) {
				if (contnu2 == 0) {
					System.out.println("-----------------------------------------------------------");
					System.out.print("|    || X |");
				} else {
					contnu2--;
					System.out.print("|  " + letters[contnu2] + " |");
					contnu2++;
				}
			}
			System.out.println("");
			System.out.println("-----------------------------------------------------------");
			System.out.print("|  Y ||   ||    ||    ||    ||    ||    ||    ||    ||    |");
			for (int conty = 0; conty < 8; conty++) {
				for (int contx = 0; contx < 8; contx++) {
					if (contx == 0) {
						System.out.println("\n-----------------------------------------------------------");
						System.out.print("|  " + numbers[conty] + " ||   || " + chess[contx][conty] + " |");
					} else {
						System.out.print("| " + chess[contx][conty] + " |");
					}

				}
			}
			System.out.print("\n-----------------------------------------------------------\n");
		}
	}

	public void positioningPieces() {
		if (begin == 0) {
			chess[0][0] = memrb;
			chess[1][0] = memcb;
			chess[2][0] = membb;
			chess[3][0] = memkb;
			chess[4][0] = memqb;
			chess[5][0] = membb;
			chess[6][0] = memcb;
			chess[7][0] = memrb;
			for (int i = 0; i < 8; i++) {
				chess[i][1] = mempb[8];
			}

			chess[0][7] = memrw;
			chess[1][7] = memcw;
			chess[2][7] = membw;
			chess[3][7] = memqw;
			chess[4][7] = memkw;
			chess[5][7] = membw;
			chess[6][7] = memcw;
			chess[7][7] = memrw;
			for (int i = 0; i < 8; i++) {
				chess[i][6] = mempw[8];
			}
			begin++;
		}
	}

	public static String getPos() {
		return pos;
	}

	public static void setPos(int x1, int y1) {
		pos = chess[x1][y1];
	}

	public static void setPosfi(int xi, int yi, String posfi, int xf, int yf) {
		chess[xf][yf] = posfi;
		chess[xi][yi] = "  ";
	}

	public static void subCoor(char l, char n) {
		contl = 0;
		contn = 0;
		for (int i = 0; i <= letters.length; i++) {
			if (l != letters[i]) {
				contl++;
			} else {
				letter();
				break;
			}
			//Estava a fazer o check das letras
			if(i==letters.length){
				System.out.print("Try Again");
			}
		}
		for (int i = 0; i <= numbers.length; i++) {
			if (n != numbers[i]) {
				contn++;
			} else {
				number();
				break;
			}
		}
	}

	public static int getContl() {
		return contl;
	}

	public static int getContn() {
		return contn;
	}

	public static void letter() {
		let = letters[contl];
	}

	public static void number() {
		num = numbers[contn];
	}

	public char lett() {
		return let;
	}

	public char numb() {
		return num;
	}
}
