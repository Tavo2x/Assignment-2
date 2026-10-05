import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Portfolio{
//- ArrayList of Accounts that will store the accounts created
//- RealTimeFeed that will provide the stock information
    private ArrayList <Account> accounts = new ArrayList<Account>();
    private RealTimeFeed feed;
//- Portfolio constructor that takes in and stores the RealTimeFeed
//  "This" is used in order to refer to the current object to call
    public Portfolio(RealTimeFeed feed){
        this.feed = feed;
    }
//- Method is used in cases an Equity Account is created to use the RealTimeFeed retrieving the stock information
//- Which is then added to the ArrayList holding the Accounts
    public void addAccount(Account a){
        if (a instanceof Equity){
            ((Equity)a).setFeed(feed);
        }
        accounts.add(a);
    }
//- Looping through the ArrayList of Accounts to retrive then return the total value of all accounts
    public double getTotalValue(){
        double acctVal = 0;
        for(Account a : accounts){
            acctVal += a.getValue();
        }
        return acctVal;
    }
//- A Portfolio report is generated
//- ArrayList named sorted holds the accounts in a sorted matter comparing one account vs the other by their totla value
//- In the try block; We write out to a file, in HTML format, and show the accounts by sorted order
    public void generateReport (String fileName){
        ArrayList <Account> sorted = new ArrayList<Account>(accounts);
        sorted.sort((x,y) -> Double.compare(y.getValue(), x.getValue()));
        try{
            PrintWriter outPut = new PrintWriter(new FileWriter(fileName));
            outPut.println("<html><body>");
            outPut.println("<h1>Portfolio Report</h1>");
            for(Account a : sorted){
                outPut.println("<pre>");
                outPut.println(a.getReport());
                outPut.println("</pre>");
            }
            outPut.println("<p> Total Value of account: " + getTotalValue() + "</p>");
            outPut.println("</body></html>");
            outPut.close();
        }
        catch(IOException e){
            System.out.println("Error");
        }
    }
 }
