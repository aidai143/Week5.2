package polymorphism;

public class Rectangle2 extends Shape2{
    double length;
    double width;

    public Rectangle2(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        return length* width;
    }

    public double getPerimeter(){
        return 2*(length+width);
    }

}
