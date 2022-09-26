package Models;

public class Car extends Vehicle{
    public String model;
    public Car(String brand, String model){
        super(brand);
        this.model = model;
    }
}
