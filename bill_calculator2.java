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

public class bill_calculator2 {
    public static void main(String[]args){
        double total = 0.0;
        double lowestContribution = 0;
        int lowestIndex = 0;

        Product[] products = new Product[4];
        products[0] = new Product("Apple", 0.99, 3);
        products[1] = new Product("Banana", 0.59, 5);
        products[2] = new Product("Orange", 0.79, 2);
        products[3] = new Product("Grapes", 2.99, 1);

        for(int i=0; i<4; i++){
            double contribution = products[i].price * products[i].quantity;
            total = total + contribution;

            if(i==0){
                lowestContribution = contribution;
            } else if(contribution < lowestContribution){
                lowestContribution = contribution;
                lowestIndex = i;
            }

        }
        System.out.println("The total bill is: $" + total);
        System.out.println("The product with the lowest contribution is: " + products[lowestIndex].productName + " with a contribution of $" + lowestContribution);
    }
    
}
