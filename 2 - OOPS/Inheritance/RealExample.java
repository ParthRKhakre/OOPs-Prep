package Inheritance;

class Product{
    private String name;
    private String category;
    private double price;

    Product(String name,String category,double price){
        this.name = name;
        this.category = category;
        this.price = price;
    }

    void displayDetails(){
        System.out.println("name: " + name);
        System.out.println("price: " + price);
        System.out.println("category: "+category);
    }
}

class Electronics extends Product{

    private int warrenty;
    private String brand;

    Electronics(int warrenty,String brand,String name,double price){
        super(name,"Electronics",price);
        this.warrenty = warrenty;
        this.brand = brand;
    }

    void details(){
        super.displayDetails();
        System.out.println("warrenty: " + warrenty);
        System.out.println("brand: " + brand);
    }
}

class Tshirt extends Product{
    private String size;
    private String color;

    Tshirt(String size,String color,String name,double price){
        super(name,"Tshirt",price);
        this.color = color;
        this.size = size;
    }

    void displayDetails(){
        System.out.println("size" + size);
        System.out.println("color" + color);
    }
}

class RealExample{
    public static void main(String[] args) {
        Electronics electronics = new Electronics(2, "Apple","TV",678237.3231);
        electronics.details();
    }
}