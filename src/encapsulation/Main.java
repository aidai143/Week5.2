package encapsulation;

public class Main {
    static void main(String[] args) {
        //1
        Person person = new Person("Aidai",17,"Kyrgyzstan");
        person.printInfo();
        person.setAge(18);
        person.setCountry("Netherlands");
        System.out.println("   ");
        person.printInfo();

        System.out.println("------------");

        //2
        BankAccount account = new BankAccount("AIIKO113",1000000);
        account.printInfo();
        account.setAccountNumber("AIE143");
        account.setBalance(1500000);
        System.out.println("   ");
        account.printInfo();

        System.out.println("------------");

        //3
        Rectangle rectangle = new Rectangle(4.5,6.4);
        rectangle.printInfo();
        rectangle.setLength(5.4);
        rectangle.setWidth(4.6);
        System.out.println("   ");
        rectangle.printInfo();

        System.out.println("------------");

        //4
        Employee employee = new Employee(113,"Aidai",100000);
        employee.printInfo();
        employee.setEmployee_id(143);
        employee.setEmployee_name("Aidana");
        System.out.println("   ");
        employee.printInfo();


        System.out.println("------------");

        //5
        Circle circle = new Circle(4.5);
        circle.setRadius(6.1);
        circle.calculateArea();
        circle.calculatePerimeter();

        System.out.println("------------");

        //6
        Car car = new Car("Tesla","Model Y",2020,700);
        car.printInfo();
        car.setCompany_name("Toyota");
        car.setModel_name("Camry");
        car.setYear(2021);
        System.out.println("  ");
        car.printInfo();

        System.out.println("------------");

        //7
        Student student = new Student(113,"Aidai,");
        student.addGrades(90);
        student.addGrades(74.4);
        student.addGrades(120);
        student.addGrades(-5);
        System.out.println("ID: "+student.getStudent_id());
        System.out.println("Name: "+student.getStudent_name());
        student.printGrades();

        System.out.println("--------------");

        //8
        Book book = new Book("The Sorrows of Satan","Marie Corelli",17.5);
        book.printInfo();
        System.out.println("Before discount: "+book.getPrice());
        book.applyDiscount(20);
        System.out.println("After discount: "+book.getPrice());

        System.out.println("--------------");

        //9
        Smartphone smartphone = new Smartphone("Samsung","A56",256);
        smartphone.printInfo();
        System.out.println("Before increase: "+smartphone.getStorageCapacity());
        smartphone.increaseStorage(256);
        System.out.println("After increase: "+smartphone.getStorageCapacity());

        System.out.println("-------------");

        //10

        Desktop desktop = new Desktop("HP","Intell Core Ultra",32);
        desktop.printInfo();
        System.out.println("Before upgrade RAM: "+desktop.getRamSize()+"GB");
        desktop.upgradeRam(32);
        System.out.println("After upgrade: "+desktop.getRamSize()+"GB");

        System.out.println("------------");

        //11
        House house = new House("Shakirova 9",3,96);
        house.printInfo();
        house.setAddress("Alayskaya 30");
        house.setNumberOfRooms(4);
        house.setArea(120);
        System.out.println("   ");
        house.printInfo();
        house.calculatePrice(96,450);

        System.out.println("------------");

        //12
        Account account1 = new Account("AIIKO113","Aidai Zhumanazarova",200000);
        account1.printInfo();
        account1.setAccountHolder("Asylzat Zhumanazarova");
        account1.setAccountNumber("AIIEK113");
        account1.setBalance(500000);
        System.out.println("   ");
        account1.printInfo();

        System.out.println("     ");
        account1.deposit(50000);
        account1.printInfo();
        System.out.println("   ");
        account1.withdraw(25000);
        account1.printInfo();

        System.out.println("-------------");


        //13
        Movie movie = new Movie("Avatar","James Cameron",195);
        movie.getMovieDetails();
        movie.setTitle("Harry Potter");
        System.out.println("    ");
        movie.setDirector("Chris Columbus");
        movie.setDuration(135);
        movie.getMovieDetails();

        System.out.println("------------");

        //14

        Product product = new Product("Toothbrush",100820034,6.5);
        product.printInfo();
        product.setProductName("Soap");
        product.setProductCode(120041435);
        product.setPrice(5.4);
        System.out.println("   ");
        product.printInfo();
        System.out.println("   ");
        product.discount();






























    }
}
