package cvicenia4;

public class Cuboid {
	double sideA;
	double sideB;
	double sideC;
	
	private Cuboid(double side) {
		this.sideA = side;
		this.sideB = side;
		this.sideC = side;
	}
	
	private Cuboid(double sideA, double sideB) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideA;
	}
	
	private Cuboid(double sideA, double sideB, double sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}
}
