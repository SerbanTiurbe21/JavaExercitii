
public class Camion extends Autovehicul{
	private String nrInm;
	private double greutateCamion;
	private Autoturism[] autoturisme = new Autoturism[1024];
	private int contor;
	
	public Camion(String nr, double gc) {
		this.nrInm = nr;
		this.greutateCamion = gc;
	}
	
	public boolean adaugaAutoturism(Autoturism a) {
		if(this.contor == autoturisme.length) {
			Autoturism[] array2 = new Autoturism[2*this.contor];
			for(int i=0;i<contor;i++)
				array2[i] = autoturisme[i];
			autoturisme = array2;
		}
		autoturisme[contor++] = a;
		return true;
	}
	
	public double calculeazaGreutateTotala() {
		return this.getGreutateCamion() + this.getCantitateAutoturisme();
	}
	
	public String toString() {
		String temp = "Numar inmatriculare:" + this.nrInm + ", Greutate autovehicul:"
				+ this.getGreutateCamion() + ",(";
		for(int i=0;i<contor;i++)
			temp += autoturisme[i] + ", ";
		return temp + ")";
	}
	
	private double getGreutateCamion() {
		return this.greutateCamion;
	}
	
	private double getCantitateAutoturisme() {
		double suma = 0;
		for(int i=0;i<contor;i++)
			suma += autoturisme[i].calculeazaGreutateTotala();
		return suma;
	}
}
