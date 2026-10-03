import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Portfolio{
    private ArrayList <Account> accounts = new ArrayList<Account>();
    private RealTimeFeed feed;
//-
    public Portfolio(RealTimeFeed feed){
        this.feed = feed;
    }
//-
    public void addAccount(Account a){
        if (a instanceof Equity){
            ((Equity)a).setFeed(feed);
        }
        accounts.add(a);
    }
//-
    public double getTotalValue(){
        double acctVal = 0;
        for(Account a : accounts){
            acctVal += a.getValue();
        }
        return acctVal;
    }
//- 
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
