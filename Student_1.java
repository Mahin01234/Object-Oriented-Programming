class Student
{
    String name ; 
    int id ; 
    int age ; 
    String hometown , Address ;
    double cgpa  ; 


    public void printIInfo () 
    {
        System.out.println ("Name : " + this.name) ; 
        System.out.println ("Id : " + this.id) ; 
        System.out.println ("Age : " + this.age) ; 
        System.out.println ("Hometown : " + this.hometown) ;

        System.out.println("Address : " + this.Address) ; 
        System.out.println("CGPA : " + this.cgpa) ; 


    }
}




public class Student_1 
{


    public static void main (String[] args ) 
    {
        Student s1 = new Student() ; 
        s1.name = "Mahin" ; 
        s1.id = 123456789 ; 
        s1.age = 22 ; 
        s1.hometown = "Dhaka" ; 
        s1.Address = "123 Main Street" ; 
        s1.cgpa = 3.50 ; 

        
        s1.printIInfo() ; 
        
        
    }
}