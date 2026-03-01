package polymorphism;

public class Main {
    static void main(String[] args) {
        //1
        Animal animal = new Animal();
        animal.Sound();

        Animal bird = new Bird();
        bird.Sound();

        Animal cat = new Cat();
        cat.Sound();

        System.out.println("------------");

        //2
        Vehicle car = new Car();
        car.speedUp();
        System.out.println("Car speed: "+car.speed);

        Vehicle bicycle = new Bicycle();
        bicycle.speedUp();
        System.out.println("Bicycle speed: "+bicycle.speed);

        System.out.println("------------");

        //3

        Shape circle = new Circle(6.5);
        System.out.println("Circle Area: "+circle.calculateArea());

        Shape rectangle = new Rectangle(4.3,5.4);
        System.out.println("Rectangle Area: "+rectangle.calculateArea());

        Shape triangle = new Triangle(4,3);
        System.out.println("Triangle Area: "+triangle.calculateArea());

        System.out.println("------------");

        //4
        Employee manager = new Manager();
        System.out.println("Manager Salary: "+"$"+manager.calculateSalary());

        Employee programmer = new Programmer();
        System.out.println("Programmer Salary: "+"$"+programmer.calculateSalary());

        System.out.println("------------");

        //5
        Sports football = new Football();
        football.play();

        Sports basketball = new Basketball();
        basketball.play();

        Sports rugby = new Rugby();
        rugby.play();

        System.out.println("------------");

        //6
        Shape2 circle2 = new Circle2(4.5);
        System.out.println("Circle area: "+circle2.getArea());
        System.out.println("Circle perimeter: "+circle2.getPerimeter());

        System.out.println("   ");

        Shape2 rectangle2 = new Rectangle2(6,7);
        System.out.println("Rectangle area: "+rectangle2.getArea());
        System.out.println("Rectangle perimeter: "+rectangle2.getPerimeter());

        System.out.println("   ");

        Shape2 triangle2 = new Triangle2(7,8,3,4,5);
        System.out.println("Triangle area: "+triangle2.getArea());
        System.out.println("Triangle perimeter: "+triangle2.getPerimeter());

        System.out.println("------------");

        //7
        Animal2 bird2 = new Bird2();
        bird2.move();
        bird2.makeSound();
        System.out.println("   ");
        Animal2 panthera = new Panthera();
        panthera.move();
        panthera.makeSound();

        System.out.println("-----------");

        //8
        Shape3 circle3 = new Circle3(7);
        circle3.draw();
        System.out.println("Circle area: "+circle3.calculateArea());

        System.out.println("   ");

        Shape3 square = new Square(5);
        square.draw();
        System.out.println("Square area: "+square.calculateArea());

        System.out.println("   ");

        Shape3 triangle3 = new Triangle3(4,5);
        triangle3.draw();
        System.out.println("Triangle area: "+triangle3.calculateArea());

        System.out.println("-----------");

        //9
        BankAccount savings = new SavingsAccount(1000);
        BankAccount checking = new CheckingAccount(1000);

        savings.withdraw(300);
        checking.withdraw(100);

        System.out.println("-----------");

        //10
        Animal3 lion = new Lion();
        lion.eat();
        lion.sound();
        System.out.println("   ");
        Animal3 tiger = new Tiger();
        tiger.eat();
        tiger.sound();
        System.out.println("   ");
        Animal3 panthera2 = new Panthera2();
        panthera2.eat();
        panthera2.sound();

        System.out.println("------------");

        //11
        Vehicle2 car2 = new Car2();
        car2.startEngine();
        car2.stopEngine();
        System.out.println("   ");
        Vehicle2 motorcycle = new Motorcycle();
        motorcycle.startEngine();
        motorcycle.stopEngine();

        System.out.println("-----------");

        //12
        Shape4 circle4 = new Circle4(6);
        circle4.draw();
        System.out.println("Circle area: "+circle4.calculateArea());
        System.out.println("   ");
        Circle4 cylinder = new Cylinder(4,5);
        cylinder.draw();
        System.out.println("Cylinder area: "+cylinder.calculateArea());

        System.out.println("------------");

















    }
}
