import java.util.*;
import java.Math.*;
public class buysellstock1 {
    public static void main(String [] args){
        int [] prices = {7,6,4,3,1};
        int maxprofit=0;
        int minsofar = prices[0];
        for(int i=0;i<prices.length;i++){
            minsofar=Math.min(minsofar,prices[i]);
            int profit = prices[i]-minsofar;
            maxprofit = Math.max(maxprofit,profit);
        }
        System.out.println(maxprofit);
    }
}
