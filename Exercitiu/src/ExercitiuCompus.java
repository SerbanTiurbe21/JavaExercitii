
public class ExercitiuCompus extends Exercitiu{
	private String nume;
	private ExercitiuSimplu[] exercitiiSimple;
	
	public ExercitiuCompus(String name, ExercitiuSimplu[] array) {
		this.nume = name;
		this.exercitiiSimple = array;
	}
	
	@Override
	public double calculeazaCalorii(double min) {
		double suma = 0;
		for(int i=0;i<exercitiiSimple.length;i++)
			suma += exercitiiSimple[i].calculeazaCalorii(min);
		return suma;
	}

	@Override
	public String toString() {
		String temp = "Complex - " + this.getNume() + " <-> ";
		for(int i=0;i<exercitiiSimple.length;i++)
			temp += exercitiiSimple[i] + " ";
		return temp;
	}
	
	private String getNume() {
		return this.nume;
	}
}
