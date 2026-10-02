public class Deposit extends Transaction {
    public Deposit(double val){
        super(val);
    }
    @Override
    public double getAmount(){
        return  retAmount();
    }
}
