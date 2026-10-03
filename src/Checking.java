import java.util.ArrayList;

public class Checking extends Account {

//- Array list of transactions that will store the accounts transactions
    private ArrayList <Transaction> transactions = new ArrayList<Transaction>();

//- Method for when an account makes a withdraw
    public void withdraw(double amt){
        transactions.add(new Withdraw(amt));
    }
//- Method for when an account makes a deposit
    public void deposit(double amt){
        transactions.add(new Deposit(amt));
    }
//-
    public Checking(String accountNumber, String firstName, String lastName, String address){
        super(accountNumber, firstName, lastName, address);
    }
//- Shows the report of a checking cccount
    @Override
    public String getReport(){
        StringBuilder sb = new StringBuilder();
        sb.append(getAcctNum() + "\n");
        sb.append(getFName() + " " + getLName() + "\n");
        sb.append(getAddr() + "\n");
        for(Transaction t : transactions){
            if(t instanceof Deposit){
                sb.append("Deposit: ");
            }
            else{
                sb.append("Withdraw: ");
            }
            sb.append(t.retAmount() + "\n");
        }
        return sb.toString();
    }
// - Looping thorugh the number of transaction X account had to return the amount of that account
    @Override 
    public double getValue(){
        double value = 0;
        for(Transaction t : transactions){
            value += t.getAmount();
        }
        return value;
    }
}
