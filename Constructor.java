public class Constructor 

{

    static class Student 
    
    {
        String name;
        int id;
        int age;
        String home;




        Student(String name, int id, int age, String home) {
            this.name = name;
            this.id = id;
            this.age = age;
            this.home = home;
        }



    }




    public static void change(Student s1) 
    
    {


        s1.name = "Mahin";
        s1.id = 123456;
        s1.age = 22;
        s1.home = "Dhaka";


    }




    public static void main(String[] args) 
    
    {

        Student s1 = new Student("Mahin", 123456, 22, "Dhaka");



        change(s1);



        System.out.println("Name: " + s1.name);
        System.out.println("ID: " + s1.id);
        System.out.println("Age: " + s1.age);
        System.out.println("Home: " + s1.home);



    }


    
}

