public class Constructor_1 {
    // Fields (instance variables)
    String title;
    int id;
    double value;
    
    // Constructor – same name as the class, no return type
    public Constructor_1(String title, int id, double value) {
        this.title = title;
        this.id = id;
        this.value = value;
    }
    
    // Another constructor (overloading) – default values
    public Constructor_1() {
        this.title = "Default";
        this.id = 0;
        this.value = 0.0;
    }
    
    // Method to display the object's state
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("ID: " + id);
        System.out.println("Value: " + value);
    }
    
    // Main method to test the constructors
    public static void main(String[] args) {
        // Using parameterized constructor
        Constructor_1 obj1 = new Constructor_1("Example", 42, 99.9);
        obj1.display();
        
        System.out.println();
        
        // Using default constructor
        Constructor_1 obj2 = new Constructor_1();
        obj2.display();
    }
}


