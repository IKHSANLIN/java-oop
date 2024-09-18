class Person {
   String name ;
   int age;
   final String country = "Indonesia";

   Person(String name, int age) {
      this.name = name;
      this.age = age;
   }

   void sayHello(String name) {
      System.out.println("Hello " + name + ", my name is " + this.name);
   }
}

