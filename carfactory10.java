//~Implement Factory design pattern for the given context. Consider Car building process, which requires many steps from allocating accessories to final makeup. These steps should be written as methods and should be called while creating an instance of a specific car type. Hatchback, Sedan, SUV could be the subclasses of Car class. Car class and its subclasses, CarFactory and Test Factory Pattern should be implemented.

abstract class Car {
    String model;
    String color;
    String accessory;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    abstract void allocateAccessories();

    abstract void doFinalMakeup();

    public String toString() {
        return "Model: " + model + ", Color: " + color + ", Accessory: " + accessory;
    }
}

class Hatchback extends Car {
    public Hatchback(String model, String color) {
        super(model, color);
    }

    void allocateAccessories() {
        accessory = "Roof Rack";
    }

    void doFinalMakeup() {
        accessory = "Spoiler";
    }
}

class Sedan extends Car {
    public Sedan(String model, String color) {
        super(model, color);
    }

    void allocateAccessories() {
        accessory = "Trunk Liner";
    }

    void doFinalMakeup() {
        accessory = "Rearview Mirror Covers";
    }
}

class SUV extends Car {
    public SUV(String model, String color) {
        super(model, color);
    }

    void allocateAccessories() {
        accessory = "Tow Hitch";
    }

    void doFinalMakeup() {
        accessory = "Running Boards";
    }
}

class CarFactory {
    static Car createCar(String type, String model, String color) {
        if (type.equals("Hatchback")) {
            return new Hatchback(model, color);
        } else if (type.equals("Sedan")) {
            return new Sedan(model, color);
        } else if (type.equals("SUV")) {
            return new SUV(model, color);
        }

        return null;
    }
}

public class chit10 {
    public static void main(String[] args) {
        Car car1 = CarFactory.createCar("Hatchback", "Ford Focus", "Blue");
        Car car2 = CarFactory.createCar("Sedan", "Toyota Camry", "Red");
        Car car3 = CarFactory.createCar("SUV", "Jeep Wrangler", "Black");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        car1.allocateAccessories();
        car2.allocateAccessories();
        car3.allocateAccessories();

        car1.doFinalMakeup();
        car2.doFinalMakeup();
        car3.doFinalMakeup();

        System.out.println("\nAfter allocation and final makeup: ");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}
