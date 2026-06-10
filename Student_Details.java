
package com.mycompany.student_details;


public class Student_Details {

    int id ; 
    String name , department ; 
    double cgpa ; 
    
    
    static String university = "ULAB" ; 
    
    
    static int total_number_of_students = 0 ; 
    
    
    public Student_Details (int id, String name , String department, double cgpa ) 
    {
        

        this.id = id ; 
        this.name = name ; 
        this.department = department ; 
        this.cgpa = cgpa ; 
        
        total_number_of_students++ ; 
        
                
    }
    
    
    
    
    
    void display()
    {
        
        
        System.out.println ("Enter the your ID is : " + id) ; 
        
        System.out.println ("Enter your NAME is : " + name) ;
        
        System.out.println ("Enter your DEPARTMENT name is : " + department) ; 
        
        System.out.println ("Enter your CGPA is : " + cgpa )  ; 
       
       

        
        System.out.println ("Enter University name is : " + university )  ; 
        
        
        
        System.out.println() ;
        
    }


    static void students()
    {
        
        System.out.println ("Total number of students : " + total_number_of_students )  ;
        
    }
    
}
