class Vehicle{
    String Brand;
    double Speed;
    Vehicle(String Brand, double Speed){
        this.Brand = Brand;
        this.Speed = Speed;
    }
}

class Car extends Vehicle{
    double fuelConsumption;
    Car(String Brand, double Speed, double fuelConsumption){
        super(Brand, Speed);
        this.fuelConsumption = fuelConsumption;
    }
}

public class fuel_calc {
    public static void main(String[]args){

        int distance = 200;
        double fuelReq;
        Car car1 = new Car("Toyota", 140, 9);

        fuelReq = distance*car1.fuelConsumption;

        System.out.println(car1.Brand + " is running at the speed of " + car1.Speed + " and requires " + fuelReq + " fuel");

    }    
}
