import java.util.ArrayList;


public class ForLoopArrayList {
    public static void main(String[] args){
        ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
        listOfNumbers.add(5);
        listOfNumbers.add(3);
        listOfNumbers.add(9);
        listOfNumbers.add(14);

        int total = 0;

        for (int i = 0; i < listOfNumbers.size(); i++){
            total = total + listOfNumbers.get(i);
        }
        System.out.println(total);

        ArrayList<Double> expenses = new ArrayList<Double>();
        expenses.add(74.46);
        expenses.add(63.99);
        expenses.add(10.57);
        expenses.add(81.37);

        double mostExpensive = 0;

        // Iterate over expenses
        //Inside the for-each loop, check if expense is greater than mostExpensive.
        //If it is, set mostExpensive equal to expense.
//        for each is like a for loop in python

        for (double expense : expenses){
            if (expense > mostExpensive){
                mostExpensive = expense;
            }

        }

        System.out.println(mostExpensive);
}
}
