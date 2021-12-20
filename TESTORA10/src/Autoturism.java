
public class Autoturism extends Autovehicul{
	private String nrInm;
	private double greutateAutovehicul, greutatePasageri;
	
	public Autoturism(String nr, double ga, double gp) {
		this.nrInm = nr;
		this.greutateAutovehicul = ga;
		this.greutatePasageri = gp;
	}
	
	public double calculeazaGreutateTotala() {
		return this.getGreutateAutovehicul() + this.getGreutatePasageri();
	}
	
	private double getGreutateAutovehicul() {
		return this.greutateAutovehicul;
	}
	
	private double getGreutatePasageri() {
		return this.greutatePasageri;
	}
	
	public String toString() {
		return "Numar inmatriculare:" + this.nrInm + ", Greutate autovechicul:" + 
				this.getGreutateAutovehicul() + ", Greutate pasageri:" +
				this.getGreutatePasageri();
	}
}
