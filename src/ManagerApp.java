class Manager {
    String name;

    void sayHello(String name) {
        System.out.println("Hello " + name + ", my name is Manager " + this.name);
    }
}

class VicePresident extends Manager {
    void sayHello(String name) {
        System.out.println("Hello " + name + ", my name is VP " + this.name);
    }
}
public class ManagerApp{
    public static void main(String[] args) {
        //Membuat objek
        var manager1 = new Manager();
        manager1.name = "ikhsan";
        manager1.sayHello("Budi");

        var vp = new VicePresident();
        vp.name = "budi";
        vp.sayHello("adam");
    }
}
