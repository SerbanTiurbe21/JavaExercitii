
public class SocietateRaspundereLimitata extends Intreprindere{
	
	public SocietateRaspundereLimitata(String name) {
		super(name);
	}

	public void setCapital() {
		this.capitalSocial = 0;
	}
	
	@Override
	public void investeste(int x) {
		double rand = Math.random();
		if(rand < 0.5) {
			System.out.println("Investitie esuata!");
		}
		else {
			this.capitalSocial += 2*x;
		}
	}

	@Override
	public String toString() {
		return "SocietateRaspundereLimitata" + "->nume:" + this.numeIntreprindere +
				"->capital social:" + this.capitalSocial;
	}
}
