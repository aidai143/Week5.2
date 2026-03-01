package inheritance;

public class Main {
    static void main(String[] args) {
        //1
        Animal animal = new Animal();
        animal.makeSound();
        Animal animal1 = new Cat();
        animal1.makeSound();

        System.out.println("------------");

        //2
        Vehicle v = new Vehicle();
        v.drive();
        Vehicle v1 = new Car();
        v1.drive();

        System.out.println("------------");

        //3
        Shape s = new Shape();
        System.out.println(s.getArea());
        Shape s1 = new Rectangle(6.5,7.3);
        System.out.println(s1.getArea());

        System.out.println("------------");

        //4
        Employee e = new Employee();
        e.work();

        Employee hr = new HRManager();
        hr.work();

        HRManager hrManager = new HRManager();
        hrManager.addEmployee();

        System.out.println("------------");

        //5
        BankAccount account = new SavingsAccount(20000);
        account.withdraw(19800);
        account.deposit(1130);
        System.out.println(account.balance);

        System.out.println("------------");

        //6
        Animal2 cheetah = new Cheetah();
        cheetah.move();

        System.out.println("------------");

        //7
        Person person = new Employee2("HR manager",143);
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());

        System.out.println("------------");

        //8
        Shape2 circle = new Circle(6.5);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        System.out.println("------------");

        //9
        Hierarchy vehicle1 = new Car2();
        Hierarchy vehicle2 = new Truck();
        Hierarchy vehicle3 = new Motorcycle();

        System.out.println(vehicle1.maxSpeed());
        System.out.println(vehicle2.maxSpeed());
        System.out.println(vehicle3.maxSpeed());

        System.out.println("------------");

        //10
        Employee3 manager = new Manager();
        manager.salary = 180000;
        System.out.println(manager.calculateBonus());

        Employee3 developer = new Developer();
        developer.salary = 200000;
        System.out.println(developer.calculateBonus());

        Employee3 programmer = new Programmer();
        programmer.salary = 250000;
        System.out.println(programmer.calculateBonus());



    }
}
