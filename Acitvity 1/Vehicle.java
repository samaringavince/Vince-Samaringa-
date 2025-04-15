import java.util.Scanner;

public class Vehicle {
    private String brand;
    private int speed;
    private String fuelType;

    public Vehicle(String brand, int speed, String fuelType) {
        this.brand = brand;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void displayInfo() {
        // To be overridden by subclasses
    }
}

// Car.java
class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, int speed, String fuelType, int numDoors) {
        super(brand, speed, fuelType);
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car Details:");
        System.out.println("Brand: " + getBrand());
        System.out.println("Speed: " + getSpeed());
        System.out.println("Fuel Type: " + getFuelType());
        System.out.println("Number of Doors: " + getNumDoors());
    }
}

// Motorcycle.java
class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, int speed, String fuelType, boolean hasSidecar) {
        super(brand, speed, fuelType);
        this.hasSidecar = hasSidecar;
    }

    public boolean hasSidecar() {
        return hasSidecar;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcycle Details:");
        System.out.println("Brand: " + getBrand());
        System.out.println("Speed: " + getSpeed());
        System.out.println("Fuel Type: " + getFuelType());
        System.out.println("Has Sidecar: " + hasSidecar());
    }
}

// TestVehicle.java
class TestVehicle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Car
        System.out.println("Enter details for Car:");
        System.out.print("Brand: ");
        String brand = scanner.nextLine();
        System.out.print("Speed (km/h): ");
        int speed = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline
        System.out.print("Fuel Type: ");
        String fuelType = scanner.nextLine();
        System.out.print("Number of Doors: ");
        int numDoors = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline

        Car car = new Car(brand, speed, fuelType, numDoors);
        car.displayInfo();

        // Input for Motorcycle
        System.out.println("\nEnter details for Motorcycle:");
        System.out.print("Brand: ");
        String motorcycleBrand = scanner.nextLine();
        System.out.print("Speed (km/h): ");
        int motorcycleSpeed = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline
        System.out.print("Fuel Type: ");
        String motorcycleFuelType = scanner.nextLine();
        System.out.print("Has Sidecar (true/false): ");
        boolean hasSidecar = scanner.nextBoolean();

        Motorcycle motorcycle = new Motorcycle(motorcycleBrand, motorcycleSpeed, motorcycleFuelType, hasSidecar);
        motorcycle.displayInfo();

        scanner.close();
    }
}