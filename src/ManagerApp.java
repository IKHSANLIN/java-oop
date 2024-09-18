class Employee{
    String name;

    public Employee(String name) {
        this.name = name;
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", my name is Employee " + this.name);
    }
    
}

class Manager extends Employee {

    Manager(String name) {
        super(name);
    }
    void sayHello(String name) {
        System.out.println("Hello " + name + ", my name is Manager " + this.name);
    }
}

class VicePresident extends Manager {
    VicePresident(String name) {
        super(name);
    }
    @Override
    void sayHello(String name) {
        System.out.println("Hello " + name + ", my name is VP " + this.name);
    }
}
public class ManagerApp{
    public static void main(String[] args) {
        //Membuat objek
        var manager1 = new Manager("Jayus");
        manager1.sayHello("Budi");

        var vp = new VicePresident("surya");
        vp.sayHello("adam");
    }
}
