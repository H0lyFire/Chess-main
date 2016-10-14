package pieces;

import java.util.Scanner;

public abstract class CheckAll extends Pieces {

	public static final int STRADIA = 0;
	public static final int STRAIGHT = 1;
	public static final int DIAGONAL = 2;
	public static final int LLINE = 3;
	public static int mov;
	Scanner sc = new Scanner(System.in);

	public CheckAll(int xi, int yi, int xf, int yf, char xfl, char yfn, int posi, String mem, String memi, String memf,
			char memip, char memfp) {
		super(xi, yi, xf, yf, xfl, yfn, posi, mem, memi, memf, memip, memfp);

	}

	public void check() {
		
// ***************************************STRAIGHT LINE**************************************
		if (mov == 1 || mov==0) {
			if (xf == xi) {
				for (int checky = 1; checky < (Math.abs(yf - yi)); checky++) {
					if (yf > yi) {
						board.Board.setPos(xi, Math.abs(yi + checky));
						mem = board.Board.getPos();
					} else if (yf < yi) {
						board.Board.setPos(xi, Math.abs(yi - checky));
						mem = board.Board.getPos();
					}
					if (mem.contentEquals("  ")) {
						posi++;
					} else {
						main.Plays.Countpl(1);
						break;
					}
				}

			} else if (yf == yi) {
				for (int checkx = 1; checkx < (Math.abs(xf - xi)); checkx++) {
					if (xf > xi) {
						board.Board.setPos(Math.abs(xi + checkx), yf);
						mem = board.Board.getPos();
					} else if (xf < xi) {
						board.Board.setPos(Math.abs(xi - checkx), yf);
						mem = board.Board.getPos();
					}
					if (mem.contentEquals("  ")) {
						posi++;
					} else {
						main.Plays.Countpl(1);
						break;
					}
				}
			}
		}
// ***************************************DIAGONAL LINE***************************************
// ***************************************LLINE***********************************************
// ***************************************STRAIGHT and DIAGONAL LINE**************************
		board.Board.setPos(xi, yi);
		memi = board.Board.getPos();
		board.Board.setPos(xf, yf);
		memf = board.Board.getPos();
		memfp = memf.charAt(1);
		memip = memi.charAt(1);

	}
}
