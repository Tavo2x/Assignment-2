//- Withdraw is a type of Transaction
public class Withdraw extends Transaction{
//- Withdraw consturctor, super is used to refer to the parents class constructor
    public Withdraw(double val){
        super(val);
    }
//- Method used to return the Withdraw ammount
    @Override 
    public double getAmount(){
        return -retAmount();
    }
}
