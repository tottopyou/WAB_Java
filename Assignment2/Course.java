// Name of student: Roman Hrabovskyi
// Student id : 19385
//University : WAB

import java.util.ArrayList;

public class Course {
    private final String courseName;
    private final ArrayList<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public double average() {
        double totalAverage = 0;
        for (Student student : students) {
            totalAverage += student.average();
        }
        if (students.size() > 0) return totalAverage / students.size();
        return totalAverage;
    }

    public void roll() {
        System.out.println("Students enrolled in " + courseName);
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {

        Course EngCourse = new Course("English");

        Student student1 = new Student(("Alice", "Johnson", new Address("456 Elm St", "City2", "State2", 67890));
        Student student2 = new Student(("Bob", "Smith", new Address("789 Pine St", "City4", "State4", 78901));

        EngCourse.addStudent(student1);
        EngCourse.addStudent(student2);

        student1.setTestScore(1, 56);
        student1.setTestScore(2, 70);
        student1.setTestScore(3, 89);

        student2.setTestScore(1, 48);
        student2.setTestScore(2, 86);
        student2.setTestScore(3, 82);

        EngCourse.roll();
        System.out.println("Overall course test average: " + EngCourse.average());
    }
}