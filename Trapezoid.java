public class Trapezoid {
    Point A;
    Point B;
    Point C;
    Point D;

    /**
     * Given 4 points a,b,c,d that form ⏢abcd. If the points form a valid trapezoid,
     * a new Trapezoid instance is created.
     * Otherwise, a default trapezoid with all points set to (0, 0) is created.
     * 
     * @param a is the first point
     * @param b is the second point
     * @param c is the third point
     * @param d is the fourth point
     */git
    public Trapezoid(Point a, Point b, Point c, Point d) {
        if (isParallel(a, b, c, d) || isParallel(b, c, d, a)) {
            A = a;
            B = b;
            C = c;
            D = d;
        } else {
            Point p = new Point(0, 0);
            A = p;
            B = p;
            C = p;
            D = p;
        }
    }

    private boolean isParallel(Point a, Point b, Point c, Point d) {
        // checks to see cross product is 0
        double x1 = b.x - a.x;
        double y1 = b.y - a.y;

        double x2 = d.x - c.x;
        double y2 = d.y - c.y;

        return Math.abs(x1 * y2 - x2 * y1) < 1e-6;
    }

    public double perimeter() {
        return A.distance(B) + B.distance(C) + C.distance(D) + D.distance(A);
    }

    private boolean isRightAngle(Point p1, Point p2, Point p3) {
        // checks to see dot product is 0
        double x1 = p1.x - p2.x;
        double y1 = p1.y - p2.y;

        double x2 = p3.x - p2.x;
        double y2 = p3.y - p2.y;

        return Math.abs(x1 * x2 + y1 * y2) < 1e-6;
    }

    public boolean isRightTrapezoid() {
        return isRightAngle(A, B, C) || isRightAngle(B, C, D) || isRightAngle(C, D, A) || isRightAngle(D, A, B);
    }

}