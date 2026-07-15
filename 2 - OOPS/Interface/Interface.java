package Interface;

// abstraction
interface Car{

    int cnt = 0; // it is a final + static + public in nature 
    // public static final int cnt = 0;
    // final means that cannot be changed(modified/Updated).

    // unimplemented methods
    public void start();
    public void numberOfGears();

    // default method 
    default void airBags(){
        System.out.println("Car has 5 air bags");
    }

    // static method
    static void printVechicle(){
        System.out.println("It is a cars static method");
    }

}

interface SunRoof{
    public void sunroof();
}


class ManualCar implements Car,SunRoof{
    public void start(){
        // cnt++; we cannot do a cnt++ to a variable of 
        // final class as they are final + static + public 
        // airBags(); we can accces the methods of parent interface in child class directly.
        System.out.println("Manual car stated..!");
    }

    public void numberOfGears(){
        System.out.println("Manual Car has 6 gears");
    }

    public void sunroof(){
        System.out.println("It has a normal sunroof");
    }

    @Override
    public void airBags(){
        System.out.println("Manual Car have 6 air bags");
    }
}

public class Interface {
    public static void main(String[] args) {
        ManualCar manualCar1 = new ManualCar();
        manualCar1.sunroof();
    }
}
