package Inheritance; /*
    
                     In the program we created School and Students classes and then used them 
                     Uniquely. The extra object creation can be eliminated using inheritence.
                     As Student is a part of the school.
                     
                     class School{
                     private String name;
                     School(){
                     name = "DPS";
                     }
                     
                     void printSchoolName(){
                     System.out.println("School Name :" + name);
                     }
                     }
                     
                     class Students{
                     private String name;
                     
                     Students(String name){
                     this.name = name;
                     }
                     void printStudentName(){
                     System.out.println("Student name :" + name);
                     }
                     }
                     
                     public class Inheritance {
                     
                     public static void main(String[] args) {
                     School school = new School();
                     Students student = new Students("Raj");
                     
                     school.printSchoolName();
                     student.printStudentName();
                     }
                     
                     } 
                     */

class School {
    private String name;

    School() {
        name = "DPS";
    }

    void printSchoolName() {
        System.out.println("School Name :" + name);
    }
}

class Students extends School {
    /*
     * As we have inherited the School class then its attibute
     * and methods are accessible for Students class.
     */

    private String name;

    Students(String name) {
        this.name = name;
    }

    void printStudentName() {
        System.out.println("Student name :" + name);
    }
}

class Parents extends Students {
    private String name;

    Parents(String name, String studentName) {
        super(studentName); // access the immediate parents constructor
        this.name = name;
    }

    void printParent() {
        System.out.println("Parent name is :" + name);
    }
}

class Teacher extends School{

    private String subject;
    Teacher(String subject){
        super.printSchoolName();
        this.subject = subject;
    }

    void printSubject(){
        System.out.println("Subject is :" + subject);
    }
}

public class Inheritance {    
    public static void main(String[] args) {
        Parents parent = new Parents("dad", "Raj");
        Teacher teacher = new Teacher("CAO");
        parent.printSchoolName();
        parent.printStudentName();
        parent.printParent();
        teacher.printSubject();
    }
}
