public class EquityAccount extends Account{
//- Array list of stock purchase (CREAT THIS THINGYMAWOP)


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
        // Get its current value of that said stock . 
        // loop throuhg all stock prushace ask for the ticker symbol rthen pass though real time fgeed
        return "b";
    }
}
