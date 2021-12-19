
public class ProdusImbracaminte extends Produs{

	private String material;
	
	public ProdusImbracaminte(String n, double p, String mat) {
		super(n, p);
		this.material = mat;
	}

	@Override
	public void aplicaReducere(double procent) {
		if(procent < 0.95)
			this.pret = this.pret - this.pret * procent;
		else {
			this.pret = this.pret - this.pret * 0.95;
		}
	}

	@Override
	public String toString() {
		return this.getClass().getName() + "->nume:" + this.nume +
			   "->pret:" + this.pret + "->material:" + this.material;
	}
}
