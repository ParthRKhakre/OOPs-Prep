package InnerClass;

class outerClass{
    static int val = 100;
    String name = "Outer Class";

    public void execute(){

        final int x = 10; // without the final keyword we can still access it 
                          // but the condition is it should not be changes 
        class innerClass{
            public void execute(){
                System.out.println("Inner Class Execute!" + x + val);
                // we can actually access x inside the local inner class
                // condition is variable should be final(we can access any
                // value that doesnot changes).

                // val is a variable of the outer class hence can be changed 
                // no error will be encountered as it is not a part of the inner class
                val = val + 10;
            }
       }

       innerClass inner = new innerClass();
       inner.execute();
    }
}


public class Local_InnerClass {

    public static void main(String[] args) {
        outerClass outerclass = new outerClass();
        outerclass.execute();
    }
    
}
