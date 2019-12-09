package cvicenia3;

public class Rectangle {
	double length;
	double height;
	
	
	public boolean isSquare() {
		if (this.length == this.height)
			return true;
		return false;
	} 
	
	public double getArea() {
		return length * height;
	}
	
	public double getPerimeter() {
		return (2*length + 2*height);
	}
	
	public Rectangle(double length, double height) {
		this.length = length;
		this.height = height;
	}
}
