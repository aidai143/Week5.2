package polymorphism;

public class Triangle2 extends Shape2{
    double base;
    double height;
    double a;
    double b;
    double c;

    public Triangle2(double base,double height,double a, double b,double c){
        this.base = base;
        this.height = height;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea(){
        return 0.5 * (base * height);
    }

    public  double getPerimeter(){
        return a+b+c;
    }
}
