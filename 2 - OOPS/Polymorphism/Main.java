package Polymorphism;
// Method Overloading
class Calculator{
    int add(int a,int b){
        return a + b;
    }

    double add(double a,double b){
        return a + b;
    }

    int add(int a,int b,int c){
        return a + b + c;
    }
}

// Method Overriding 
class Parent{
    void display(){
        System.out.println("Parent Class");
    }
}

class child extends Parent{
    @Override
    void display(){
        System.out.println("Parent Class");
    }
}


public class Main {
    public static void main(String[] args) {
        
    }
}
