import java.util.*;

public class Bac {
	private double greutateMaxima;
	private Autovehicul[] autovehicule = new Autovehicul[1024];
	private int contor;
	private double greutateCurenta = 0;
	
	public Bac(double g) {
		this.greutateMaxima = g;
	}
	
	public boolean adaugaAutovehicul(Autovehicul a) {
		if(this.greutateCurenta + a.calculeazaGreutateTotala() > this.greutateMaxima)
			return false;
		else {
			autovehicule[contor++] = a;
			greutateCurenta += a.calculeazaGreutateTotala();
			return true;
		}
	}
	
	public String toString() {
		String temp = "Greutate maxima:" + this.getGreutateMaxima() + ",(";
		for(int i=0;i<this.contor;i++)
			temp += autovehicule[i] + " ";
		return temp + ")";
		
	}
	
	private double getGreutateMaxima() {
		return this.greutateMaxima;
	}
	
	public static void main(String[] args) {
		Autoturism a1 = new Autoturism("BIHOR",4,0.3);
		Autoturism a2 = new Autoturism("ARAD",5,0.25);
		Autoturism a3 = new Autoturism("ALBA",4.5,0.15);
		Camion c1 = new Camion("SALAJ",10);
		c1.adaugaAutoturism(a1);
		c1.adaugaAutoturism(a2);
		Bac b1 = new Bac(20);
		b1.adaugaAutovehicul(a2);
		b1.adaugaAutovehicul(a2);
		b1.adaugaAutovehicul(a2);
		b1.adaugaAutovehicul(a2);
		b1.adaugaAutovehicul(a2);
		System.out.println(b1);
	}
}
