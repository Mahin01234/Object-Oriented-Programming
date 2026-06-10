
package com.mycompany.student_details;



public class Student_Details_1
{
    public static void main (String[] args) 
    {
        
        Student_Details s1 = new Student_Details (101, "Mahin", "CSE", 3.75) ; 
        
        Student_Details s2 = new Student_Details (102, "Rafi", "EEE", 3.60) ; 
        
        Student_Details s3 = new Student_Details (103, "Nusrat", "BBA", 3.90) ; 
        
        
        
        s1.display() ;
        s2.display() ;
        s3.display() ;
        
        
        Student_Details.students() ; 
        
        
        
    }
}