package prob4;

public class Rectangle extends Shape implements Resizable{

	private double width;
	private double height;
	
	public Rectangle(double i, double j) {
		width = i;
		height = j;
	}

	@Override
	public void resize(double d) {
		width *= d;
		height *= d;
	}

	@Override
	double getArea() {
		return width*height;
	}

	@Override
	double getPerimeter() {
		return (width + height)*2;
	}

}
