class Noodle {

    protected double lengthInCentimeters;
    protected double widthInCentimeters;
    protected String shape;
    protected String ingredients;
    protected String texture = "brittle";

    Noodle(double lenInCent, double wthInCent, String shp, String ingr) {

        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;

    }

    public String getCookPrep() {
        return "Boil noodle for 7 minutes and add sauce.";
    }

    public void cook() {

        this.texture = "cooked";

    }

    /*
    1.
Declare and initialize an array of type Noodle called allTheNoodles with the following items:

spaghetti
ramen
pho

Stuck? Get a hint
2.
Loop through each noodle in allTheNoodles.

Call getCookPrep() on each noodle and print the result.
     */

    public static void main(String[] args) {
        Noodle spaghetti, ramen, pho;

        spaghetti = new Spaghetti();
        ramen = new Ramen();
        pho = new Pho();

        // Add your code below:

        Noodle[] allTheNoodles = {spaghetti, ramen, pho};

        for (Noodle noodle : allTheNoodles) {
            System.out.println(noodle.getCookPrep());
        }

    }
}