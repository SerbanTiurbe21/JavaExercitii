
public abstract class Produs {
	protected String nume;
	protected int cantitate;
	protected double pret;
	
	public Produs(String name, int cant, double price) {
		this.nume = name;
		this.cantitate = cant;
		this.pret = price;
	}
	
	protected String getNume() {
		return this.nume;
	}
	
	protected int getCantitate() {
		return this.cantitate;
	}
	
	protected double getPret() {
		return this.pret;
	}
	
	public abstract double vindeProdus(int nrArticole);
	public abstract String toString();
}
