package constructor;

public class Student {
    private int studentId;
    private String studentName;
    private double grade;

    public Student(){
        this(0,"Unknown",0);
    }

    public Student(int studentId,String studentName,double grade){
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }

    public void printInfo(){
        System.out.println("Student ID: "+studentId);
        System.out.println("Student's name: "+ studentName);
        System.out.println("Grade: "+grade);
    }
}
