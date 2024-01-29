// Name of student: Roman Hrabovskyi
// Student id : 19385
//University : WAB

public class Student {
   private String firstName, lastName;
   private int test1, test2, test3;
   private Address homeAddress, schoolAddress;

   public Student(String first, String last, Address home, Address school) {
      firstName = first;
      lastName = last;
      homeAddress = home;
      schoolAddress = school;
      test1 = 0;
      test2 = 0;
      test3 = 0;
   }

    public void setTestScore(int testNumber, int score) {
       switch (testNumber) {
           case 1 -> test1 = score;
           case 2 -> test2 = score;
           case 3 -> test3 = score;
       }
   }

   public int getTestScore(int testNumber) {
       return switch (testNumber) {
           case 1 -> test1;
           case 2 -> test2;
           case 3 -> test3;
           default -> testNumber;
       };
   }
   public double average() {
      return (test1 + test2 + test3) / 3;
   }

   public String toString()
   {
      String result;

      result = firstName + " " + lastName + "\n";
      result += "Home Address:\n" + homeAddress + "\n";
      result += "School Address:\n" + schoolAddress;
      result += "Test Scores: " + test1 + ", " + test2 + ", " + test3 + "\n";
      result += "Average Test Score: " + average();
      return result;
   }
}

