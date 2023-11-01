public class Cube {
    double x;

    public Cube(double x) {
        this.x = x;
    }

    public double surfaceArea() {
        return 6 * (x * x);
    }

    public double volume() {
        return x * x * x;
    }
}
