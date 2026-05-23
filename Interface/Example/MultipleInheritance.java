package Interface.Example;

// Interface A
interface A {

    // Variables in interface are:
    // public static final by default
    int age = 44;
    String area = "Mumbai";

    // Methods are public abstract by default
    void show();

    void config();
}

// Interface B
interface B {
    void run();
}

// Marker Interface (empty interface)
interface C {
    // empty
}

// Class implementing multiple interfaces
class X implements A, B, C {

    // Implementing show()
    public void show() {
        System.out.println("in show");
    }

    // Implementing config()
    public void config() {
        System.out.println("config");
    }

    // Implementing run()
    public void run() {
        System.out.println("in run");
    }
}

public class MultipleInheritance {

    public static void main(String[] args) {

        // Parent interface reference
        A obj = new X();

        // Calling methods
        obj.show();
        obj.config();

        // Cannot call run() using A reference
        // obj.run(); // ERROR

        // To call run()
        B obj2 = new X();
        obj2.run();

        // Accessing interface variables
        System.out.println(A.age);
        System.out.println(A.area);
    }
}