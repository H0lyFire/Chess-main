package pieces;

import java.util.Scanner;
import main.Plays;

public class Rook {
	Scanner sc = new Scanner(System.in);
	int xi = 0;
	int yi = 0;
	int xf = 0;
	int yf = 0;
	char xfl = ' ';
	char yfn = ' ';
	int posi = 0;
	String mem = "";
	String memi = "";
	String memf = "";
	String memp = "";
	char memip=' ';
	char memfp=' ';
	public Rook() {
		xi = main.Plays.getX();
		yi = main.Plays.getY();

		System.out.print("Posicao Final X - ");
		xfl = sc.next().charAt(0);
		System.out.print("Posicao Final Y - ");
		yfn = sc.next().charAt(0);

		board.Board.subCoor(xfl, yfn);

		xf = board.Board.getContl();
		yf = board.Board.getContn();

		if (xf > 8 || xf < 0 || yf > 8 || yf < 0) {
			main.Plays.Countpl(1);
			System.out.println("Invalid Play \n Try Again");
		} else {
			board.Board.setPos(xf, yf);
			mem = board.Board.getPos();

			for (int i = 0; i <= (Math.abs(xf - xi)); i++) {
				if (xi == xf && yi == yf) {
					main.Plays.Countpl(1);
					System.out.println("Invalid Play \n Try Again");
					break;
				}
				if (xi != xf && yi != yf) {
					main.Plays.Countpl(1);
					System.out.println("Invalid Play \n Try Again");
					break;
				}

				if (yi == yf) {
					for (int f = 0; f <= (Math.abs(yf - yi)); f++) {
						check();
					}
				}
				if (xi == xf) {
					for (int f = 0; f <= (Math.abs(xf - xi)); f++) {
						check();
					}
				}

				if (memfp==memip) {
					main.Plays.Countpl(1);
					System.out.println("Invalid Play \n Try Again");
					break;
				}
			}
			if (posi != 0 && memi != memf) {
				board.Board.setPos(xi, yi);
				board.Board.setPosfi(xi, yi, board.Board.getPos(), xf, yf);
			}
		}
	}

	public void check() {

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
				board.Board.setPos(xi, yi);
				memi = board.Board.getPos();
				board.Board.setPos(xf, yf);
				memf = board.Board.getPos();
			}

		} else if (xf != xi) {
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
				board.Board.setPos(xi, yi);
				memi = board.Board.getPos();
				board.Board.setPos(xf, yf);
				memf = board.Board.getPos();
				memfp=memf.charAt(1);
				memip=memi.charAt(1);
			}
		}
	}
}
