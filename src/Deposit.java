//- Deposit is a type of Transaction
public class Deposit extends Transaction {
//- Deposit constructor, super is used to to refer to the parents class constructor
    public Deposit(double val){
        super(val);
    }
//- Method used to return the Deposit amount
    @Override
    public double getAmount(){
        return  retAmount();
    }
}
