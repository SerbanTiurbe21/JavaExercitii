
public abstract class Produs {
	protected String nume;
	protected double pret;
	
	public Produs(String n, double p) {
		this.nume = n;
		this.pret = p;
	}
	
	public abstract void aplicaReducere(double procent);
	public abstract String toString();
}
