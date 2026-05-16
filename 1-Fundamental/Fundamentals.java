import java.util.Scanner;
public class Fundamentals {
    public static void main(String[] args) {
        // Array 
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 9;
        arr[2] = -1;
        arr[3] = 4;
        arr[4] = 10;
     // System.out.println(a[5]); 
     // RUNTIME ERROR as we are trying to access an index that is not present 
        System.out.println(arr.length);

        // 2D Array - multidimensional 
        int[][] a = {{1,2},{7,5,6},{8,4},{9,0} };
        System.out.println(a[0][1]);
        
        // Conditionals - are the statements that help in decision making in a program
        // if , if-else, else if , switch

        // Given an age , print "adult" if age >= 18 or print "teen"
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();

        if(age >= 18)
            System.out.println("Adult");
        else
            System.out.println("Teen");


        // Given marks provide the grade that a student gets.
        int marks  = in.nextInt();

        if(marks >= 90) System.out.println('A');
        else if(marks >= 70 && marks < 90) System.out.println('B');
        else if(marks >= 50 && marks < 70) System.out.println('C');
        else System.out.println('D');

/* 
        Nested if-else
        Given a,b,c print which is the largest 
        If two or more integers are equal and are the largest 
        program should indicate that as well.        
*/ 

        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        if((x == y) == (y == z)) System.out.println("All the Largest");

        if(x >= y){
            if(y > z){
                if(x == y) System.out.println("x and y are the largest");
                else System.out.println("x is the largest");
            }
        }else if(y >= z){
            if(z > x){
                 if(y == z) System.out.println("y and z are the largest");
                else System.out.println("y is the largest");
            }
        }else{
            if(x > y){
                if(z == x) System.out.println("z and x are the largest");
                else System.out.println("z is the largest");
            }
        }

        // Switch Case

        // Guess the day
        int day = in.nextInt();
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break; 
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Input");                     

        }


        for(int i = 0;i < 10;i++){
            System.out.println("Raj");
        }









            in.close();
    }
}
