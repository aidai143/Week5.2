package polymorphism;

public class Circle4 extends Shape4{
    double radius;
    public Circle4(double radius) { this.radius = radius; }

    public void draw() { System.out.println("Drawing a 2D Circle"); }

    public double calculateArea() { return Math.PI * radius * radius; }
}
