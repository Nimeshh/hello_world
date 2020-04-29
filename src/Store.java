/*
Problem 1

public class Store {
    // instance fields


    //public is an access level modifier that allows
    //other classes to interact with this class. For now, all classes will be public


    String productType;
    int inventoryCount;
    double inventoryPrice;

    // constructor method
    public Store(String product, int count, double price) {
        productType = product;
        inventoryCount = count;
        inventoryPrice = price;
    }

    // advertise method, calling a method
    public void advertise() {
        System.out.println("Selling " + productType + "!");
        System.out.println("Come spend some money!");
    }

    // main method
    public static void main(String[] args) {
        Store lemonadeStand = new Store("lemonade", 42, .99);
        Store cookieShop = new Store("cookies", 12, 3.75);

        System.out.println("Our first shop sells " + lemonadeStand.productType + " at " + lemonadeStand.inventoryPrice + " per unit.");

        System.out.println("Our second shop has " + cookieShop.inventoryCount + " units remaining.");

        lemonadeStand.advertise();
    }
}

*/

/*
problem 2

1.
We have added a price instance field to the Store class.

However, to combat inflation costs, we’ve found ourselves increasing the price of our product over and over. We’ve added an empty increasePrice() method to the Store class. It takes a double parameter priceToAdd.

Inside of the increasePrice() method, create a variable called newPrice. Declare it to be a double, and set it equal to the price plus the priceToAdd.

2.
Inside of increasePrice(), set the instance field price to be newPrice!

3.
In the main() method, increase the price at the lemonade stand by 1.5. Then, print the lemonadeStand.price to see how it has changed!
 */

//start of problem 2

public class Store {
    // instance fields
    String productType;
    double price;

    // Constructor
    public Store(String product, double initialPrice) {
        productType = product;
        price = initialPrice;
    }

    // increase price method
    public void increasePrice(double priceToAdd){
        double newPrice = price + priceToAdd;
        price = newPrice;
    }

    //below method has a return type
    public int numberOfTires() {
        int tires = 4;
        return tires;
    }

    // main method
    public static void main(String[] args) {
        Store lemonadeStand = new Store("Lemonade", 3.75);
        lemonadeStand.increasePrice(1.5);
        System.out.println(lemonadeStand.price);
        System.out.println(lemonadeStand.numberOfTires());

        String name = "nimesh";
        String lname = "nimesh";
        System.out.println(name.equals(lname));

    }
}