package Abstract;

// Abstract class = blueprint for child classes
abstract class Car {

    // Abstract method (no implementation)
    public abstract void drive();

    // Abstract method (no implementation)
    public abstract void fly();

    // Concrete method
    public void playMusic() {
        System.out.println("Playing music...");
    }
}

// Abstract subclass of Car
abstract class WagonR extends Car {

    // Implementing abstract method drive
    @Override
    public void drive() {
        System.out.println("Driving a WagonR...");
    }

    // Keep fly as abstract
    @Override
    public abstract void fly();
}

// Concrete subclass of WagonR
class UpdatedWagonR extends WagonR {

    // Implementing the fly method
    @Override
    public void fly() {
        System.out.println("Updated WagonR is flying...");
    }
}

public class MyClass {

    public static void main(String args[]) {

        // Dynamic method dispatch
        Car car = new UpdatedWagonR();

        car.drive();      // Calls drive() from WagonR
        car.playMusic();  // Calls concrete method from Car
        car.fly();        // Calls fly() from UpdatedWagonR
    }
}