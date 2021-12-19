
public class MagazinOnline {
	private Produs[] produse = new Produs[1024];
	private int contor;
	
	public boolean adaugaProdus(Produs prod) {
		if(this.contor == produse.length)
			return false;
		produse[contor++] = prod;
		return true;
	}
	
	public void aplicaReducereBlackFriday(double procent) {
		for(int i=0;i<contor;i++)
			produse[i].aplicaReducere(procent);
	}
	
	public String toString() {
		String temp = "";
		for(int i=0;i<contor;i++)
			temp += produse[i] + "\n";
		return temp;
	}
	
	public static void main(String[] args) {
		ProdusElectronic pe = new ProdusElectronic("Samsung",1000,false);
		ProdusImbracaminte pi = new ProdusImbracaminte("Tricou",30,"bumbac");
		MagazinOnline m1 = new MagazinOnline();
		
		//System.out.println(pe + "\n" + pi);
		m1.adaugaProdus(pe);
		m1.adaugaProdus(pi);
		System.out.println("Inainte de reduceri \n"+m1);
		pe.aplicaReducere(0.10);
		pi.aplicaReducere(0.96);
		System.out.println("Dupa reduceri \n"+m1);
	}
}
