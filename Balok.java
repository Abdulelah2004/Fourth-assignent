public class RectangularBox extends Cube {
    private double y, z;

    public RectangularBox(double x, double y, double z) {
        super(x);
        this.y = y;
        this.z = z;
    }

    public double surfaceArea() {
        return 2 * ((x * y) + (y * z) + (z * x));
    }

    public double volume() {
        return x * y * z;
    }
}
