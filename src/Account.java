public abstract class Account {
//- Variables
    private int acctNo;
    private String FN;
    private String LN;
    private String addr;
//-Account constructor
    public Account(int accountNumber, String firstName, String lastName, String address){
        acctNo = accountNumber;
        FN = firstName;
        LN = lastName;
        addr = address;
    }
//- Setting the account number & returing the account number
    public void setAcctNum(int num){
        acctNo = num;
    }
    public int getAcctNum(){
        return  acctNo;
    }
//- Setting the first name & returing the first name
    public void setFName(String firstName){
        FN = firstName;   
    }
    public String getFName(){
        return FN;
    }
//- Setting the last name & returing the last name
    public void setLname(String lastName){
        LN = lastName;
    }
    public String getLName(){
        return LN;
    }
//- Setting the address & returing the addres
    public void setAddr(String address){
        addr = address;
    }
    public String getAddr(){
        return  addr;
    }
    public abstract String getReport();
    public abstract String getValue();
}
