public class C {


public static void main(String[] args) {

    // Create a Car object
    Car car = new Car();

    // Set values using setter methods
    car.setCompanyName("Toyota");
    car.setModelName("Corolla");
    car.setYear(2024);

    // Display values using getter methods
    System.out.println("Car Information:");
    System.out.println("Company Name: " + car.getCompanyName());
    System.out.println("Model Name: " + car.getModelName());
    System.out.println("Year: " + car.getYear());
    System.out.println("Mileage: " + car.getMileage());
}


}

// Car Class
class Car {


// Private instance variables
private String company_name;
private String model_name;
private int year;
private double mileage = 18.5;

// Getter and Setter for company_name
public String getCompanyName() {
    return company_name;
}

public void setCompanyName(String companyName) {
    this.company_name = companyName;
}

// Getter and Setter for model_name
public String getModelName() {
    return model_name;
}

public void setModelName(String modelName) {
    this.model_name = modelName;
}

// Getter and Setter for year
public int getYear() {
    return year;
}

public void setYear(int year) {
    this.year = year;
}

// Only Getter for mileage
public double getMileage() {
    return mileage;
}

}
