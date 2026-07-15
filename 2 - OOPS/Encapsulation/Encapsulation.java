class Employee{
    public String name;
    private String ID;

    Employee(String name,String ID){
        this.ID = ID;
        this.name = name;
    }
}

public class Encapsulation{
    public static void main(String[] args) {
        Employee employee = new Employee("Raj", "92");
        System.out.println(employee.name);
    }
}