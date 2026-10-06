import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MockRealTimeFeed implements RealTimeFeed{
//- Variable used to store key-value pairs (Symbol and Price of a stock purchased)
    private Map<String, Double> pricMap = new HashMap<>();
    public MockRealTimeFeed(String filepath){
//- This method is inteded to open the equities.txt file which stores the dummy stocks
//- If opened it stores the first text as the symbol, and the next text as the price
//- Then palces those vlaues on the map. 
//- Then closes that text file.
//- If it fails to open, an exception is shown stating so
    try{    
        Scanner fileOpen = new Scanner(new File(filepath));   
        while(fileOpen.hasNext()){
            String symbol = fileOpen.next();
            double price = fileOpen.nextDouble();
            pricMap.put(symbol, price);
    }
    fileOpen.close();

    }
    catch(FileNotFoundException e){
        System.out.println("Could not find file " + filepath);
    }

}
//- Method is inteded to only retrieve the price values found in the map
    @Override 
    public double getVal(String symbol){
        return pricMap.get(symbol);
    }
}
