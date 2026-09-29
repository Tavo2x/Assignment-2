public class EquityAccount extends Account{
//- 
    public EquityAccount(int accountNumber, String firstName, String lastName, String address){
        super(accountNumber, firstName, lastName, address);
    }
//- 
    @Override
    public String getReport(){
        return "Account Number: " + getAcctNum() + "\n" + getFName() + " " + getLName() + "\n" + getAddr();
    }
//- 
    @Override 
    public String getValue(){
        return "b";
    }
}
