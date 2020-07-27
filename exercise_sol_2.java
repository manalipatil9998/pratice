package exercise2;

class BankAcc {
    private String name;
    protected double balance;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void deposite(double amount) {
     this.balance += amount;
    }
   
    public boolean withdraw(double amount) {
        if (balance > amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}
class CurrentAcc extends BankAcc {
 public boolean withdraw(double amount) {
  balance -= amount;
  return true;
 }
}
class SavingsAcc extends BankAcc {

}
public class exercise_sol_2{
    public static void main(String[] args) {
        CurrentAcc c = new CurrentAcc();
        SavingsAcc s = new SavingsAcc();
        c.deposite(500.00);
        s.deposite(500.00);
        Withdrawal(c);    
        Withdrawal(s);   
    }

    public static void Withdrawal(BankAcc acc) {
        boolean result = acc.withdraw(1000.00);
        if (result) {
            System.out.println("Withdraw succeed.");
        } else {
            System.out.println("Withdraw failed.");
        }
    }
}