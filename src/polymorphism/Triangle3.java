package polymorphism;

public class Triangle3 extends Shape3{
    private double base;
    private double height;

    Triangle3(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public void draw() {
        System.out.println("Drawing a Triangle with base " + base + " and height " + height);
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }

}
