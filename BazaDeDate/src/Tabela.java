
public class Tabela extends Element{
	private String nume, owner;
	private int dimensiune;
	
	public Tabela(String n, String ow, int d) {
		this.nume = n;
		this.owner = ow;
		this.dimensiune = d;
	}
	
	public double accessTime(double coef) {
		return coef * this.getDimensiune();
	}
	
	public String toString() {
		return this.owner + "@" + this.nume + ":<" + this.dimensiune + ">";
	}
	
	private int getDimensiune() {
		return this.dimensiune;
	}
}
