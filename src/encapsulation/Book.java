package encapsulation;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title,String author,double price){
        this.title = title;
        this.author = author;
        this.price = price;

    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printInfo(){
        System.out.println("Title: "+getTitle());
        System.out.println("Author: "+getAuthor());

    }

    public void applyDiscount(double percentage){
        if(percentage <0 || percentage>100){
            System.out.println("Invalid discount percentage");
            return;
        }
        price = price - (price*percentage/100);

    }
}
