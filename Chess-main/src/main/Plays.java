package main;

import java.util.Scanner;

import board.Board;

public final class Plays {
	Scanner sc = new Scanner(System.in);
	static int countpl = 0;
	static int x;
	static int y;
	char xl = ' ';
	char yn = ' ';
	static String ind = "";
	static Board bo = new Board();
	int begin = 0;

	public Plays() {
		do {
			countpl++;

			bo.Board();
			if ((countpl % 2) == 0) {
				System.out.println("Black Player");
				ind = "B";
			} else if ((countpl % 2) != 0) {
				System.out.println("White Player");
				ind = "W";
			}

			System.out.print("Piece Position X - ");
			xl = sc.next().charAt(0);
			System.out.print("Piece Position Y - ");
			yn = sc.next().charAt(0);

			if (Character.isDigit(xl)) {
				Countpl(1);
			} else {

				board.Board.subCoor(xl, yn);

				x = board.Board.getContl();
				y = board.Board.getContn();
				begin = 1;
				new Player();
			}
			begin = 0;
		} while (begin == 0);
	}

	public static int getX() {
		return x;
	}

	public static int getY() {
		return y;
	}

	public static int Countpl(int t) {
		countpl -= t;
		return countpl;
	}

	public static String getInd() {
		return ind;
	}

}
