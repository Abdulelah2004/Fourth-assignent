public class MainClass {
    public static void main(String[] args) {
        Cube cube = new Cube(3);
        RectangularBox box = new RectangularBox(3, 4, 6);

        System.out.println("Cube Surface Area: " + cube.surfaceArea());
        System.out.println("Cube Volume: " + cube.volume());

        System.out.println("Rectangular Box Surface Area: " + box.surfaceArea());
        System.out.println("Rectangular Box Volume: " + box.volume());
    }
}
