
public class ChickenBurger extends Burger{

	public ChickenBurger(int s, int nr, boolean b) {
		super(s, nr, b);
	}

	@Override
	public double getTimpPreparare() {
		double timp = 5*this.getNumarStraturiCarne();
		if(this.getSimpluSauMeniu() == true)
			timp += 25;
		timp *= Math.random()+1;
		return timp;
	}

	@Override
	public String toString() {
		String temp = "";
		if(this.getSimpluSauMeniu() == true)
			temp = " burgerul a fost comandat la meniu si are si cartofi in plus ";
		else
			temp = " burgerul a fost comandat simplu si nu are cartofi ";
		return "ChickenBurger nr_straturi:"+this.getNumarStraturiCarne()+
				" nr_masa:"+this.getNumarMasa() + temp;
	}
}
