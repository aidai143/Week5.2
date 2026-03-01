package encapsulation;

public class Desktop {
    private String brand;
    private String processor;
    private int ramSize;
    public Desktop(String brand,String processor,int ramSize){
        this.brand = brand;
        this.processor = processor;
        this.ramSize = ramSize;}

    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getProcessor(){
        return processor;
    }
    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRamSize(){
        return ramSize;
    }
    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }
    public void printInfo(){
        System.out.println("Brand: "+getBrand());
        System.out.println("Processor: "+getProcessor());

    }
    public void upgradeRam(int value){
        ramSize = ramSize+value;

    }
}
