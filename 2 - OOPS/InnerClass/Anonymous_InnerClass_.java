package InnerClass;

import java.util.ArrayList;

public class Anonymous_InnerClass_ {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(){
            @Override // we overrided the add function
            public boolean add(Integer val){
                super.add(val); // call the original add function 
                System.out.println("Val is not added " + val);
                return true;
            } 
        };

        //  above we modified the add function.

        list.add(10);
        list.add(20);
        System.out.println(list);
    }
    
}
