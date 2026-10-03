public class Driver {
    public static void main(String[] args) {
        //create the RealTimeFeed from the mock data file
        //make sure this is a full path to the file
        String equitiesFilePath = "/path/to/file/equities.txt";
        RealTimeFeed realTimeFeed = new MockRealTimeFeed(equitiesFilePath);

        // Create a Portfolio to hold all accounts
        Portfolio portfolio = new Portfolio(realTimeFeed);

        // Create Account 1: A Checking Account
        Checking checkingAccount = new Checking("CHK-001", "John", "Smith", "123 Main Street, Springfield, IL 62701");
        checkingAccount.deposit(5000.00);
        checkingAccount.withdraw(150.00);
        checkingAccount.deposit(1200.00);
        checkingAccount.withdraw(75.50);

        // Create Account 2: An Equity Account
        Equity equityAccount1 = new Equity("EQT-001", "Jane", "Doe", "456 Oak Avenue, Chicago, IL 60601");
        equityAccount1.purchaseStock("Microsoft", "MSFT", 100.00, 50);
        equityAccount1.purchaseStock("Google", "GOOG", 200.00, 25);

        // Create Account 3: Another Equity Account
        Equity equityAccount2 = new Equity("EQT-002", "Bob", "Johnson", "789 Pine Road, Naperville, IL 60540");
        equityAccount2.purchaseStock("General Electric", "GE", 10.00, 100);
        equityAccount2.purchaseStock("Microsoft", "MSFT", 110.00, 30);

        // Add all accounts to the portfolio
        portfolio.addAccount(checkingAccount);
        portfolio.addAccount(equityAccount1);
        portfolio.addAccount(equityAccount2);

        // Generate the HTML report (sorted from most to least valuable)
        portfolio.generateReport("portfolioReport.html");

        System.out.println("Report generated: portfolioReport.html");

    }
}