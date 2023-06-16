public class Car {
    private String brand;
    
    public Car(String brand) {
        this.brand = brand;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
}

public class Main {
    public static void main(String[] args) {
        Car audi = new Car("Audi");
        Car bmw = new Car("BMW");
        Car mercedes = new Car("Mercedes");
        
        if (audi.getBrand().equals("Audi")) {
            System.out.println("To jest Audi");
        } else if (bmw.getBrand().equals("BMW")) {
            System.out.println("To jest BMW");
        } else if (mercedes.getBrand().equals("Mercedes")) {
            System.out.println("To jest Mercedes");
        } else {
            System.out.println("Nieznana marka samochodu");
        }
    }
}