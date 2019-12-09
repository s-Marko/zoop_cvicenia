package cvicenia5.cvicenie5;

public class Citizen {
	String name;
	double height;
	double weigth;
	
	public Citizen(String name, double height, double weigth) {
		this.name = name;
		this.height = height;
		this.weigth = weigth;
	}
	
	public Citizen() {
		this.name = "";
		this.height = 0;
		this.weigth = 0;
	}
	
	protected Citizen clone() {
		Citizen clone = new Citizen(this.name, this.height, this.weigth);
		return clone;
	}
}
