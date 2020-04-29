public class Book {
    boolean isAvailable;
    double price;
    String shipping;

    public Book(boolean availability, double billAmt, String shippingMethod) {
        if (billAmt > 25) System.out.println("Expensive books!!");

        isAvailable = availability;
        price = billAmt;
        shipping = shippingMethod;

    }

    public void ship() {
        if (isAvailable) {
            System.out.println("Preparing to ship");
            System.out.println("The shipping cost is " + shippingCost());
            System.out.println("Shipping cost using the switch statement is " + calculateShipping());
        }
        else System.out.println("Books not available");
    }

    public double shippingCost() {
        if (shipping == "Regular") return 0;
        else if (shipping == "Express") return 1.75;
        else return 0.5;
    }

    //use the switch statement instead

    public double calculateShipping() {
        double shippingCost;
        // declare switch statement here
        switch (shipping) {

            case "Regular":
                shippingCost = 0;
                break;
            case "Express":
                shippingCost = 1.75;
                break;
            default:
                shippingCost = .50;
        }

        return shippingCost;
    }

    public static void main(String[] args){
        Book history = new Book(true, 54, "Express");
        history.ship();

        Book Chemistry = new Book(false, 26, "Regular");
        Chemistry.ship();
    }
}
