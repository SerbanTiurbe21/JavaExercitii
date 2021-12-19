
public class ProdusBax extends Produs{
	public ProdusBax(String name, int cant, int price) {
		super(name, cant, price);
	}

	@Override
	public double vindeProdus(int nrArticole) {
		double vandute = nrArticole * 6 * this.getPret() * 0.9;
		this.cantitate -= nrArticole;
		return vandute;
	}

	@Override
	public String toString() {
		return "ProdusBax->nume:" + this.nume + "->cantiate:"+
				this.cantitate + "->pret:" + this.pret;
	}
}
