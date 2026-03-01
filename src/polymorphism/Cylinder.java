package polymorphism;

public class Cylinder extends Circle4{
    private double height;
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public void draw() { System.out.println("Drawing a 3D Cylinder."); }

    public double calculateArea() {

        return (2 * Math.PI * radius * height) + (2 * super.calculateArea());
    }
}
