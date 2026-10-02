public class Deposit extends Transaction {
    public Deposit(int val){
        super(val);
    }
    @Override
    public double getAmount(){
        return  retAmount();
    }
}
