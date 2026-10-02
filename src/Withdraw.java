public class Withdraw extends Transaction{
    public Withdraw(int val){
        super(val);
    }
    @Override 
    public double getAmount(){
        return -retAmount();
    }
}
