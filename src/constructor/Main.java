package constructor;

public class Main {
     static void main(String[] args) {
        Book book = new Book();
        Book book1 = new Book("Harry Potter","J.K.Rowling");
        Book book2 = new Book("The Sorrows of Satan","Marie Corelli",15.5);

        book.info();
        System.out.println("   ");
        book1.info();
        System.out.println("  ");
        book2.info();

         System.out.println("------------");

         Dog dog = new Dog("Max","red");
         dog.getName();
         dog.getColor();
         dog.setName("Marco");
         dog.setColor("black");
         dog.print();

         System.out.println("-------------");

         Student student1 = new Student();
         Student student2 = new Student(101,"Erzat",4.5);
         student1.printInfo();
         student2.printInfo();

         System.out.println("------------");


         Rectangle r1 = new Rectangle(6.5,7.3);
         Rectangle r2 = new Rectangle(r1);
         r1.printInfo();
         r2.printInfo();

         System.out.println("------------");


         Account a1 = new Account("ABB113",1000);
         Account a2 = new Account(" ",-50);

         if(a1!=null){
             a1.printInfo();
         }

         System.out.println("---------------");

         Car c1 = new Car("Toyota","East",2016);
         Car c2 = new Car("Porsche","IX",2024);
         c1.printInfo();
         c2.printInfo();

         System.out.println("------------");

         String[] students = {"Aidai,Nurai,Aida"};
         Classroom c = new Classroom("Math",students);
         c.printInfo();

















     }
}
