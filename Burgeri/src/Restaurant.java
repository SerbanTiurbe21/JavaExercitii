
public class Restaurant {
	private Burger[] burgeri = new Burger[20];
	private int contor;
	
	public boolean adaugaComanda(Burger hamburger) {
		if(this.contor == burgeri.length)
			return false;
		burgeri[contor++] = hamburger;
		return true;
	}
	
	public String afiseazaDetaliiMasa(int numarMasa) {
		String temp = "Numarul mesei cerute:" + numarMasa + "\n";
		for(int i=0;i<contor;i++)
			if(burgeri[i].getNumarMasa() == numarMasa)
				temp += burgeri[i];
		return temp;
	}
	
	public static void main(String[] args) {
		Burger b1 = new ChickenBurger(2,1,true);
		Burger b2 = new BlackAngusBurger(1,1,false,"medium");
		Burger b3 = new BlackAngusBurger(1,2,true,"well");
		//System.out.println(b1 + "\n" + b2 + "\n" + b3);
		
		Restaurant r1 = new Restaurant();
		r1.adaugaComanda(b1);
		r1.adaugaComanda(b2);
		r1.adaugaComanda(b3);
		
		//System.out.println(r1.afiseazaDetaliiMasa(2));
		//System.out.println(r1.afiseazaDetaliiMasa(1));
		System.out.println(b2.getTimpPreparare());
	}
}
