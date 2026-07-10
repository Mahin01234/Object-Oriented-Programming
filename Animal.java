class Animal 
{

    void sound() 
    {
        System.out.println("Animal Sound");
    }



    public static void main(String[] args) 
    {
        Dog d = new Dog();
        d.display();
    }




}





class Dog extends Animal 
{



    @Override


    void sound() 
    {
        System.out.println("Dog Barks");
    }



    void display() 
    {
        super.sound();    // Calls Animal's sound() method
    }


    
}