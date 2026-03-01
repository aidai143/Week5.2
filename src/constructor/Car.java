package constructor;

public class Car {
    String make;
    String model;
    int year;

    public Car(String make,String model,int year){
        this.make = (make == null || make.isEmpty()) ? "Unknown":make;
        this.model = (model == null || model.isEmpty()) ? "Unknown:":model;
        this.year = (year <= 0)?2000:year;

    }

    public void printInfo(){
        System.out.println("Make: "+make);
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);

    }

}
