
public class Student extends Cursant{

	public Student(String name, String pre, int v) {
		super(name, pre, v);
	}

	@Override
	public void primestePunctaj(double param) {
		this.punctaj = (float) Math.floor(param + 0.5);	
	}

	@Override
	public String toString() {
		return "Student->nume:" + this.nume + "->prenume:" + this.prenume +
				"->varsta:" + this.varsta + "->punctaj" + this.punctaj;
	}

}
