package polymorphism;

public class Square extends Shape3{
    private double side;

    Square(double side) {
        this.side = side;
    }

    public void draw() {
        System.out.println("Drawing a Square with side: " + side);
    }

    public double calculateArea() {
        return side * side;
    }
}
