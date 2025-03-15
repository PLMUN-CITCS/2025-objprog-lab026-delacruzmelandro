// Student class definition
class Student {
    // Private attributes (Encapsulation)
    private String name;
    private int id;
    private double gpa;

    // Static variable to count students
    private static int studentCount = 0;

    // Constructor
    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
        studentCount++; // Increment count when a student is created
    }

    // Instance method to display student info
    public void displayStudentInfo() {
        System.out.println("Student ID: " + id + ", Name: " + name + ", GPA: " + gpa);
    }

    // Static method to display total number of students
    public static void displayStudentCount() {
        System.out.println("Total students: " + studentCount);
    }
}

// Main class to run the program
public class StudentDemo {
    public static void main(String[] args) {
        // Creating Student objects
        Student student1 = new Student("Alice", 101, 3.8);
        Student student2 = new Student("Bob", 102, 3.5);
        Student student3 = new Student("Charlie", 103, 3.9);

        // Displaying individual student information
        student1.displayStudentInfo();
        student2.displayStudentInfo();
        student3.displayStudentInfo();

        // Displaying total student count
        Student.displayStudentCount();
    }
}
