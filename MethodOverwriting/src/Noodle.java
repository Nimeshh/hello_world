/*
INHERITANCE AND POLYMORPHISM
Method Overriding
One common use of polymorphism with Java classes is something we mentioned earlier — overriding parent class
methods in a child class. Like the + operator, we can give a single method slightly different meanings for different
classes. This is useful when we want our child class method to have the same name as a parent class method but behave
a bit differently in some way.

Let’s say we have a BankAccount class that allows us to print the current balance. We want to build a CheckingAccount
class that inherits the functionality of a BankAccount but with a modified printBalance() method.
We can do the following:

class BankAccount {

  protected double balance;

  public void printBalance() {
    System.out.println("Your account balance is $" + balance);
  }

}

class CheckingAccount extends BankAccount {

  @Override
  public void printBalance() {
    System.out.println("Your checking account balance is $" + balance);
  }

}
Notice that in order to properly override printBalance(), in CheckingAccount the method has the following in common
with the corresponding method in BankAccount:

Method name
Return type
Number and type of parameters
You may have also noticed the @Override keyword above printBalance() in CheckingAccount.
This annotation informs the compiler that we want to override a method in the parent class.
If the method doesn’t exist in the parent class, we’ll get a helpful error when we compile the program.


Instructions
1.
Noodle has a cook() method that involves boiling the noodle and changing the texture to "cooked".

The German noodle spätzle involves a slightly unconventional cooking procedure: grinding or scraping the dough into
the pot of boiling water.

In Spaetzle.java, override the inherited cook() method. Copy the original method body, but before "Boiling" gets
printed, add a new line to print "Grinding or scraping dough.".

Don’t forget to add @Override above the method to help with debugging.
 */

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

    public void cook() {

        System.out.println("Boiling.");

        this.texture = "cooked";

    }

    public static void main(String[] args) {

        Spaetzle kaesespaetzle = new Spaetzle();
        kaesespaetzle.cook();

    }

}
