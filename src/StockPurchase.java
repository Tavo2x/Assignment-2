public class StockPurchase {
//- Varriables
    private String compName;
    private String tkrSym;
    private int qty; // Number of shares at the purchase price
    private int PPS; // Price Per Share
//- StockPurchase constructor
    public StockPurchase(String companyName, String tickerSymbol, int numOfShares, int pricePerShare){
        compName = companyName;
        tkrSym = tickerSymbol;
        qty = numOfShares;
        PPS = pricePerShare;
    }
//- Setting the company name & returing the company name
    public void setCompanyName(String companyName){
        compName = companyName;
    }
    public String getCompanyName(){
        return compName;
    }
//- Setting the ticker symbol & returing the ticker symbol
    public void setTickerSymbol(String tickerSymbol){
        tkrSym = tickerSymbol;
    }
    public String getTickerSymbol(){
        return tkrSym;
    }
//- Setting the number of shares & returing the number of shares
    public void setNumberOfShares(int numOfShares){
        qty = numOfShares;
    }
    public int getNumberOfShares(){
        return qty;
    }
//- Setting the price per share number & returing the price per share number
    public void pricePerShare(int pricePerShare){
        PPS = pricePerShare;
    }
    public int pricePerShare(){
        return  PPS;
    }
}
