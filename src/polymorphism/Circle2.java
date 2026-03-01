package polymorphism;

public class Circle2 extends Shape2{
    double r;
    Circle2(double r) { this.r = r; }

    public double getArea() {
        return Math.PI * r * r;
    }

    public double getPerimeter() {
        return 2 * Math.PI * r;
    }
}
