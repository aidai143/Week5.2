package encapsulation;

public class Smartphone {
    private String brand;
    private String model;
    private int storageCapacity;

    public Smartphone(String brand,String model,int storageCapacity){
        this.brand = brand;
        this.model = model;
        this.storageCapacity = storageCapacity;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public void printInfo(){
        System.out.println("Brand: "+getBrand());
        System.out.println("Model: "+getModel());
    }

    public void increaseStorage(int value){
        storageCapacity = storageCapacity+ value;


    }
}
