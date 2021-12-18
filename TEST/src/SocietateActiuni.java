
public class SocietateActiuni extends Intreprindere{
	
	private int numarActionari;
	
	public SocietateActiuni(String name, int nr) {
		super(name);
		this.numarActionari = nr;
	}

	@Override
	public void investeste(int x) {
		double rand = Math.random();
		if(rand < 0.5) {
			System.out.println("Investitie esuata!");
		}
		else {
			this.capitalSocial += 10*(x/this.numarActionari);
		}
	}

	@Override
	public String toString() {
		return "SocietateActiuni" + "->numar actionari:" + this.numarActionari +
				"->nume:" + this.numeIntreprindere +
				"->capital social:" + this.capitalSocial;
	}
	
}
