package b07lab5;

public class Circle {
	Point centre;
	double radius; 
	
	// constructor
	
	public Circle(Point centre, double radius) {   
		this.centre = centre;
		this.radius = radius;
	}
	
	// diameter 
	
	public double getDiameter() {
		return 2*(this.radius);
	}
	
	// circumference 
	
	public double getCircumference() {
		
		return 2 * radius * Math.PI ;
	}
	
	// area 
	
	public double getArea() {

		return Math.PI * radius * radius;
	}
	
	// arc length 
	
	public double getArcLength(double angleInRadians) {
		
		// if angle too big, either simply or ask user try again
		
		return radius * angleInRadians;
	}
	
	// overlap
	
	public boolean checkOverlap(Circle C) {
		double x, y, d;
		
		x = this.centre.x - C.centre.x;
		y = this.centre.y - C.centre.y;
		
		d = Math.sqrt((x*x) + (y*y));
		
		return (d <= (this.radius + C.radius)); 
			
	}
	
	// contains point
	
	public boolean containsPoint(Point p) {
		double x,y,d;
		
		x = this.centre.x - p.x;
		y = this.centre.y - p.y;
		
		d = Math.sqrt((x*x) + (y*y));
		
		return d <= radius;
	}

}