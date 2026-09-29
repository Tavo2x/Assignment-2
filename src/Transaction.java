public abstract class Transaction {
//- Variables
    private double amount;

    Transaction(int val){
        amount = val;
    }
//- Setting the amount
    public void setAmount(double val){
        amount = val;
    }
// Abstract method that subclasses must implement 
    public abstract String getAmount();
}
