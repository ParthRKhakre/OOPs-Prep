package Relationships;

class Passport{
    private String passportNumber;
    Passport(String passportNumber){
        this.passportNumber = passportNumber;
    }

    public String getpassportNumber(){
        return passportNumber;
    }
}

class Student{
    private String name;
    private Passport passport;

    Student(String name,Passport passport){
        this.name = name;
        this.passport = passport;
    }

    public void displayDetails(){
        System.out.println("Student name: " + name );
        System.out.println("Passport number : " + passport.getpassportNumber());
    }
}


public class One_to_One_Association {
    public static void main(String[] args) {

        // students is using passport (one to one)
        Passport passport = new Passport("6743267324");
        Student student = new Student("Parth", passport);
        student.displayDetails();        
    }
}
