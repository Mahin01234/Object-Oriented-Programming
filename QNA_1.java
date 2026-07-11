// Question 1
// Create a class Employee with overloaded constructors to initialize employee details
// based on different combinations of arguments.

public class QNA_1 {

    private String name, department_name;
    private int id;

    // Default Constructor
    public QNA_1() {

    }

    // Constructor 1
    public QNA_1(String name) {
        this.name = name;
    }

    // Constructor 2
    public QNA_1(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Constructor 3
    public QNA_1(String name, String department_name, int id) {
        this.name = name;
        this.department_name = department_name;
        this.id = id;
    }

    // Getter & Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Display Method
    public void display() {

        System.out.println("Name : " + name);
        System.out.println("Department Name : " + department_name);
        System.out.println("ID : " + id);

    }

    // Main Method
    public static void main(String[] args) {

        QNA_1 e1 = new QNA_1();

        QNA_1 e2 = new QNA_1("Mahin");

        QNA_1 e3 = new QNA_1("Rahim", 101);

        QNA_1 e4 = new QNA_1("Karim", "CSE", 102);

        System.out.println("Employee 1");
        e1.display();

        System.out.println();

        System.out.println("Employee 2");
        e2.display();

        System.out.println();

        System.out.println("Employee 3");
        e3.display();

        System.out.println();

        System.out.println("Employee 4");
        e4.display();

    }

}