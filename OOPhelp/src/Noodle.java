/*
This is an example of Inheritance

In addition to access modifiers, there’s another way to establish how child classes can interact
with inherited parent class members: using the final keyword.
If we add final before a parent class method’s access modifier,
we disallow any child classes from changing that method. This is helpful in limiting bugs that
might occur from modifying a particular method.

Instructions
1.
Currently, Noodle has an ingredients attribute that its child class Ramen cannot access because it
has a private access modifier.

Change the access modifier for ingredients so that Ramen (not just any Java file in any package) can access it.


2.
Noodles has an isTasty() method that returns true because noodles are tasty. But if you check in the Ramen class,
you’ll see someone overrode isTasty() to return false! That person clearly doesn’t know food;
all noodles are definitely tasty.

Remove the method from Ramen and add a final keyword to isTasty() in Noodle so that nobody changes this
method in any other Noodle child class again.


 */

public class Noodle {

    private double lengthInCentimeters;
    private double widthInCentimeters;
    private String shape;
    protected String ingredients;
    private String texture = "brittle";

    Noodle(double lenInCent, double wthInCent, String shp, String ingr) {

        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;

    }

//    public boolean isTasty() {

//        return true;

//    }

    final public boolean isTasty() {
        return true;
    }

    public static void main(String[] args) {

        Ramen yasaiRamen = new Ramen();
        //System.out.println(yasaiRamen.ingredients);
        System.out.println(yasaiRamen.isTasty());

    }

}