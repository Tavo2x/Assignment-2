public abstract class Transaction {
//- Variables
    private double amount;

    Transaction(int val){
        amount = val;
    }
//- Setting the and returing the ammount(get)
    public void setAmount(double val){
        amount = val;
    }
    public double retAmount(){
        return amount;
    }
// Abstract method that subclasses must implement 
    public abstract String getAmount();
}
