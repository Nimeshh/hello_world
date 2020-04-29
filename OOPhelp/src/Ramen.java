public class Ramen extends Noodle {

    Ramen() {
//super calls the constructor from the parent class

        super(30.0, 0.3, "flat", "wheat flour");

    }
//override below is voided, as Noodle class used final access modifier for isTasty()
//    public boolean isTasty() {

//        return false;

//    }

}