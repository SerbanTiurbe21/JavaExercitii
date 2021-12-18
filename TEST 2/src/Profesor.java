
public class Profesor {
	private String materie;
	private Cursant[] cursanti;
	
	public Profesor(String m, Cursant[] array) {
		this.materie = m;
		this.cursanti = array;
	}
	
	public void evalueaza() {
		for(int i=0;i<cursanti.length;i++) {
			cursanti[i].primestePunctaj((float) (Math.random()*10));
		}
	}
	
	public String media() {
		float suma = 0, media;
		for(int i=0;i<cursanti.length;i++)
			suma += cursanti[i].getNota();
		media = suma/cursanti.length;
		return "Media:"+media;
	}
	
	public String toString() {
		String temp = "Profesor->materia:" + this.materie + "\n";
		for(int i=0;i<cursanti.length;i++)
			temp += cursanti[i] + "\n";
		return temp;
	}
	
	public static void main(String[] args) {
		Cursant c1 = new Elev("Tiurbe","Serban",5);
		Cursant c2 = new Student("Suciu","Sanuta",24);
		Cursant c3 = new Student("Bula","Giulia",20);
		Cursant[] array = {c1,c2,c3};
		Profesor p1 = new Profesor("Biologie",array);
		//System.out.println(c1 + "\n" + c2 + "\n" + c3);
		System.out.println(p1);
		p1.evalueaza();
		System.out.println(p1);
		System.out.println(p1.media());
		
		
	}
}
