class Person {
   String name = "ikhsan";
   int age;
   final String country = "Indonesia";

   Person(String PersonName, int PersonAge) {
      name = PersonName;
      age = PersonAge;
   }

   void sayHello(String paraName) {
      System.out.println("Hello " + paraName + ", my name is " + name);
   }
}

