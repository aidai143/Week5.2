package inheritance;

public class Employee2 extends Person{
    private String jobTitle;
    private int employeeID;

    public Employee2(String jobTitle, int employeeID){
        this.jobTitle = jobTitle;
        this.employeeID = employeeID;
    }


    public int getEmployeeID(){
        return employeeID;

    }

    public String getLastName(){
        return super.getLastName()+" ("+jobTitle+")";
    }
}
