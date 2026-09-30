public class CheckingAccount extends Account {
    public CheckingAccount(int accountNumber, String firstName, String lastName, String address){
        super(accountNumber, firstName, lastName, address);
    }
        public String getReport(){
        return "Account Number: " + getAcctNum() + "\n" + getFName() + " " + getLName() + "\n" + getAddr();
    }
        @Override 
    public String getValue(){
        // March through the transactions adding up all the deposits and then subtracting the sum of withdrawls.
        return "x";
    }
}
