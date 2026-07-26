package InnerClass;

import InnerClass.outer.inner;

class outerClass{
    static int val = 10;
    String name = "Outer Class";

    class innerClass{
        public void execute(){
            System.out.println("Inner Class Execute!");
        }
    }

    public void execute(){
        // In Order to use the method and attribute of the 
        // inner class we need to create of object of it.
        innerClass innerobject = new innerClass();
        innerobject.execute();
    }

}

public class NonStatic_InnerClass {

    public static void main(String[] args) {
        outerClass outerobj = new outerClass();
        outerClass.innerClass obj =  outerobj.new innerClass();
        // Here to inorder to access the method and attributes
        // of the inner class we need to create object of it.
        obj.execute();
    }
    
}
