package encapsulation;

public class House {
    private String address;
    private int numberOfRooms;
    private int area;

    public House(String address,int numberOfRooms,int area){
        this.address = address;
        this.numberOfRooms = numberOfRooms;
        this.area = area;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public double getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void printInfo(){
        System.out.println("Address: "+getAddress());
        System.out.println("Number of rooms: "+getNumberOfRooms());
        System.out.println("Area: "+getArea());

    }

    public void calculatePrice(int area,double pricePerSqrMeter){
        double price = area*pricePerSqrMeter;
        System.out.println("The price of the house: "+"$"+price);

    }
}
