// Student.java (or put inside StudentClass as inner class)
class Student 

{
    String name;
    int roll;
    double percent;



    // Constructor
    Student(String name, int roll, double percent) 
    
    {
        this.name = name;
        this.roll = roll;
        this.percent = percent;
    }


}




public class StudentClass 


{

    // Method to change student's name
    public static void change(Student s) 
    
    {
        s.name = "Rohan";
    }




    public static void main(String[] args) 
    
    {
        // Creating Student object using constructor
        Student s1 = new Student("Raghav", 76, 92.1);





        System.out.println(s1.name);    // Output: Raghav
        System.out.println(s1.roll);    // Output: 76
        System.out.println(s1.percent); // Output: 92.1




        // Using change method
        change(s1);
        System.out.println("\nAfter change : " + s1.name); // Output: Rohan




    }




}