package main;

public class Player {

	static int x = 0;
	static int y = 0;
	static String pos = "  ";
	String ind="";
	static String indc="";
	
	String rook = "R";
	String knight = "C";
	String bishop = "B";
	String king = "K";
	String queen = "Q";
	String pawn = "P";

	public Player() {
		x = Plays.getX();
		y = Plays.getY();
		board.Board.setPos(x, y);
		pos = board.Board.getPos();

		indPlayer();

		if (pos.equals(rook)) {
			pieces.Rook rook = new pieces.Rook();
		} else if (pos.equals(knight)) {
			pieces.Knight knight = new pieces.Knight();
		} else if (pos.equals(bishop)) {
			pieces.Bishop bishop = new pieces.Bishop();
		} else if (pos.equals(queen)) {
			pieces.Queen queen = new pieces.Queen();
		} else if (pos.equals(pawn)) {
			pieces.Pawn pawn = new pieces.Pawn();
		} else if (pos.equals(king)) {
			pieces.King king = new pieces.King();
		} else {
			Plays.Countpl(1);
			System.out.println("Invalid Play \n Try Again");
		}
		new Plays();
	}

	private void indPlayer() {
		rook += Plays.getInd();
		knight += Plays.getInd();
		bishop += Plays.getInd();
		king += Plays.getInd();
		queen += Plays.getInd();
		pawn += Plays.getInd();
		ind();
	}

	private void ind(){
		indc=Plays.getInd();
		
		if (ind.contentEquals("W")){
			indc="W";
		}
		if (ind.contentEquals("B")){
			indc="B";
		}
		
	}
	
	static public String getIndc(){
		return indc;
	}
}
