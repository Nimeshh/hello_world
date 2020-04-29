public class LogicalNot {
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;

    public LogicalNot(int count, int capacity, boolean open) {
        if (count < 1 || count > 8) {
            System.out.println("Invalid Reservation!");
        }
        guestCount = count;
        restaurantCapacity = capacity;
        isRestaurantOpen = open;
    }

    public void confirmLogicalNot() {
        if (restaurantCapacity >= guestCount && isRestaurantOpen) {
            System.out.println("Reservation confirmed");
            isConfirmed = true;
        } else {
            System.out.println("Reservation denied");
            isConfirmed = false;
        }
    }

    public void informUser() {
        // Write conditional here
        //if the second instance of the class is true, the first logical will be false, and since if statement
//        only returns the value if it's true, it will go to the else loop and reservation confirmed will be printed
        if (!isConfirmed) System.out.println("Unable to confirm Reservation, please contact restaurant.");

        else System.out.println("Please enjoy your meal!");

    }

    public static void main(String[] args) {
        LogicalNot partyOfThree = new LogicalNot(3, 12, true);
        LogicalNot partyOfFour = new LogicalNot(4, 3, true);
        partyOfThree.confirmLogicalNot();
        partyOfThree.informUser();
        partyOfFour.confirmLogicalNot();
        partyOfFour.informUser();
    }
}