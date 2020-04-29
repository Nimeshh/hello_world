/*
class Shape:
There are several terms you’ll encounter frequently:

Parent class, superclass, and base class refer to the class that another class inherits from (like Shape).
Child class, subclass, and derived class refer to a class that inherits from another class (like Triangle).

So how do we define a child class so that it inherits from a parent class? We use the keyword extends like this:

class Shape {

  // Shape class members

}

class Triangle extends Shape {

  // additional Triangle class members

}


########################
see the example below
########################

super() method acts like the parent constructor inside the child class constructor

1. Tab over to Pho.java and build a constructor for Pho.

Leave the constructor’s parameters blank. Inside the constructor, pass the following arguments in the following
order to super() — the constructor for Noodle:

A lengthInCentimeters of 30.0
A widthInCentimeters of 0.64
A shape of "flat"
ingredients of "rice flour"

2.
Tab back over to Noodle.java. Inside main(), instantiate a new Pho instance called phoChay.

Now print out phoChay‘s shape.

#Start of the program

class Noodle {

  double lengthInCentimeters;
  double widthInCentimeters;
  String shape;
  String ingredients;
  String texture = "brittle";

  Noodle(double lenInCent, double wthInCent, String shp, String ingr) {

    this.lengthInCentimeters = lenInCent;
    this.widthInCentimeters = wthInCent;
    this.shape = shp;
    this.ingredients = ingr;

  }

  public void cook() {

    this.texture = "cooked";

  }

  public static void main(String[] args) {
    Pho phoChay = new Pho();
    System.out.println(phoChay.shape);


  }

}


class Pho extends Noodle {
  Pho() {
    super(30.0, 0.64, "flat","rice flour");

  }


}

You may recall that Java class members use private and public access modifiers to determine whether
they can be accessed from outside the class. So does a child class inherit its parent’s private members?

Well, no. But there is another access modifier we can use to keep a parent class member accessible
to its child classes and to files in the package it’s contained in — and otherwise private: protected.

public is visible everywhere;
protected is visible in the class, the package, and child classes;
a member with no modifier is visible in the class and package;
private is visible only in the class itself

 */

public class OOPPractice {
}

