
public class Antrenament {
	private Exercitiu[] exercitii = new Exercitiu[10];
	private int contor;
	
	public boolean adaugaExercitiu(Exercitiu ex) {
		if(this.contor == exercitii.length)
			return false;
		exercitii[contor++] = ex;
		return true;
	}
	
	public Exercitiu celMaiEficient(double min) {
		Exercitiu maxim = exercitii[0];
		if(this.contor == 0)
			return null;
		for(int i=0;i<contor;i++)
			if(maxim.calculeazaCalorii(min) < exercitii[i].calculeazaCalorii(min))
				maxim = exercitii[i];
		return maxim;
	}
	
	public String toString() {
		String temp = "";
		for(int i=0;i<this.contor;i++)
			temp += exercitii[i] + "\n";
		return temp;
	}
	
	public static void main(String[] args) {
		ExercitiuSimplu ex1 = new ExercitiuSimplu("Brate",23);
		ExercitiuSimplu ex3 = new ExercitiuSimplu("Picioare",25);
		ExercitiuSimplu[] e = {ex1};
		Exercitiu ex2 = new ExercitiuCompus("UpperBody",e);
		//System.out.println(ex2);
		Antrenament a = new Antrenament();
		a.adaugaExercitiu(ex2);
		a.adaugaExercitiu(ex3);
		System.out.println(a);
		System.out.println(a.celMaiEficient(60));
		
	}
}
