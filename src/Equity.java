import java.util.ArrayList;

public class Equity extends Account{
//- Array list of stock purchase holding information after an acccount purchases a stock
//- RealTimeFeed that provides the stock information
    private ArrayList <StockPurchase> purchases = new ArrayList<StockPurchase>();
    private RealTimeFeed feed;  
//- Method called whenever an equity account makes a stock purchase
//- A purchase object is created and added to the StockPurchase ArrayList , holding the StockPurchase infomration
    public void purchaseStock(String companyName, String tickerSymbol, double pricePerShare, int numOfShares){
        purchases.add(new StockPurchase(companyName, tickerSymbol, numOfShares, pricePerShare));
    }
//- "This" is used in order to refere to the current object called
    public void setFeed(RealTimeFeed feed){
        this.feed = feed;
    }
//- Constructor for Equity account, super is called in order to access the parents class constructor
    public Equity(String accountNumber, String firstName, String lastName, String address){
        super(accountNumber, firstName, lastName, address);
    }
//- Returns a string showing the report of a Equity account stock purchases
//- Values are added to the string for example the account number, first and last name, and the address of the account
//- Then we loop through the purchases array adding the ticker symbol, number of shares, and the price per share of that stock purchase 
//- Then returning that string for each StockPurchase
    @Override
    public String getReport(){
        StringBuilder sb = new StringBuilder();
        sb.append(getAcctNum() + "\n");
        sb.append(getFName() + " " + getLName() + "\n");
        sb.append(getAddr() + "\n");
        for(StockPurchase p : purchases){
            sb.append(p.getTickerSymbol());
            sb.append(" ");
            sb.append(p.getNumberOfShares() + " shares");
            sb.append(" at $" + p.getPricePerShare());
            sb.append("\n");
        }
        return sb.toString();
    }
//- Looping through each purchases in ArrayList
//- Adding the amount of each purchases ammount then returning the value
    @Override 
    public double getValue(){
        double val = 0;
        for(StockPurchase s : purchases){
            double currentPrice = feed.getVal(s.getTickerSymbol());
            val += currentPrice * s.getNumberOfShares();
        }
        return val;
    }
}
