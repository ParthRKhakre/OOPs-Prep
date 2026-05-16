import java.util.Scanner;

class Fundamental {
    public static void main(String[] args) {

        // Output On Console 
        System.out.println("Hello");

        // Datatypes
        byte a = 120;
        short b = 32000;
        int c = 64500;
        System.out.println(a +" "+ b + " " + c);

        // Operators 
        // Arithematic : +,-,*,/,%
        int num1 = 10;
        int num2 = 9;
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2); 

        // String
        String name = "Parth Khakre";
        String title = "Mr.";
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        System.out.println(name.substring(0,5));

        // Concatenation
        title += name;
        System.out.println(title);

        boolean same = name.equals(title);
        System.out.println(same);

        // input and output 
        Scanner in = new Scanner(System.in);
        int val = in.nextInt();
        System.out.println(val);
        in.close(); // Scanner closed

        // Typecasting
        // Implicitly
        int x = 9;
        double y = x; // Widening of the val from int -> float automatically
        System.out.println(x + " " + y);

        // Explicit 
        double j = 9.07;
        int k = (int) j; // Narrowing of the value as some value is getting loss
        System.out.println(j + " " + k);

        // Final keyword
        final int WEEK = 7;
        System.out.println("Days in a week " + WEEK); 

    }
}

/*
 * 
 * When you try to run a file the JVM try to find out the class of same
 * name as that of the file hence file and class name should be the same
 * 
 * Once you find out the class then it go on looking for main function
 * 
 * public static void main(String[] arg)
 * 
 * Here
 * public means that the method is availble to all.
 * static means you can access the main method without requiring
 * an object to be created.
 * void is the return type telling that method doesnt returns anything.
 * main() is the name of the function it act as the starting point of the
 * program.
 * String[] args are the default arguments
 * 
 * System.out.println("Hello")
 * It is the function required to print something on the console 
 * 
 * Datatypes
 * Integer
 * byte - integer from  -128 to 127, it takes 8 bits in the memory
 * short - integer from -32,768 to 32,767 it takes 16 bits
 * int - it takes 32 bits range from -2^31 to 2^31 -1
 * long - it takes 64 bits in memory 
 * 
 * Floating points 
 * float - it take 32 bits it stores (6-7 digits of precision)
 * double - it takes 64 bits it stores (15 digits of precision)
 * 
 * Character 
 * char - is the datatype used to store single UNICODE character it is of 16 bits
 * 
 * Operators
 * Arithematic : +,-,*,/,%
 * Unary : +,-,++,--,!(used with boolean)
 * Relational: == ,!=,>=,<=,<,>
 * Logical: && , ||
 * Assignment: = , +=,-=,*=,/=,%=
 * Ternary Operators : condition ? first(true):second(false)
 * 
 * String - is an object used to store text (sequence of characters).
 * Strings are immutable in nature i.e. whenever we change the string an object is created 
 * 
 * Input and Output 
 * In order to take input we have something called as Scanner class 
 * we need to import the Scanner before using it : import java.util.Scanner;
 * create a object of the scanner class inorder to take input
 * 
 * Scanner name = new Scanner(System.in)
 * Whenever the scanner is not required make sure to close it.
 * 
 * Typecasting 
 * Implicit - Typeconversion Done by the JVM
 * Explicit - Typeconversion done by the programmer
 * 
 * Constant 
 * final keyword - a variable with final keyword cannot be changed
 * const keyword is reserved in java but not used
 *  
 * May sure that a constant must be name in UPPER_CASE
 * 
 * Arrays 
 * it is a collection of single datatype that store values in contigous memory locations
 * 
 * 
 * 
 */