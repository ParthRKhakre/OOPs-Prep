package InnerClass;

interface Sample{
    public void execute();
}

abstract class Demo{
    abstract public void execute();
}

public class Anonymous_innerClass {
    public static void main(String[] args) {

        // the content inside the {} is anonymous class.
        Sample sample = new Sample(){
            public void execute(){
                System.out.println("Yes I did run!");
            }
        };
        sample.execute();


        Demo demo = new Demo() {
            public void execute(){
                System.out.println("Executed Demo!!");
            }
        };
        demo.execute();

    }
}