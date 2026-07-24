public class B {


public static void main(String[] args) {

    // Create a Circle object
    Circle c = new Circle();

    // Set radius
    c.setRadius(5.0);

    // Display radius, area, and perimeter
    System.out.println("Radius: " + c.getRadius());
    System.out.println("Area: " + c.calculateArea());
    System.out.println("Perimeter: " + c.calculatePerimeter());
}


}

// Circle Class
class Circle {


// Private instance variable
private double radius;

// Getter method for radius
public double getRadius() {
    return radius;
}

// Setter method for radius
public void setRadius(double radius) {
    this.radius = radius;
}

// Method to calculate area
public double calculateArea() {
    return Math.PI * radius * radius;
}

// Method to calculate perimeter
public double calculatePerimeter() {
    return 2 * Math.PI * radius;
}


}
