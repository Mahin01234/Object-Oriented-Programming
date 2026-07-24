import java.util.ArrayList;

public class D {


public static void main(String[] args) {

    // Create a Student object
    Student student = new Student();

    // Set student ID and name
    student.setStudentId(101);
    student.setStudentName("Mahin");

    // Add grades
    student.addGrade(85);
    student.addGrade(90);
    student.addGrade(78);

    // Display student information
    System.out.println("Student Information:");
    System.out.println("Student ID: " + student.getStudentId());
    System.out.println("Student Name: " + student.getStudentName());
    System.out.println("Grades: " + student.getGrades());
}

}

// Student Class
class Student {

// Private instance variables
private int student_id;
private String student_name;
private ArrayList<Double> grades;

// Constructor
public Student() {
    grades = new ArrayList<>();
}

// Getter for student_id
public int getStudentId() {
    return student_id;
}

// Setter for student_id
public void setStudentId(int studentId) {
    this.student_id = studentId;
}

// Getter for student_name
public String getStudentName() {
    return student_name;
}

// Setter for student_name
public void setStudentName(String studentName) {
    this.student_name = studentName;
}

// Method to add a grade with validation
public void addGrade(double grade) {

    // Validation: grade must be between 0 and 100
    if (grade >= 0 && grade <= 100) {
        grades.add(grade);
    } else {
        System.out.println("Invalid grade! Grade must be between 0 and 100.");
    }
}

// Getter for grades
public ArrayList<Double> getGrades() {
    return grades;
}


}
