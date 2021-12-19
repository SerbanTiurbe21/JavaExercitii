
public class ProdusElectronic extends Produs{

	private boolean resigilat;
	
	public ProdusElectronic(String n, double p, boolean r) {
		super(n, p);
		this.resigilat = r;
	}

	@Override
	public void aplicaReducere(double procent) {
		if(procent + 0.2 < 0.95)
			this.pret = this.pret - this.pret * (0.2 + procent);
		else {
			this.pret = this.pret - this.pret * 0.95;
		}
	}

	@Override
	public String toString() {
		String temp = " ";
		if(this.resigilat == true)
			temp = "produs resigilat";
		else
			temp = "produs sigilat";
		return this.getClass().getName() + "->nume:" + this.nume +
				   "->pret:" + this.pret + "->resigilat:" + temp;
	}
	
}
