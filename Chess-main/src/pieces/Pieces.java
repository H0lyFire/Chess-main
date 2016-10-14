package pieces;

public class Pieces extends Coordenates {
	int xi, yi, xf, yf;
	char xfl, yfn;
	int posi = 0;
	String mem = "";
	String memi = "";
	String memf = "";
	String memp = "";
	char memip = ' ';
	char memfp = ' ';
	
	public Pieces(int xi, int yi, int xf, int yf, char xfl, char yfn, int posi, String mem, String memi, String memf,
			char memip, char memfp) {
		super(xi, yi, xf, yf, xfl, yfn);
		this.xi = xi;
		this.yi = yi;
		this.xf = xf;
		this.yf = yf;
		this.xfl = xfl;
		this.yfn = yfn;
		this.posi = posi;
		this.mem = mem;
		this.memi = memi;
		this.memf = memf;
		this.memip = memip;
		this.memfp = memfp;
	}

	public int getPosi() {
		return posi;
	}

	public void setPosi(int posi) {
		this.posi = posi;
	}

	public String getMem() {
		return mem;
	}

	public void setMem(String mem) {
		this.mem = mem;
	}

	public String getMemi() {
		return memi;
	}

	public void setMemi(String memi) {
		this.memi = memi;
	}

	public String getMemf() {
		return memf;
	}

	public void setMemf(String memf) {
		this.memf = memf;
	}

	public String getMemp() {
		return memp;
	}

	public void setMemp(String memp) {
		this.memp = memp;
	}

	public char getMemip() {
		return memip;
	}

	public void setMemip(char memip) {
		this.memip = memip;
	}

	public char getMemfp() {
		return memfp;
	}

	public void setMemfp(char memfp) {
		this.memfp = memfp;
	}

}
