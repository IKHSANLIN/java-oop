public class PersonApp {
    public static void main(String[] args) {
        //Membuat objek
        Person person1 = new Person("joko", 20);
        Person person2 = new Person("dafa", 21);

        // person1.name = "John";
        // person1.age = 25;

        // person2.name = "Jane";
        // person2.age = 30;

        person1.sayHello("budi");

        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person1.country);
        System.out.println(person2.name);
    }
}
