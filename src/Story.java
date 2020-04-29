public class Story {
    // instance fields
    String productType;
    double price;

    // constructor method
    public Story(String product, double initialPrice) {
        productType = product;
        price = initialPrice;
    }

    // increase price method
    public void increasePrice(double priceToAdd){
        double newPrice = price + priceToAdd;
        price = newPrice;
    }

    // get price with tax method
    public double getPriceWithTax(){
        double tax = 0.08;
        double totalPrice = price + price*tax;
        return totalPrice;
    }

    // main method
    public static void main(String[] args) {
        Story lemonadeStand = new Story("Lemonade", 3.75);
        Story cookieShop = new Story("Cookies", 5);

        System.out.println(lemonadeStand);
        System.out.println(cookieShop);

    }
//when toString() is not defined, two print statement in the main method only prints the memory location

    public String toString(){
        //return "story";
        //return story prints two story in the print statement in the main method
        return "This Store sells " + productType + " at a price of " + price + ".";

    }
}