import java.util.ArrayList;

public class Equity extends Account{
//- Array list of stock purchase
    private ArrayList <StockPurchase> purchases = new ArrayList<StockPurchase>();
    private RealTimeFeed feed;  
//- Method called whenever an equity account makes a stock purchase
    public void purchaseStock(String companyName, String tickerSymbol, double pricePerShare, int numOfShares){
        purchases.add(new StockPurchase(companyName, tickerSymbol, numOfShares, pricePerShare));
    }
//-
    public void setFeed(RealTimeFeed feed){
        this.feed = feed;
    }
//- 
    public Equity(String accountNumber, String firstName, String lastName, String address){
        super(accountNumber, firstName, lastName, address);
    }
//- Shows the report of the equtiy acccounts
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
//- 
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
