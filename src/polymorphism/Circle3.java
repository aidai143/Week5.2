package polymorphism;

public class Circle3 extends Shape3{
    private double radius;

    Circle3(double radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Drawing a Circle with radius: " + radius);
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
