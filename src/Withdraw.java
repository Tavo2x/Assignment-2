public class Withdraw extends Transaction{
    public Withdraw(double val){
        super(val);
    }
    @Override 
    public double getAmount(){
        return -retAmount();
    }
}
