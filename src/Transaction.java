public abstract class Transaction {
//- Variable used to store the transaction value
    private double amount;
//- Transaction constructor that sets the amount
    Transaction(double val){
        amount = val;
    }
//- Setting the and returing the ammount in the transaction
    public void setAmount(double val){
        amount = val;
    }
    public double retAmount(){
        return amount;
    }
//- Abstract method that subclasses must implement to return
    public abstract double getAmount();
}
