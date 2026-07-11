


// Question 2
// Create a Student class with name, rollNo, and marks as attributes.
// Write a method to calculate the grade based on the marks and display the grade.
// Create multiple instances of the Student class and print their grades.



public class QNA_2
{

    private String name;
    private int rollNo;
    private double marks;

    // Constructor
    public QNA_2(String name, int rollNo, double marks) {

        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;

    }

    // Getter & Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    // Grade Method

    public String calculateGrade() {

        if (marks >= 80) {
            return "A+";
        } else if (marks >= 70) {
            return "A";
        } else if (marks >= 60) {
            return "A-";
        } else if (marks >= 50) {
            return "B";
        } else if (marks >= 40) {
            return "C";
        } else {
            return "F";
        }

    }

    // Display Method

    public void display() {

        System.out.println("Name : " + name);
        System.out.println("Roll No : " + rollNo);
        System.out.println("Marks : " + marks);
        System.out.println("Grade : " + calculateGrade());

    }

    // Main Method

    public static void main(String[] args) {

        QNA_2 s1 = new QNA_2("Mahin", 101, 85);
        QNA_2 s2 = new QNA_2("Rahim", 102, 72);
        QNA_2 s3 = new QNA_2("Karim", 103, 58);

        s1.display();
        System.out.println();

        s2.display();
        System.out.println();

        s3.display();

    }

}
