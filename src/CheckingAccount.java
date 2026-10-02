import java.util.ArrayList;

public class CheckingAccount extends Account {

//- Array list of transactions that will store the accounts transactions
    ArrayList <Transaction> transactions = new ArrayList<Transaction>();

//- Method for when an account makes a withdraw
    public void makeWithdraw(Transaction t){
        transactions.add(t);
    }

//- Method for when an account makes a deposit
    public void makeDeposit(Transaction t){
        transactions.add(t);
    }
//-
    public CheckingAccount(int accountNumber, String firstName, String lastName, String address){
        super(accountNumber, firstName, lastName, address);
    }
//- string in html format using stringbuilder
    public String getReport(){
        return "Account Number: " + getAcctNum() + "\n" + getFName() + " " + getLName() + "\n" + getAddr();
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
