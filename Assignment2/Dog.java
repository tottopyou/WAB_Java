// Name of student: Roman Hrabovskyi
// Student id : 19385

public class Dog {
   String name;
   int age;

   public Dog(String name, int age) {
      this.name = name;
      this.age = age;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public int toPeopleYears() {
      return age * 7;
   }

   public String Result() {
      return "Dog: " + name + ", Age: " + age + " years, Age in person years: " + toPeopleYears();
   }
}

