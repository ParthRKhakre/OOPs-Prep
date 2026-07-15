package Abstraction;

// Abstract class can have abstract + non abstract method

abstract class Dealer extends Car{
    int numberOfcars;
}


abstract class Car{
    abstract public void start();

    public void noise(){
        System.out.println("Noise...");
    }
}

class ManualCar extends Car{
    public void start(){
        System.out.println("Manual Car Started!!");
    }
}

class AutomaticCar extends Car{
    public void start(){
        System.out.println("Automatic Car Started");
    }
}

// Abstraction can also be implemented by interfaces 
// interfaces can also have non implemented function
// Before JAVA 8 interfaces can only have non implemented
// methods but after JAVA 8 they can have 2 types of methods
// default and static 
interface CarInterface{
    public void start();

    default void noise(){
        System.out.println("Noise..");
    }

    static void wheels(){
        System.out.println("Wheels : 4");
    }
}

// if a class wants to use interface it need to implement it 
// class are extended in inheritance and interfaces are implemented
class Electric implements CarInterface{
    public void start(){
        System.out.println("Car Started!!");
    }
}


public class abstraction {         
    public static void main(String[] args) {
        Car manual = new ManualCar();
        manual.start();
        manual.noise();
        // car.printName(); as we have created a object 
        // of Car hence it cannot access printName as it 
        // is in the implementation class. But without 
        
        System.out.println();

        Car automatic = new AutomaticCar();
        automatic.start();
        automatic.noise();

        System.out.println();

        CarInterface tesla = new Electric();
        tesla.start();
        CarInterface.wheels();
    }
}
