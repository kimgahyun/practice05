package prob4;

public class RectTriangle extends Shape {

	private double width;
	private double height;
	
	public RectTriangle(double i, double j) {
		width = i;
		height = j;
	}

	@Override
	double getArea() {
		return (width*height)/2;
	}

	@Override
	double getPerimeter() {
		return  (width + height+ Math.sqrt((width*width) + (height*height)));
	}

}
;