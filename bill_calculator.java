class Product{
    
    String productName;
    double price;
    int quantity;

    Product(String productName, double price, int quantity){

        this.productName = productName;
        this.price = price;
        this.quantity = quantity;

    }

}

public class bill_calculator {
    public static void main(String[] args){

        double total = 0.0;
        double highestcontribution = 0.0;
        String highestproduct = "";

        Product[] products = new Product[5];
        products[0] = new Product("Apple", 0.99, 3);
        products[1] = new Product("Banana", 0.59, 5);
        products[2] = new Product("Orange", 0.79, 2);
        products[3] = new Product("Grapes", 2.99, 1);
        products[4] = new Product("Mango", 1.49, 4);

        for (int i=0; i<5; i++){
            double contribution = products[i].price * products[i].quantity;
            total = total + contribution;

            if(contribution > highestcontribution){
                highestcontribution = contribution;
                highestproduct = products[i].productName;
            }
        }

        System.out.println("The total bill is: $" + total);
        System.out.println("The product with the highest contribution is: " + highestproduct + " with a contribution of $" + highestcontribution);

    }
}
