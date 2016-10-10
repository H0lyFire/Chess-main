package pieces;

import java.util.Scanner;

public class Bishop {

	Scanner sc = new Scanner(System.in);
	int xi = 0;
	int yi = 0;
	int xf = 0;
	int yf = 0;
	int posi = 0;
	String mem = "";
	String memi = "";
	String memf = "";
	String memp = "";

	public Bishop() {
		xi = main.Plays.getX();
		yi = main.Plays.getY();
		System.out.print("Posicao Final X - ");
		xf = sc.nextInt();
		System.out.print("Posicao Final Y - ");
		yf = sc.nextInt();

		if (xf > 8 || xf < 0 || yf > 8 || yf < 0) {
			main.Plays.Countpl(1);
			System.out.println("Jogada Invalida \n Tenta outra vez");
		} else {
			board.Board.setPos(xf, yf);
			mem = board.Board.getPos();

			for (int i = 0; i <= (Math.abs(xf - xi)); i++) {
				if (xi == xf && yi == yf) {
					main.Plays.Countpl(1);
					System.out.println("Jogada Invalida \n Tenta outra vez");
					break;
				}
				if (xi != xf && yi != yf) {
					main.Plays.Countpl(1);
					System.out.println("Jogada Invalida \n Tenta outra vez");
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
			}
			if (posi != 0 && memi != memf && !memf.contentEquals("  ")) {
				board.Board.setPos(xi, yi);
				board.Board.setPosfi(xi, yi, board.Board.getPos(), xf, yf);
			}
		}

	}

	public void check() {

	}
}
