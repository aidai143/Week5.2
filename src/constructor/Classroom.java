package constructor;

public class Classroom {
    String className;
    String[] students;

    public Classroom(String className,String[] students){
        this.className = className;
        this.students = students;
    }

    public void printInfo(){
        System.out.println("Class: "+className);
        System.out.println("Students: ");
        for(String student: students){
            System.out.println(student);
        }
    }
}
