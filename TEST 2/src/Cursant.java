
public abstract class Cursant {
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected float punctaj = 0;
	
	public Cursant(String name, String pre, int v) {
		this.nume = name;
		this.prenume = pre;
		this.varsta = v;
	}
	
	public abstract void primestePunctaj(double param);
	
	public abstract String toString();
	
	public String getNume() {
		return this.nume;
	}
	
	public String getPrenume() {
		return this.prenume;
	}
	
	public int getVarsta() {
		return this.varsta;
	}
	
	public float getNota() {
		return this.punctaj;
	}
}
