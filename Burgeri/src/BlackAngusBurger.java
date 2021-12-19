
public class BlackAngusBurger extends Burger{

	private String cumTrebuiteGatitaVita;
	
	public BlackAngusBurger(int s, int nr, boolean b, String vita) {
		super(s, nr, b);
		this.cumTrebuiteGatitaVita = vita;
	}

	@Override
	public double getTimpPreparare() {
		double timp = 7 * this.getNumarStraturiCarne();
		if(this.getSimpluSauMeniu() == true)
			timp += 20;
		if(this.getCumTrebuieGatitaVita().equals("medium")) {
			timp += 30;
		}
		else if(this.getCumTrebuieGatitaVita().equals("medium")) {
			timp += 40;
		}
		else if(this.getCumTrebuieGatitaVita().equals("rare")) {
			timp += 20;
		}
		timp *= Math.random()+2;
		return timp;
	}

	@Override
	public String toString() {
		String temp = "";
		if(this.getSimpluSauMeniu() == true)
			temp = " burgerul a fost comandat la meniu si are si cartofi in plus ";
		else
			temp = " burgerul a fost comandat simplu si nu are cartofi ";
		return "BlackAngusBurger nr_straturi:"+this.getNumarStraturiCarne()+
				" nr_masa:"+this.getNumarMasa() + temp +" "+ 
				"vita este gatita:"+this.getCumTrebuieGatitaVita();
	}
	
	private String getCumTrebuieGatitaVita() {
		return this.cumTrebuiteGatitaVita;
	}
}
