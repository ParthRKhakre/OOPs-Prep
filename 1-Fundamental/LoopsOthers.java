import java.util.Scanner;

public class LoopsOthers {
    public static void main(String[] args) {
        // Loops are the mechanism in programming that allow us 
        // to perform a task some number of times 

        // Take input of n values and provide the summation 
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int total = in.nextInt();

        // for loop
        for(int i = 0; i < total;i++){
            int val = in.nextInt();
            sum += val;
        }

        System.out.println(sum);

        // while loop 
        // alternative to for loop 

        // sum of first 10 natural numbers
        int sumOfN = 0;
        int i = 1; // Initialization
        while(i <= 10){ // Conditional 
            sumOfN += i;
            i++; // Increment or Decrement
        }
        System.out.println(sumOfN);

        // do-while loop : this loops executes atleast once
        // do-while loop is used when one operation depends 
        // on the previous and must exxecutes atleast once

        // take a input until you receive a 10 value
        int n;
        do{
            n = in.nextInt();
            if(n == 10){
                break;
            }
            System.out.println(n);
        }while(true);


        // Exception Handling 
        try{
            int n1 = 10;
            int n2 = 0;
            int n3 = n1 / n2; // Exception as value cannot be divided by zero 
            System.out.println(n3);
        }catch (Exception e) {
            System.out.println(e);
        }finally{
            System.out.println("Finally Block Always Executes");
        }

        in.close();
    }
    
}
