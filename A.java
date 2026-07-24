public class A {


public static void main(String[] args) {

    // Create an Employee object
    Employee e = new Employee();

    // Set values using setter methods
    e.setEmployeeId(15);
    e.setEmployeeName("Caelius Dathan");
    e.setEmployeeSalary(4900.0);

    // Display values
    System.out.println("Employee Details:");
    System.out.println("ID: " + e.getEmployeeId());
    System.out.println("Name: " + e.getEmployeeName());
    System.out.println("Salary: " + e.getFormattedSalary());
}


}

// Employee Class
class Employee {


// Private variables
private int employee_id;
private String employee_name;
private double employee_salary;

// Getter for employee_id
public int getEmployeeId() {
    return employee_id;
}

// Setter for employee_id
public void setEmployeeId(int employeeId) {
    this.employee_id = employeeId;
}

// Getter for employee_name
public String getEmployeeName() {
    return employee_name;
}

// Setter for employee_name
public void setEmployeeName(String employeeName) {
    this.employee_name = employeeName;
}

// Getter for employee_salary
public double getEmployeeSalary() {
    return employee_salary;
}

// Setter for employee_salary
public void setEmployeeSalary(double employeeSalary) {
    this.employee_salary = employeeSalary;
}

// Formatted salary
public String getFormattedSalary() {
    return String.format("$%.2f", employee_salary);
}


}
