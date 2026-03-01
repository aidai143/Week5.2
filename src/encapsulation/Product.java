package encapsulation;

public class Product {
    private String productName;
    private int productCode;
    private double price;

    public Product(String productName,int productCode,double price){
        this.productName = productName;
        this.productCode = productCode;
        this.price = price;
    }

    public String getProductName(){
        return productName;
    }
    public void setProductName(String productName){
        this.productName = productName;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printInfo(){
        System.out.println("Product name: "+getProductName());
        System.out.println("Product code: "+getProductCode());
        System.out.println("Price: "+"$"+getPrice());
    }

    public void applyDiscount(double percentage){
        if(percentage<0 || percentage>100) {
            System.out.println("The discount percentage is invalid");
            return;
        }
        price = price - (price*percentage/100);

    }

    public void discount(){
        System.out.println("Before discount: "+"$"+getPrice());
        applyDiscount(25);
        System.out.println("After discount: "+"$"+getPrice());

    }
}
