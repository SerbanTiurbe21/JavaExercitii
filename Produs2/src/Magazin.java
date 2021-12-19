
public class Magazin {
	private String nume;
	private Produs[] produse;
	
	public Magazin(String name, Produs[] array) {
		this.nume = name;
		this.produse = array;
	}
	
	public int totalCantitati() {
		int suma = 0;
		for(int i=0;i<produse.length;i++)
			suma += produse[i].getCantitate();
		return suma;
	}
	
	public double vindeStoc() {
		double suma = 0;
		for(int i=0;i<produse.length;i++) {
			suma += produse[i].vindeProdus((int)(Math.random()*10));
		}
		return suma;
	}
	
	public String toString() {
		String temp = this.nume + "\n";
		for(int i=0;i<produse.length;i++)
			temp += produse[i] + "\n";
		return temp;
	}
	
	public static void main(String[] args) {
		Produs p1 = new ProdusBucata("Paine",10,3);
		Produs p2 = new ProdusBax("Faina",20,6);
		Produs[] produse = {p1,p2};
		Magazin m1 = new Magazin("Profi",produse);
		System.out.println(m1);
		System.out.println(m1.totalCantitati());
		m1.vindeStoc();
		System.out.println(m1.totalCantitati());
		
		Produs p3 = new ProdusBucata("Ceai",20,5);
		Produs p4 = new ProdusBax("Zahar",50,5);
		Produs[] produse2 = {p3,p4};
		Magazin m2 = new Magazin("Lidl",produse2);
		System.out.println(m2);
		System.out.println(m1.vindeStoc() > m2.vindeStoc() ? m1 : m2);
	}
}
