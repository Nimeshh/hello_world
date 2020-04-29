/*
Instructions
1.
If you take a look at the Dinner class, you’ll see there’s a makeNoodles() method that accepts a Noodle object as
an argument.

In main(), instantiate a BiangBiang object as a Noodle called biangBiang.

Then call makeNoodles() on noodlesDinner with the following arguments:

biangBiang
"soy sauce and chili oil"
 */

class Dinner {

    private void makeNoodles(Noodle noodle, String sauce) {

        noodle.cook();
        // this invoked instance would set noodle.texture as cooked

        System.out.println("Mixing " + noodle.texture + " noodles made from " + noodle.ingredients + " with " + sauce + ".");
        System.out.println("Dinner is served!");

    }

    public static void main(String[] args) {

        Dinner noodlesDinner = new Dinner();
        // Add your code here:
        Noodle biangBiang = new BiangBiang();
        noodlesDinner.makeNoodles(biangBiang, "soy sauce and chili oil");

    }

}
