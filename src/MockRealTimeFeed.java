import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MockRealTimeFeed implements RealTimeFeed{
    private Map<String, Double> pricMap = new HashMap<>();
    public MockRealTimeFeed(String filepath){


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
    @Override 
    public double getVal(String symbol){
        return pricMap.get(symbol);
    }
}
