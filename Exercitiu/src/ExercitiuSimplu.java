
public class ExercitiuSimplu extends Exercitiu{
	private String nume;
	private int caloriiPeMin;
	
	public ExercitiuSimplu(String name, int cal) {
		this.nume = name;
		this.caloriiPeMin = cal;
	}
	
	@Override
	public double calculeazaCalorii(double min) {
		return min * this.getCaloriiPeMin();
	}
	
	public String toString() {
		return "Simplu - " + this.getNume() + " - " + this.getCaloriiPeMin();
	}
	
	private String getNume() {
		return this.nume;
	}
	
	private int getCaloriiPeMin() {
		return this.caloriiPeMin;
	}

}
