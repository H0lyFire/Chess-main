package pieces;

public class Rook extends Pieces {

	public Rook(int xi, int yi, int xf, int yf, char xfl, char yfn, int posi, String mem, String memi, String memf,
			char memip, char memfp) {
		super(xi, yi, xf, yf, xfl, yfn, posi, mem, memi, memf, memip, memfp);

		CheckAll.mov = CheckAll.STRAIGHT;
		//CheckAll.check(xi, yi, xf, yf, xfl, yfn, posi, mem, memi, memf, memip, memfp);
		
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
						/*CheckAll.check(xi, yi, xf, yf, xfl, yfn, 
								posi, mem, memi, memf, memip, memfp);*/
					}
				}
				if (xi == xf) {
					for (int f = 0; f <= (Math.abs(xf - xi)); f++) {
						/*CheckAll.check(xi, yi, xf, yf, xfl, yfn, 
								posi, mem, memi, memf, memip, memfp);*/
					}
				}

				if (memfp == memip) {
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

}
