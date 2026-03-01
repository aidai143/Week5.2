package encapsulation;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }

    public double getLength(){
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }



    public double getWidth(){
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }



    public void printInfo(){
        System.out.println("Length: "+getLength());
        System.out.println("Width: "+getWidth());
    }
}
