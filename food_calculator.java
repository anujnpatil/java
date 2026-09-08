// Food calculator for Zoo

class Animal{
    String name;
    double weight;

    Animal(String name, double weight){
        this.name = name;
        this.weight = weight;
    }
}

class Mammal extends Animal{
    double Food_req_per_kg;

    Mammal(String name, double weight, double Food_req_per_kg){
        super(name, weight);
        this.Food_req_per_kg = Food_req_per_kg;
    }
}

public class food_calculator {
    public static void main(String[]args){

        Mammal mammal1 = new Mammal("Lion", 200.0, 1.0);

        double food_required = mammal1.weight * mammal1.Food_req_per_kg;
        
        System.out.println("The " + mammal1.name + " requires " + food_required + " kg of food per day.");
    }
}
