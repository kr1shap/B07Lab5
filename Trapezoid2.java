public class Trapezoid2 {
    double base1;
    double base2;
    double height;

    /**
     * Creates an instance of Trapezoid2 using input values for b1, b2 and h.
     * The implementation assumes the trapezoid is isosceles.
     * If one or more of the dimensions are invalid, the resulting instance is
     * null trapezoid (basically all fields are set to 0).
     * 
     * @param b1 is a positive double representing the base1 length
     * @param b2 is a positive double representing the base2 length
     * @param h  is a positive double representing the height
     */
    public Trapezoid2(double b1, double b2, double h) {
        if (height == 0 || base1 == 0 || base2 == 0) {
            base1 = 0;
            base2 = 0;
            height = 0;
        } else {
            base1 = b1;
            base2 = b2;
            height = h;
        }
    }

    public double area() {
        if (height == 0 || base1 == 0 || base2 == 0) {
            return 0;
        }
        return ((base1 + base2) / 2) * height;
    }

    public double getLegLength() {
        return Math.sqrt(Math.pow(height, 2) + Math.pow((Math.abs((base1 - base2) / 2)), 2));
    }

    public double perimeter() {
        return base1 + base2 + 2 * getLegLength();
    }

    public boolean isRectangle() {
        if (height == 0 || base1 == 0 || base2 == 0) {
            return false;
        }
        return Math.abs(base1 - base2) < 1e-6;
    }

}