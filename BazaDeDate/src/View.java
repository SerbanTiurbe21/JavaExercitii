
public class View extends Element{
	private String nume, owner;
	private Tabela tabela1, tabela2;
	
	public View(String n, String ow, Tabela t1, Tabela t2) {
		this.nume = n;
		this.owner = ow;
		this.tabela1 = t1;
		this.tabela2 = t2;
	}
	
	public double accessTime(double coef) {
		double media = (this.tabela1.accessTime(coef) + this.tabela2.accessTime(coef))/2;
		return coef * media;
	}
	
	public String toString() {
		String temp = this.owner + "@" + this.nume + ":" + "<" + this.tabela1 + 
				">" + "<" + this.tabela2 + ">";
		return temp;
	}
}
