
public abstract class Intreprindere {
	protected String numeIntreprindere;
	protected float capitalSocial;
	
	public Intreprindere(String name) {
		this.numeIntreprindere = name;
	}
	
	abstract public void investeste(int x);
	
	public abstract String toString();
	
}
