
public class Piata {
	private String numePiata;
	private Intreprindere[] vector;
	
	public Piata(String name, Intreprindere[] array) {
		this.numePiata = name;
		this.vector = array;
	}
	
	public void investesteSuma(int index, int suma) {
		for(int i=0;i<vector.length;i++) {
			vector[index%vector.length].investeste(suma);
		}
	}
	
	public String toString() {
		String temp = "";
		for(int i=0;i<vector.length;i++)
			temp += vector[i] + "\n";
		return temp;
	}
	
	public static void main(String[] args) {
		SocietateRaspundereLimitata s1 = new SocietateRaspundereLimitata("IBM");
		SocietateActiuni s2 = new SocietateActiuni("MICROSOFT",10);
		SocietateRaspundereLimitata s3 = new SocietateRaspundereLimitata("UBISOFT");
		SocietateActiuni s4 = new SocietateActiuni("MICROSOFT",100);
		Intreprindere[] array = {s1,s2};
		Intreprindere[] array2 = {s3,s4};
		
		Piata p1 = new Piata("Salonta",array);
		System.out.println("Piata 1 \n"+p1);//piata fara nicio investitie
		s1.investeste(100);//aici fac o investitie
		//System.out.println(s1);//afisez sa vad daca s-a facut investitia
		//System.out.println(p1);//afisez sa vad daca s-a facut update la investitie si in colectia de intreprinderi
		
		Piata p2 = new Piata("Cris",array2);
		System.out.println("Piata 2 \n" + p2);//afisez piata 2
		p2.investesteSuma(10, 100);//fac o investitie n piata
		System.out.println(p2);//afisez sa vad daca am facut bine investitia
	}
}
