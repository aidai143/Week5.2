package inheritance;

public class Employee3 {
    String name;
    String address;
    double salary;
    String jobTitle;

    public double calculateBonus(){
        return salary*0.1;
    }

    public void performanceReport(){
        System.out.println("Performance is good");
    }
}
