package encapsulation;

public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void calculateArea(){
        System.out.println("Area: "+ 3.14*getRadius()*getRadius());

    }

    public void calculatePerimeter(){
        System.out.println("Perimeter: "+2*3.14*getRadius());

    }
}
