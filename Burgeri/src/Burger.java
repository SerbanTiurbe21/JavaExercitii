
public abstract class Burger {
	protected int straturiCarne, numarMasa;
	protected boolean simpluSauMeniu;
	
	public Burger(int s, int nr, boolean b) {
		this.straturiCarne = s;
		this.numarMasa = nr;
		this.simpluSauMeniu = b;
	}
	
	public abstract double getTimpPreparare();
	public abstract String toString();
	
	public int getNumarStraturiCarne() {
		return this.straturiCarne;
	}
	
	public boolean getSimpluSauMeniu() {
		return this.simpluSauMeniu;
	}
	
	public int getNumarMasa() {
		return this.numarMasa;
	}
}
