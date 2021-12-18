
public class Elev extends Cursant{

	public Elev(String name, String pre, int v) {
		super(name, pre, v);
	}

	@Override
	public void primestePunctaj(double param) {
		if(param > 10) {
			this.punctaj = 10;
		}
		else {
			this.punctaj= (float) Math.ceil(param+1.5);
		}
	}

	@Override
	public String toString() {
		return "Elev->nume:" + this.nume + "->prenume:" + this.prenume +
				"->varsta:" + this.varsta + "->punctaj" + this.punctaj;
	}

}
