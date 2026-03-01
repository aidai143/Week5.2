package inheritance;

public class Circle extends Shape2{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getPerimeter(){
        return Math.PI*radius*radius;

    }

    public double getArea(){
        return 2* Math.PI * radius;

    }
}
