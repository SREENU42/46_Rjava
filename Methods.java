class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int division(int a, int b) {
        return a / b;
    }

    String name() {
        return "sreenu";
    }

    boolean isNameSreenu() {
        return name().equals("sreenu");
    }
}

public class Methods {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Addition: " + c.add(10, 5));
        System.out.println("Subtraction: " + c.subtract(10, 5));
        System.out.println("Division: " + c.division(10, 5));
        System.out.println("Name: " + c.name());
        System.out.println("Is name 'sreenu'? " + c.isNameSreenu());
    }
}
