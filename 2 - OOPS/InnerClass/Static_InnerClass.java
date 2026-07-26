package InnerClass;

class outer{
    static int val = 10;         
// Accessible inside the inner class without creating a instance of the outer class 
    String name = "OuterClass"; 
// can be accessed with the help of the object of outer class

    static class inner{
        public void execute(){
            System.out.println("Inner Class" + val);
        }
    }
}

class Static_InnerClass{
    public static void main(String[] args) {
        outer.inner innerObject = new outer.inner();
        // above we have create a instance of the innerclass
        innerObject.execute();
    }
}