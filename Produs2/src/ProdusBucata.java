
public class ProdusBucata extends Produs{
	public ProdusBucata(String name, int cant, int price) {
		super(name, cant, price);
	}

	@Override
	public double vindeProdus(int nrArticole) {
		double articoleVandute = nrArticole * this.getPret();
		this.cantitate -= nrArticole;
		return articoleVandute;
	}

	@Override
	public String toString() {
		return "ProdusBucata->nume:" + this.nume + "->cantiate:"+
				this.cantitate + "->pret:" + this.pret; 
	}
}
