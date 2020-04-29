public class SavingAccount {
    double balance;

    public SavingAccount(double initialBalance){
        balance = initialBalance;
    }

    public static void main(String[] args){
        SavingAccount Chase = new SavingAccount(500);

        System.out.println("The opening balance is $" + Chase.balance);

        double deposit = 400;

        Chase.balance += deposit;


        System.out.println("The new balance is $" + Chase.balance);

        double withDrawl = 300;

        Chase.balance -= withDrawl;

        System.out.println("The balance after withdrawl is $" +Chase.balance);
    }
}

//savings account using methods:

/*public class SavingsAccount {

  int balance;

  public SavingsAccount(int initialBalance){
    balance = initialBalance;
  }

  public void checkBalance(){
    System.out.println("Hello!");
    System.out.println("Your balance is "+balance);
  }

  public void deposit(int amountToDeposit){
    balance += amountToDeposit;
  }

  public int withdraw(int amountToWithdraw){
    balance -= amountToWithdraw;
    return amountToWithdraw;
  }

  public static void main(String[] args){
    SavingsAccount savings = new SavingsAccount(2000);

    savings.checkBalance();
    savings.deposit(33);
    System.out.println("Your balance is "+savings.balance);
    savings.withdraw(3);
    System.out.println("Your balance is "+savings.balance);
}
}
 */
