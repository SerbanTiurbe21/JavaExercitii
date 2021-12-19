import java.util.*;

public class Schema {
	private Element[] elemente = new Element[1024];
	private int contor;
	
	public boolean addDbElement(Element elem) {
		if(this.contor == elemente.length)
			return false;
		elemente[contor++] = elem;
		return true;
	}
	
	public double performanceOverview(double coef) {
		double suma = 0;
		for(int i=0;i<this.contor;i++)
			suma += elemente[i].accessTime(coef);
		return (suma/this.contor);
	}
	
	public String toString() {
		String temp = "";
		for(int i=0;i<this.contor;i++)
			temp += elemente[i] + " ";
		return temp;
	}
	
	public static void main(String[] args) {
		Tabela t1 = new Tabela("SDA","Alin",10);
		Tabela t2 = new Tabela("POO","Dusan",5);
		Tabela t3 = new Tabela("AC","Flavius",20);
		Tabela t4 = new Tabela("CD","Mircea",15);
		View v1 = new View("TS","Dragomir",t1,t2);
		Schema s1 = new Schema();
		s1.addDbElement(t3);
		s1.addDbElement(t4);
		s1.addDbElement(v1);
		System.out.println(s1);
		double lol = s1.performanceOverview(0.1);
		System.out.println(lol);
	}
}
