import java.util.ArrayList;

public class Checking extends Account {
    
//- Array list of transactions that will store the accounts transactions
    private ArrayList <Transaction> transactions = new ArrayList<Transaction>();

//- Method for when an account makes a withdraw
//- A Transaction object is created and added to the array list, holding the ammount the Account is intedning to withdraw
    public void withdraw(double amt){
        transactions.add(new Withdraw(amt));
    }
//- Method for when an account makes a deposit
//- A Transaction object is created and added to the array list, holding the amount the Account is intedning to deposit
    public void deposit(double amt){
        transactions.add(new Deposit(amt));
    }
//- Constructor for Checking account, super is called in order to access the parents class constructor
    public Checking(String accountNumber, String firstName, String lastName, String address){
        super(accountNumber, firstName, lastName, address);
    }
//- Returns a string showing the report of a checking account transactions
//- Values are added to the string for example the account number, first and last name, and the address of the account
//- Then we loop through the Transaction array and depending if it was a deposit or withdraw is the text you'l see before 
//- Seeing the amount the account withdrew or deposited
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
//- Looping through each transaction in the ArrayList
//- Adding the amount of each transactions amount then returning the value
    @Override 
    public double getValue(){
        double value = 0;
        for(Transaction t : transactions){
            value += t.getAmount();
        }
        return value;
    }
}
