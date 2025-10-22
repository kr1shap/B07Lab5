package lab4;

public class Rectangle {
	double length;
	double width;
	public Rectangle(double l, double w)
	{
		this.length=l;
		this.width=w;
	}
	public double perimeter()
	{
		return 2*this.length+2*this.width;
	}
	public double area()
	{
		return length*width;
	}
	public boolean isSquare()
	{
		return length==width;
	}

}
