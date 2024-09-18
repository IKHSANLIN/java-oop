public class PolymorphismApp {
    public static void main(String[] args) {
        
        Employee employee = new Employee("ikhsan");
        employee.sayHello("budi");

        employee = new Manager("joko");
        employee.sayHello("dafa");

        employee = new VicePresident("surya");
        employee.sayHello("adam");

        sayHello(new Employee("jayus"));
        sayHello(new Manager("alwi"));
        sayHello(new VicePresident("martin"));
        
    }
    static void sayHello(Employee employee) {
        System.out.println("hello " + employee.name);
    }
}
